package br.com.lda.javacore.modificadorestatico06.Classes;

public class Carro {
    // Velocidade Limite é 240 Km/h
    /* Atributos */
    private String nome;
    private String data;
    private String modelo;
    private String serie;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 240;

    /* Construtor */
    public Carro(String nomeP, String dataP, String modeloP, String serieP, double velocidadeMaximaP) {
        this.nome = nomeP;
        this.data = dataP;
        this.modelo = modeloP;
        this.serie = serieP;
        this.velocidadeMaxima = velocidadeMaximaP;
    }

    public Carro() {

    }

    public void imprime() {
        System.out.println("Marca " + this.nome);
        System.out.println("Data de Fabricação " + this.data);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Serie " + this.serie);
        System.out.println("Velocidade Máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite " + velocidadeLimite);
    }

    /* Metodos Set and Get */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
