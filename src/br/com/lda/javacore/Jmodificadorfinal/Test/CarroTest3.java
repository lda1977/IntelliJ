package br.com.lda.javacore.Jmodificadorfinal.Test;

import br.com.lda.javacore.Jmodificadorfinal.Classes.Carro;

public class CarroTest3 {
    public static void main (String[] args){
        Carro _objC = new Carro();
        System.out.println(_objC.getComprador());
        _objC.getComprador().setNome("Lucas");
        System.out.println(_objC.getComprador());

    }
}
