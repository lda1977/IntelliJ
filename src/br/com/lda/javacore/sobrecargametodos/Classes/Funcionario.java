package br.com.lda.javacore.sobrecargametodos.Classes;

public class Funcionario {
    /* Atributos */
    private String nome;
    private String cpf;
    private double salario;
    /* Novo Atributo para forçar a sobrecarga */
    private String rg;

    /* Construtor */
    public Funcionario(String nomeC){
        this.nome = nomeC;
    }

    public void chamaInicio(String nomeC, String cpfC, double salarioC) {
        this.nome = nomeC;
        this.cpf = cpfC;
        this.salario = salarioC;
    }

    /* Sobrecarga de Metodos onde os parametos devem ser diferentes */
    public void chamaInicio(String nomeC, String cpfC, double salarioC, String rgC) {
        /* Aqui esta a sobrecarga */
        chamaInicio(nomeC, cpfC, salarioC);
        this.rg = rgC;


    }

    /* Metodo somente para impressao do conteudo das variaveis */
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    /* Metodos de acesso Set and Get  para manter alto acoplamento */
    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public void setCpf(String cpfP) {
        this.cpf = cpfP;
    }

    public void setSalario(double salarioP) {
        this.salario = salarioP;
    }

    public void setRg(String rgP) {
        this.rg = rgP;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getRg() {
        return this.rg;
    }
}
