package ifpb.ads.cliente;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/06/2017, 16:57:08
 */
@Stateless
// Local View
public class ClienteService {

    @EJB
    private Clientes clientes;// = new ClientesJDBC();

    public void salvar(Cliente cliente) {
        
        this.clientes.salvar(cliente);
    }

    public void remover(Cliente cliente) {
        this.clientes.remover(cliente);
    }

    public void atualizar(Cliente cliente) {
        this.clientes.atualizar(cliente);
    }

    public List<Cliente> todosOsClientes() {
        return this.clientes.todosOsClientes();
    }
}
