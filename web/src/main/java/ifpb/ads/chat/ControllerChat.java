package ifpb.ads.chat;

import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/07/2017, 07:39:13
 */
@Named
@RequestScoped
public class ControllerChat {

//    @Inject
    @EJB
    private Chat chat;

    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String enviar() {
        this.chat.addMensagem(mensagem);
        this.mensagem = "";
        return null;
    }
    
    public List<String> historico(){
        return this.chat.historico();
    }
}
