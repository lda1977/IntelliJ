package br.com.lda.javacore.Hheranca.Classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    /* Herança */
    protected Endereco endereco;


    public Pessoa(String nome) {
        System.out.println("Dentro do construtor pessoas");
        this.nome = nome;
    }

    static {
        System.out.println("Dentro do bloco de inicialização STATIC de pessoa ");
    }

    {
        System.out.println("Bloco de inicialização 1 de pessoa ");
    }

    {
        System.out.println("Bloco de inicialização 2 de pessoa");
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

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
