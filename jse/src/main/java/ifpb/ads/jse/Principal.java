package ifpb.ads.jse;

import ifpb.ads.chat.Chat;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/07/2017, 09:19:15
 */
public class Principal {

    public static void main(String[] args) {
//          Portable JNDI names for EJB CarrinhoDeCompraOnline: [java:global/core-1.0-SNAPSHOT/CarrinhoDeCompraOnline, java:global/core-1.0-SNAPSHOT/CarrinhoDeCompraOnline!ifpb.ads.carrinho.Carrinho]
//        Carrinho carrinho = new ServiceLocator()
//                .lookup("java:global/core/CarrinhoDeCompraOnline");
//
//        carrinho.adicionarProduto("TV");
//        carrinho.adicionarProduto("PC");
//        carrinho.adicionarProduto("Lapis");
//
//        carrinho.removerProduto("TV");
//
//        carrinho.finalizarCarrinho();

//  Portable JNDI names for EJB SalaDeBatePapo: [java:global/core/SalaDeBatePapo, java:global/core/SalaDeBatePapo!ifpb.ads.chat.Chat]|#]
        Chat chat = new ServiceLocator()
                .lookup("java:global/core/SalaDeBatePapo");

        chat.addMensagem("oi");
        chat.addMensagem("oi");
        chat.addMensagem("oi");
        chat.addMensagem("não sou um robô!");

        chat.historico().forEach(System.out::println);

    }
}
