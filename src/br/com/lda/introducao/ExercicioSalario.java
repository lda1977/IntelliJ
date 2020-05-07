package br.com.lda.introducao;

public class ExercicioSalario {
    public static void main(String[] args) {
        double salario = 500;
        double imposto = 0;
        if (salario < 1000) {

            imposto = salario * 0.05;
            System.out.println("Seu salario é de: " + salario);
            System.out.println("Logo sobre o seu salario o imposto é de 5% então vale: " + imposto+" reais");
        } else if (salario >= 1000 && salario < 2000) {

            imposto = salario * 0.10;
            System.out.println("Seu salario é de: " + salario);
            System.out.println("Logo sobre o seu salario o imposto é de 10% então vale: " + imposto+" reais");
        } else if (salario >= 2000 && salario < 4000) {

            imposto = salario * 0.15;
            System.out.println("Seu salario é de: " + salario);
            System.out.println("Logo sobre o seu salario o imposto é de 15% então vale: " + imposto+" reais");
        }else {
            imposto = salario * 0.20;
            System.out.println("Seu salario é de: " + salario);
            System.out.println("Logo sobre o seu salario o imposto é de 20% então vale: " + imposto+" reais");
        }
    }
}
