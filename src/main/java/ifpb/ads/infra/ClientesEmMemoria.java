package ifpb.ads.infra;

import ifpb.ads.cliente.Cliente;
import ifpb.ads.cliente.Clientes;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 08/06/2017, 08:20:26
 */
public class ClientesEmMemoria implements Clientes {

    private List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) {
        cliente.setId(clientes.size() + 1);
        this.clientes.add(cliente);
    }

    public void remover(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void atualizar(Cliente cliente) {
        for (Cliente cli : clientes) {
            if (cli.getId() == cliente.getId()) {
                cli.setNome(cliente.getNome());
                break;
            }
        }
    }

    public List<Cliente> todosOsClientes() {
        return this.clientes;
    }
}
