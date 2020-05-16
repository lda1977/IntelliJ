package br.com.lda.javacore.Bintroducaometodos.Teste;

import br.com.lda.javacore.Bintroducaometodos.Classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        /* Criar uma variavel de referencia e instaciar o OBJ */
        Estudante _objEst = new Estudante();

        _objEst.setNome("Lais");
        _objEst.setIdade(34);
        _objEst.setNotas(new double[]{8,7,9.5});
        /**
         * _objEst.nome = "Lucas";
         * _objEst.idade = 21;
         * _objEst.notas = new double[]{8,7,9.5}; */

        _objEst.imprimedados();
        _objEst.tirarMedia();
        System.out.println(_objEst.getNome());
        System.out.println("Aprovado?: "+_objEst.isAprovado());

    }
}
