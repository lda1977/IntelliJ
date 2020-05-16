package br.com.lda.javacore.Bintroducaometodos.Teste;

import br.com.lda.javacore.Bintroducaometodos.Classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] agrs){
        Calculadora _objCalc = new Calculadora();

        int num1 = 5;
        int num2 = 10;
        _objCalc.alteraDoisNumeros(num1,num2);
        System.out.println("Dentro do test");
        System.out.println("Numero 1: "+num1);
        System.out.println("Numero 2: "+num2);
    }
}
