package br.com.lda.javacore.Fmodificadorestatico.Test;


import br.com.lda.javacore.Fmodificadorestatico.Classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente _objClient = new Cliente();
        System.out.println("Numeros de pacelas existentes ");

        for (int parcela : _objClient.getParcelas()) {
            System.out.print(parcela + " ");
        }/* Fim for */

    }
}
