package br.com.lda.javacore.Isobrescrita.Classes;

public class Pessoa {
    private String nome;
    private int idade;


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    //
//    @Override
//    /* Classe do Objcte Java */
//    public String toString(){
//
//        return "Nome "+nome+" Idade "+idade;
//    }



    /********
     * Metodo SET
     * *******/

    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public void setIdade(int idadeP) {
        this.idade = idadeP;
    }

    /*****
     * Metodos GET
     * *****/

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
