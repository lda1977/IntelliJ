package br.com.lda.introducao.arrays;

public class Arrays3 {
    public static void main (String[] args){
        /* As 3 formas de criar Arrays*/
        int[] numeros = new int[10];
        int[] numeros2 = {1,2,3,4,5,6,7,8,9,10};
        int[] numeros3 = new int[]{1,2,3,4,5,6,7,8,9,10};
/*        for (int i = 0; i < numeros2.length; i++){

            System.out.println("Imprimindo dentro do for "+numeros2[i]);
        } *//* Fim for */
        /*
        System.out.println("Fora do For "+numeros2[9]);
        System.out.println("Fora do For "+numeros2[8]);
        System.out.println("Fora do For "+numeros2[7]);
        System.out.println("Fora do For "+numeros2[6]);
        System.out.println("Fora do For "+numeros2[5]);
        System.out.println("Fora do For "+numeros2[4]);
        System.out.println("Fora do For "+numeros2[3]);
        System.out.println("Fora do For "+numeros2[2]);
        System.out.println("Fora do For "+numeros2[1]);
        System.out.println("Fora do For "+numeros2[0]);*/
        /* Usando o novo metodo for int colocamos na posição auxilar um valor por vez */
        for (int auxiliar : numeros2){
            System.out.println(auxiliar);

        }/* Fim for int */
    }
}
