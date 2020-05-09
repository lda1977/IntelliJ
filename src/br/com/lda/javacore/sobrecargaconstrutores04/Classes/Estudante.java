package br.com.lda.javacore.sobrecargaconstrutores04.Classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    /* Primeiro Construtor */
    public Estudante(String matriculaC, String nomeC, double[] notasC) {
        this.matricula = matriculaC;
        this.nome = nomeC;
        this.notas = notasC;
    }

    /* Construtor 2 com sobrecarga */
    public Estudante(String matriculaC, String nomeC, double[] notasC, String dataMatriculaC) {
        /* Chamando o primeiro construtor é obrigatorio ser na primeira linha */
        /* Passando a responsabilidade para o construtor primario */
        this(matriculaC, nomeC, notasC);
        this.dataMatricula = dataMatriculaC;
    }

    /* Construtor 3 */
    public Estudante() {
        /* sem parametros */
    }

    public void imprime() {

        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }/* Fim for */
        System.out.println(this.dataMatricula);
    }

    /* Gerado pelo ALT+Insert */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matriculaS) {
        this.matricula = matriculaS;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeS) {
        this.nome = nomeS;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notasS) {
        this.notas = notasS;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
