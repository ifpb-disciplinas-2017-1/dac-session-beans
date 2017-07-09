package ifpb.ads.cliente;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/06/2017, 16:14:04
 */
@Named
@SessionScoped
public class ControllerCliente implements Serializable { //controllerCliente

    private Cliente cliente = new Cliente();
    private ClienteService service = new ClienteService();

    private boolean editando = false;

    public String salvarCliente() {
        this.service.salvar(cliente);
        this.cliente = new Cliente();
        return null;
    }

    public String removerCliente(Cliente clienteRemover) {
        this.service.remover(clienteRemover);
        return null;
    }

    public String atualizar() {
        this.service.atualizar(cliente);
        this.cliente = new Cliente();
        this.editando = false;
        return null;
    }

    public String editarCliente(Cliente clienteAtualizar) {
        this.cliente = clienteAtualizar;
        this.editando = true;
        return null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getTodosOsClientes() { //List<Cliente> todosOsClientes;
        return this.service.todosOsClientes();
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }

}
