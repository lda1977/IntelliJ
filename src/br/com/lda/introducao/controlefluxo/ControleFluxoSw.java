package br.com.lda.introducao.controlefluxo;

public class ControleFluxoSw {
    public static void main( String[] args){
        byte dia = 3;
        /* Variaveis que podem entrar no switch char, int, byte, short, enum e String */
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        } /* Fim do Switch */

        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Sexo masculino");
                break;
            case 'F':
                System.out.println("Sexo femenino");
                break;
        }/* Fim Switch sexo */

        String Sexo = "M";
        switch (Sexo) {
            case "M":
                System.out.println("Sexo masculino");
                break;
            case "F":
                System.out.println("Sexo femenino");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Sexo);
        }
    }
}
