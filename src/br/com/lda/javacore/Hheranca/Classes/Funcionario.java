package br.com.lda.javacore.Hheranca.Classes;

public class Funcionario extends Pessoa {
    private double salario;

    public void print() {
        /**** Super referencia a classe Pessoa ****/
        super.print();
        System.out.println("Salário: " + this.salario);
    }

    /********
     * Metodos Set
     * *******/
    public void setSalario(double salarioP) {
        this.salario = salarioP;
    }

    /***********
     * Metodos Get
     * **********/
    public double getSalario() {
        return salario;
    }

}
