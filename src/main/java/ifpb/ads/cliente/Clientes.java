package ifpb.ads.cliente;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 08/06/2017, 08:20:26
 */
public interface Clientes {

    public void salvar(Cliente cliente);

    public void remover(Cliente cliente);

    public void atualizar(Cliente cliente);

    public List<Cliente> todosOsClientes();
}
