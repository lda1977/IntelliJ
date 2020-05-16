package br.com.lda.javacore.Fmodificadorestatico.Classes;

public class Carro {
    // Velocidade Limite é 240 Km/h
    /* Atributos */
    private String nome;
    private double velocidadeMaxima;
    /* Membro da Classe não é mais do OBJ */
    public static double velocidadeLimite = 240;

    /***************
     * Metodo Imprime
     * *************/
    public void imprime() {
        System.out.println("_______________");
        System.out.println("Nome " + this.nome);
        System.out.println("VelMaxima " + this.velocidadeMaxima);
        System.out.println("VelLimite " + this.velocidadeLimite);
    }

    /**************
     * Construtores
     * ************/
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    /*************
     * Metodos Set
     * ***********/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /*
    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
    /*
    /**************
     * Metodos Get
     * ***********/
    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    /*
    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }
    */
}
