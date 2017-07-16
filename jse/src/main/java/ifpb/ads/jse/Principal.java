package ifpb.ads.jse;

import ifpb.ads.carrinho.Carrinho;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/07/2017, 09:19:15
 */
public class Principal {

    public static void main(String[] args) {
//          Portable JNDI names for EJB CarrinhoDeCompraOnline: [java:global/core-1.0-SNAPSHOT/CarrinhoDeCompraOnline, java:global/core-1.0-SNAPSHOT/CarrinhoDeCompraOnline!ifpb.ads.carrinho.Carrinho]
        Carrinho carrinho = new ServiceLocator()
                .lookup("java:global/core/CarrinhoDeCompraOnline");

        carrinho.adicionarProduto("TV");
        carrinho.adicionarProduto("PC");
        carrinho.adicionarProduto("Lapis");

        carrinho.removerProduto("TV");

        carrinho.finalizarCarrinho();
    }
}
