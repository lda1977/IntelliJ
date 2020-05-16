package br.com.lda.javacore.Fmodificadorestatico.Classes;

public class Carro {
    // Velocidade Limite é 240 Km/h
    /* Atributos */
    private String nome;
    private double velocidadeMaxima;
    /* Membro da Classe não é mais do OBJ */
    private static double velocidadeLimite = 240;

    /***************
     * Metodo Imprime
     * *************/
    public void imprime() {
        System.out.println("_______________");
        System.out.println("Nome " + this.nome);
        System.out.println("VelMaxima " + this.velocidadeMaxima);
        System.out.println("VelLimite " + velocidadeLimite);
    }

    /**************
     * Construtores
     * ************/
    public Carro(String nomeP, double velocidadeMaximaP) {
        this.nome = nomeP;
        this.velocidadeMaxima = velocidadeMaximaP;
    }

    public Carro() {
    }

    /*************
     * Metodos Set
     * ***********/
    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public void setVelocidadeMaxima(double velocidadeMaximaP) {
        this.velocidadeMaxima = velocidadeMaximaP;
    }

    /*
    public void setVelocidadeLimite(double velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
     */
    public static void setVelocidadeLimite(double velocidadeLimiteP) {
        Carro.velocidadeLimite = velocidadeLimiteP;
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
    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }
}
