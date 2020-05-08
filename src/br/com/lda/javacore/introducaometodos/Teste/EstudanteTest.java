package br.com.lda.javacore.introducaometodos.Teste;

import br.com.lda.javacore.introducaometodos.Classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        /* Criar uma variavel de referencia e instaciar o OBJ */
        Estudante _objEst = new Estudante();
        _objEst.nome = "Lucas";
        _objEst.idade = 21;
        _objEst.notas = new double[]{8,7,9.5};
        _objEst.imprimedados();

    }
}
