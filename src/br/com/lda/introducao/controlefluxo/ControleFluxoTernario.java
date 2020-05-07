package br.com.lda.introducao.controlefluxo;

public class ControleFluxoTernario {
    public static void main (String [] args){
        // idade < 15 catg. Infantil
        // idade >= 15 && < 18 catg. Juvenil
        // idade >= 18 catg. Adulto
        int idade = 15;
        String status;
        /*
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
        */
        // Controlador ternario
                                //True          //false
        status = idade <= 18 ? "Não adulto" : "É adulto";
        System.out.println(status);
    }
}
