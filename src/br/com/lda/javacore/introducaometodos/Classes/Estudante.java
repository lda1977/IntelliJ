package br.com.lda.javacore.introducaometodos.Classes;

public class Estudante {
    /* Atributos */
    private String nome;
    private int idade;
    private double[] notas;

    /* Metodos */
    public void imprimedados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas == null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }
        //System.out.println("Notas: "+this.notas);
    }

    public void tirarMedia() {
        if (this.notas == null) {
            System.out.println("Este aluno não possui notas!!!");
            return;
        }
        double media = 0;

        for (double nota : this.notas) {
            media += nota;
        }

        media = media / this.notas.length;

        /* Se aluno for maior que 6 */
        if (media > 6) {
            System.out.println("\nA média é: " + media + " situação é Aprovado");
            return;
        }
        System.out.println("\nA média é: " + media + " situação é Reprovado");
    }

    /* Metodos de acesso Set and Get */
    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public void setIdade(int idadeP) {
        this.idade = idadeP;
    }

    public void setNotas(double[] notasP) {
        this.notas = notasP;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

}
