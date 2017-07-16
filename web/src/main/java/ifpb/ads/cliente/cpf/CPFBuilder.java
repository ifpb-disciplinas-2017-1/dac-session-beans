package ifpb.ads.cliente.cpf;

public class CPFBuilder {
    private String valor;

    public CPFBuilder setValor(String valor) {
        this.valor = valor;
        return this;
    }

    public CPF createCPF() {
        return new CPF(valor);
    }
}