package br.com.lda.introducao.arrays;

public class Arrays2 {
    public static void main (String[] args){
        // byte, int. short, long, float e double = 0
        // char '\u0000'
        // boolean faslse
        // String reference null
        int [] idades = new int[3];
        String[] nomes = new String[3];
        nomes[0] = "Eduardo";
        nomes[1] = "julio";
        nomes[2] = "Jucas";

        /* pode-se trocar o tramanho do arrays por nomes.length*/
        for (int i = 0; i < nomes.length; i++ ){
            System.out.println(nomes[i]);
        }

    }
}
