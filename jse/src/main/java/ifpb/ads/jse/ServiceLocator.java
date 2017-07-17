package ifpb.ads.jse;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 13/07/2017, 09:24:13
 */
public class ServiceLocator {

    public <T> T lookup(String resource) {
        try {
            Properties properties = new Properties();
            properties.put(InitialContext.INITIAL_CONTEXT_FACTORY,
                    "com.sun.enterprise.naming.SerialInitContextFactory");
            properties.setProperty("org.omg.CORBA.ORBInitialHost", "host-core");
            properties.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            InitialContext context = new InitialContext(properties);
//            NamingEnumeration<NameClassPair> list = context.list("");
//            while (list.hasMore()) {
//                System.out.println(list.next().getName());
//            }
            return (T) context.lookup(resource);
        } catch (NamingException ex) {
            Logger.getLogger(ServiceLocator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
