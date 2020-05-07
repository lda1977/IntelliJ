package br.com.lda.introducao.controlefluxo;

public class ControleFluxo {
    public static void main (String[] agrs){
        // idade < 15 catg. Infantil
        // idade >= 15 && < 18 catg. Juvenil
        // idade >= 18 catg. Adulto
        int idade = 15;

        if (idade < 15){
            System.out.println("Sua idade é " +idade);
            System.out.println("Categoria Infantil!");
        }
        else if (idade >= 15 && idade < 18){
            System.out.println("Sua idade é " +idade);
            System.out.println("Categoria Juvenil");
        }else {
            System.out.println("Categoria Adulto"+idade);
        }

    }
}
