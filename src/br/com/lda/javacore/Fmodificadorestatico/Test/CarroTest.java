package br.com.lda.javacore.Fmodificadorestatico.Test;

import br.com.lda.javacore.Fmodificadorestatico.Classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro _objA = new Carro("BMW", 260);
        Carro _objB = new Carro("Audi", 250);
        Carro _objC = new Carro("Mercedis", 280);

        _objA.imprime();
        _objB.imprime();
        _objC.imprime();

        System.out.println("***************");

        Carro.setVelocidadeLimite(200);
        //_objA.setVelocidadeLimite(220);

        _objA.imprime();
        _objB.imprime();
        _objC.imprime();
    }
}
