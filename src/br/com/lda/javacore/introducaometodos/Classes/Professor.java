package br.com.lda.javacore.introducaometodos.Classes;

public class Professor {

    /* Atributos -> caracteristicas */
    public String nome;
    public String matricula;
    public int rg;
    public Long cpf;

    /* Metodos -> Comportamento da Class */
    public void imprime(Professor auxiliar){
        System.out.println("-IMPRIME POR REFERENCIA-");
        System.out.println(auxiliar.nome);
        System.out.println(auxiliar.matricula);
        System.out.println(auxiliar.rg);
        System.out.println(auxiliar.cpf);
    }

    /* Metodo THIS quando queremos pegara o valores de dentro o OBJ */
    public void imprimeComThis(){
        System.out.println("-IMPRIME com THIS-");
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);
    }
}
