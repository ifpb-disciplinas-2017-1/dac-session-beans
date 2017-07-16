package ifpb.ads.cliente.cpf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/06/2017, 09:26:42
 */
@FacesConverter("converter.CpfConverter")
public class CPFConverter implements Converter {

    @Override
    public Object getAsObject(
            FacesContext context,
            UIComponent component,
            String value) {
        if (value == null) {
            return new CPFBuilder().setValor("").createCPF();
        }
        return new CPFBuilder().setValor(value).createCPF();
    }

    @Override
    public String getAsString(
            FacesContext context,
            UIComponent component,
            Object value) {
        if (value == null) {
            return "";
        }
        CPF cpf = (CPF) value;
        return cpf.getValor();
    }

}
