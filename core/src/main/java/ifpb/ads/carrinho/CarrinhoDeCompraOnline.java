package ifpb.ads.carrinho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/07/2017, 07:23:43
 */
@Stateful
@Remote(Carrinho.class)
//TODO: usar!
//@javax.ejb.AccessTimeout(unit = TimeUnit.MICROSECONDS,value = 14)
public class CarrinhoDeCompraOnline implements Carrinho {

    private List<String> produtos = new ArrayList<>();

    @Override
    public void adicionarProduto(String produto) {
        if (produto == null) {
            throw new IllegalArgumentException("");
        }
        this.produtos.add(produto);
    }

    @Override
    public void removerProduto(String produto) {
        this.produtos.remove(produto);
    }

    @Override
    public List<String> todosOsProdutos() {
        return Collections.unmodifiableList(produtos);
        //carrinho.todosOsProdutos().add()
    }

    @Remove
    @Override
    public void finalizarCarrinho() {
        this.produtos.forEach(System.out::println);
        this.produtos = new ArrayList<>();
    }

}
