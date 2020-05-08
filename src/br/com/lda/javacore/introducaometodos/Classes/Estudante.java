package br.com.lda.javacore.introducaometodos.Classes;

public class Estudante {
    /* Atributos */
    public String  nome;
    public int idade;
    public double[] notas;

    /* Metodos */
    public void imprimedados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for(double nota : notas ){
            System.out.print(nota +  " ");
        }
        //System.out.println("Notas: "+this.notas);
    }

    public void tirarMedia(){
        double media = 0;
        for(double nota: notas){
            media += nota;
        }
        media = media/notas.length;

        if( media > 6 ){
            System.out.println("Aprovado");
            return;
        }
        System.out.println("Reprovado");
    }

}
