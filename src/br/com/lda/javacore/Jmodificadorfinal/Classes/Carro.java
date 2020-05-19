package br.com.lda.javacore.Jmodificadorfinal.Classes;

public class Carro {
    public static final double VELOCIDADE_FINAL = 200;
    private final Comprador comprador = new Comprador();



    private String nome;
    private String marca;

    /*****
     * Sobrescreve To String
     * *******/
    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    /********
     * Metodos Set
     * *********/

    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public void setMarca(String marcaP) {
        this.marca = marcaP;
    }


    /******
     * Metodos Get
     * ********/

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Comprador getComprador() {
        return comprador;
    }


}
