package ifpb.ads.cliente;

import ifpb.ads.cliente.cpf.CPF;
import ifpb.ads.cliente.cpf.CPFBuilder;
import ifpb.ads.cliente.email.Email;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 07/06/2017, 16:53:39
 */
public class Cliente implements Serializable{

    private String nome;
    private CPF cpf = new CPFBuilder().createCPF();
    private int id;
    private LocalDate nascimento;
    private List<Email> emails = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    
}
