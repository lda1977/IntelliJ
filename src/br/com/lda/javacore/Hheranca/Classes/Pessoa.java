package br.com.lda.javacore.Hheranca.Classes;

public class Pessoa {
    private String nome;
    private String cpf;
    /* Herança */
    private Endereco endereco;

    public void print() {
        System.out.println("Nome " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endeceço: " + this.endereco.getRua());
    }

    /***********
     * Metodos Set
     * *******/
    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public void setCpf(String cpfP) {
        this.cpf = cpfP;
    }

    public void setEndereco(Endereco enderecoP) {
        this.endereco = enderecoP;
    }

    /*********
     * Metodos Get
     * *******/
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
