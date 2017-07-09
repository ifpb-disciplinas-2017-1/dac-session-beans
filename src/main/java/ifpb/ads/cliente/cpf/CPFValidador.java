package ifpb.ads.cliente.cpf;

import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 06/06/2017, 10:15:56
 */
@FacesValidator("validador.CPFValidador")
public class CPFValidador implements Validator {

    @Override
    public void validate(
            FacesContext context, 
            UIComponent component, 
            Object value) throws ValidatorException {


        CPF cpf = (CPF) value;
        
        if(!cpf.isValid()){
            FacesMessage message = new FacesMessage("CPF inválido. Tamanho incorreto!");
            FacesMessage message2 = new FacesMessage("CPF inválido. Valor incorreto");
            List<FacesMessage> list = Arrays.asList(message,message2);
            throw  new ValidatorException(list);
        }
     
    }
}
