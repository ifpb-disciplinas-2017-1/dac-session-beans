package ifpb.ads.infra;

import ifpb.ads.cliente.Cliente;
import ifpb.ads.cliente.Clientes;
import ifpb.ads.cliente.cpf.CPF;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 08/06/2017, 08:23:14
 */
@Stateless
@Local(Clientes.class)
public class ClientesJDBC implements Clientes {

    private Connection connection;

    @PostConstruct
    public void initConnection() {
        try {
//            String url = "jdbc:postgresql://localhost:5432/cliente";
            String url = "jdbc:postgresql://host-banco:5432/cliente";
            String senha = "12345";
            String usuario = "postgres";
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(ClientesJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void salvar(Cliente cliente) {
        try {
            String sql = "INSERT INTO cliente(nome, cpf) VALUES(?,?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCpf().formatado());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @PreDestroy
    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void remover(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> todosOsClientes() {
        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement statement = connection.prepareStatement(sql);
            return percorrer(statement.executeQuery());
        } catch (SQLException ex) {
            Logger.getLogger(ClientesJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    private List<Cliente> percorrer(ResultSet result) {
        List<Cliente> pessoas = new ArrayList<>();
        try {
            while (result.next()) {
                pessoas.add(
                        new Cliente(result.getString("nome"),
                                result.getInt("id"),
                                new CPF(result.getString("cpf"))));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientesJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pessoas;
    }
}
