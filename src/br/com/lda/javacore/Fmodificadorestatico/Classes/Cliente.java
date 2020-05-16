package br.com.lda.javacore.Fmodificadorestatico.Classes;

public class Cliente {
    // 0- Bloco de inicializaçõa é executado quando a JVM carrega a classe (é executado apenas um vez)
    // 1- Alocado espaço na memoria para o obj, que será criado
    // 2- Cada atributo de Class é criado e inicializado com seus valores default ou inseridor
    // 3- Bloco de inicialização é executado
    // 4- O construtor é executado

    /* Atributos */
    private static int[] parcelas;

    /* Deve colocar o STATIC na frente do bloco de inicialização */
    static { /* Bloco de inicialização antes do construtor */
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

    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
}
