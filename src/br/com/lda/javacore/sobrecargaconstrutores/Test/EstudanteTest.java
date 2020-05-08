package br.com.lda.javacore.sobrecargaconstrutores.Test;

import br.com.lda.javacore.sobrecargaconstrutores.Classes.Estudante;

public class EstudanteTest {
    public static void main (String[] args){
        Estudante _objEst = new Estudante("125458785","Gustavo",new double[]{8.5, 5.0, 9, 5}, "12/05/2020");
        _objEst.imprime();
    }

}
