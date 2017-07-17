package ifpb.ads.chat;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 17/07/2017, 07:26:58
 */
@Singleton
@Startup
@Remote(Chat.class)
//@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class SalaDeBatePapo implements Chat {

    private List<String> mensagens = new CopyOnWriteArrayList<>();

    @Lock(LockType.WRITE)
    @Override
    public void addMensagem(String msg) {
//        synchronized (mensagens) {
            this.mensagens.add(msg);
//        }
    }

    @Lock(LockType.READ)
    @Override
    public List<String> historico() {
        return Collections.unmodifiableList(mensagens);
    }
}
