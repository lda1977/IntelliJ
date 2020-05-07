package br.com.lda.introducao.arrays;

public class ArraysMultiDimensional {
    public static void main(String[] args){
        int [][] dias = new int[2][5];
        /* Povuando a memoria */
        dias[0][0] = 30;
        dias[0][1] = 29;
        dias[0][2] = 28;
        dias[0][3] = 27;
        dias[0][4] = 26;
        dias[1][0] = 25;
        dias[1][1] = 24;
        dias[1][2] = 23;
        dias[1][3] = 22;
        dias[1][4] = 21;

        for(int i = 0; i < dias.length; i++){
            System.out.println("Valor de refencia a memoria "+dias[i]);
            for(int j = 0; j<dias[i].length; j++){
                System.out.println("Valores da variavel "+dias[i][j]);
            }/* fim segundo for*/
        }/* Fim primeiro for */

        System.out.println("________________________");

        /* For it */
        for (int[] referencia : dias){
            for (int dia :referencia){
                System.out.println(dia);
            } /* Fim segundo for */
        } /* Fim primeiro for*/
    }
}

