package br.com.lda.introducao.controlefluxo;

import javax.swing.*;

public class ControleFluxoWh {
    public static void main(String [] args){

        int contador = 0;
        int entradaDados;

        entradaDados = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor"));
        System.out.println(entradaDados);

        /* enquanto for verdade fica preço no while */
        while(entradaDados < 10){
            System.out.println(entradaDados);
            entradaDados ++;
        }/* Fim while */

        /* do while */
        do {
            System.out.println("Entrou no DO ");
        } while(contador >= 10);

        /* Controle de Fluxo For */
        for (int i = 0; i <= 120; i++){
            System.out.println("O valor de Incremento i é: "+i);
        }/* Fim For */
    }
}
