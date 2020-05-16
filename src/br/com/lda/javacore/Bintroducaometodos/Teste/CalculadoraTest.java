package br.com.lda.javacore.Bintroducaometodos.Teste;

import br.com.lda.javacore.Bintroducaometodos.Classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora _objcalc = new Calculadora();

        _objcalc.somaDoisNumeros();
        _objcalc.subtraiDoisNumeros();
        /* Passando 2 argumentos */
        _objcalc.multiplicaDosiNumeros(40, 5);

        double resultadoTotal = _objcalc.divideDoisNumeros(0d, 6d);
        System.out.println(resultadoTotal);
    }
}
