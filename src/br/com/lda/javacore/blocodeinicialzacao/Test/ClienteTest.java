package br.com.lda.javacore.blocodeinicialzacao.Test;

import br.com.lda.javacore.blocodeinicialzacao.Classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente _objClient = new Cliente();
        System.out.println("Numeros de pacelas existentes ");

        for (int parcela : _objClient.getParcelas()) {
            System.out.print(parcela + " ");
        }/* Fim for */

    }
}
