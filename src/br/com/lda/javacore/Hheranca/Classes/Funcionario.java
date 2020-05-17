package br.com.lda.javacore.Hheranca.Classes;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario ");
    }

    {
        System.out.println("Dentro do bloco de inicialização do funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização do funcionario 2");
    }

    static {
        System.out.println("Dentro do bloco Static de inicialização do funcionario 1");
    }


    public void print() {
        /**** Super referencia a classe Pessoa ****/
        super.print();
        System.out.println("Salário: " + this.salario);
        printReciboPagamento();
    }

    public void printReciboPagamento() {
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
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
