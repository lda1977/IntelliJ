package br.com.lda.javacore.Gassociacao.Classes;

public class Aluno {
    private String nome;
    private int idade;

    /* Relacionamento entre class */
    private Seminario seminario;

    /**************
     * Construtores
     * ************/
    public Aluno(String nomeP, int idadeP) {
        this.nome = nomeP;
        this.idade = idadeP;
    }

    public Aluno() {
    }

    /****************
     * Metodo Imprime
     * **************/
    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.seminario != null ) {
            System.out.println("Seminario cadastrado: " + this.seminario.getTitulo());
            return;
        }
        System.out.println("Aluno não escrito em nenhum seminario!!!");

    }

    /**************
     * Metodos Set
     **************/
    public void setSeminario(Seminario seminarioP) {
        this.seminario = seminarioP;
    }

    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public void setIdade(int idadeP) {
        this.idade = idadeP;
    }

    /************
     * Metodo Get
     ************/

    public Seminario getSeminario() {
        return seminario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }


}
