package ifpb.ads.chat;

import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/07/2017, 08:11:56
 */
public interface Chat {

    public void addMensagem(String msg);

    public List<String> historico();

}
