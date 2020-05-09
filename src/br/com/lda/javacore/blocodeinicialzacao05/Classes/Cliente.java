package br.com.lda.javacore.blocodeinicialzacao05.Classes;

public class Cliente {
    // 1- Alocado espaço na memoria para o obj, que será criado
    // 2- Cada atributo de Class é criado e inicializado com seus valores default ou inseridor
    // 3- Bloco de inicialização é executado
    // 4- O construtor é executado

    /* Atributos */
    private int[] parcelas;

    { /* Bloco de inicialização antes do construtor */
        parcelas = new int[100];
        System.out.println("..:: Dentro do Bloco de inicialização ::..");

        /* Este for tem o objetivo de criar o numero de parcelas de 1 a 100 */
        for (int contador = 1; contador <= 100; contador++) {
            parcelas[contador - 1] = contador;
        }/* Fim for */
    }

    /* Metodos */
    /* construtor */
    public Cliente() {
    /* Vazio */
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
