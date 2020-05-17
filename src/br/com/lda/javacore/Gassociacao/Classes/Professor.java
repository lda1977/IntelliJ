package br.com.lda.javacore.Gassociacao.Classes;

public class Professor {
    private String nome;
    private String especilidade;

    /* Relacionamento entre class */
    private Seminario[] seminarios;


    /************
     * Construtor
     * **********/
    public Professor(String nome, String especilidade) {
        this.nome = nome;
        this.especilidade = especilidade;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("Nome do Professor: " + this.nome);
        System.out.println("Especialidade : " + this.especilidade);

        if (seminarios != null && seminarios.length != 0) {

            for (Seminario _objSeminario : seminarios) {

                System.out.print("Seminarios participantes: ");
                System.out.print(_objSeminario.getTitulo() + " ");
            }
            return;
        }/*Fim if */
        System.out.println("Professor não vinculado ao seminario: !! ");
    }

    /************
     * Metodo Set
     * *********/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    /***********
     * Metodo Get
     * **********/
    public String getNome() {
        return nome;
    }

    public String getEspecilidade() {
        return especilidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }
}
