package br.com.lda.javacore.introducaoclass01.Teste;

import br.com.lda.javacore.introducaoclass01.Classes.Carro;

public class CarroTest {
    public static void main (String[] args){

        Carro _objcarro = new Carro();
        _objcarro.modelo = "Gol";
        _objcarro.placa = "Abc9658";
        _objcarro.VelMaxima = 180f;

        System.out.println(_objcarro.modelo);
        System.out.println(_objcarro.placa);
        System.out.println(_objcarro.VelMaxima);
    }
}
