package ifpb.ads.carrinho;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/07/2017, 07:35:18
 */
@Named
@SessionScoped
//@RequestScoped
public class ControllerCarrinho implements Serializable {

    private String produto;
    @EJB
//    @Inject
    private Carrinho carrinho;

    public String add() {
        this.carrinho.adicionarProduto(produto);
        this.produto = "";
        return null;
    }

    public void finalizar() {
        this.carrinho.finalizarCarrinho();
        logout();
//        return "carrinho?faces-redirect=true";
    }

    public String remove(String produto) {
        this.carrinho.removerProduto(produto);
        return null;
    }

    public List<String> getTodosOsProdutos() {
        return this.carrinho.todosOsProdutos();
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    private void logout() {
        ExternalContext context = FacesContext.getCurrentInstance()
                .getExternalContext();
        HttpSession session = (HttpSession) context.getSession(true);
        session.invalidate();
        try {
            context.redirect("carrinho.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(ControllerCarrinho.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
