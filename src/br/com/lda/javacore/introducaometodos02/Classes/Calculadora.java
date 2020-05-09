package br.com.lda.javacore.introducaometodos02.Classes;

public class Calculadora {
    /* Metodos */
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void subtraiDoisNumeros(){
        System.out.println(10-5);
    }

    /* Passando parametros junto do metodo */
    public void multiplicaDosiNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double numero1, double numero2){
        double resultado = numero1 / numero2;
        if(numero1 != 0 && numero2 != 0){
            return numero1 / numero2;
        }else {
            return 0;

        } /* fim do If*/
        //return resultado;
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois numeros Cal.java");
        System.out.println("Numero 1 : Calc.java "+num1);
        System.out.println("Numero 2 : Calc.java "+num2);
    }
}
