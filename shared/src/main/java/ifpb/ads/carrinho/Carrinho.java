package ifpb.ads.carrinho;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/07/2017, 07:20:20
 */
public interface Carrinho {

    public void adicionarProduto(String produto);

    public void removerProduto(String produto);

    public List<String> todosOsProdutos();

    public void finalizarCarrinho();
}
