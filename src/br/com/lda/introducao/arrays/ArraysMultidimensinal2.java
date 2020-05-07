package br.com.lda.introducao.arrays;

public class ArraysMultidimensinal2 {
    public static void main(String[] args){
        /* Arrays multidimensional com referencias para 2 arrays, 3 arrays e 4 arrays */
        int dias[][] = new int[3][];
        dias[0] = new int[2];
        dias[1] = new int[] {1,2,3};
        dias[2] = new int[4];
        /* Outra forma de criar os Arrays */
        /**
         *
         * int [][] dias = {{0,0},{1,2,3},{0,0,0,0}};
         *
         * */
        /* Estes for vao percorrer todos arrays */
        for(int[] arr : dias){
            System.out.println("Referencia da memoria"+arr);
            for(int num : arr){
                /* Imprime  o conteudo do array*/
                System.out.println("Conteudor do Array "+num);
            } /* Fim do segundo for */
        } /* Fim primeiro for */
    }
}
