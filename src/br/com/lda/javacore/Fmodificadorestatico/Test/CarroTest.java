package br.com.lda.javacore.Fmodificadorestatico.Test;

import br.com.lda.javacore.Fmodificadorestatico.Classes.Carro;

public class CarroTest {
    public static void main(String[] args){
        Carro _objA = new Carro("BMW","02/12/2020","330", "3", 260);
        Carro _objB = new Carro("Audi","01/12/2011","A3", "3", 250 );
        Carro _objC = new Carro("Mercedis","03/02/2020","S4","4", 280);

        _objA.imprime();
        _objB.imprime();
        _objC.imprime();

        /* Modificando a variavel Static */
        _objA.velocidadeLimite = 180;
        Carro.velocidadeLimite = 200;

        _objA.imprime();
        _objB.imprime();
        _objC.imprime();
    }
}
