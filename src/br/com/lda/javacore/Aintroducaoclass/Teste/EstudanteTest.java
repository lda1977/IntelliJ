package br.com.lda.javacore.Aintroducaoclass.Teste;

import br.com.lda.javacore.Aintroducaoclass.Classes.Estudante;

public class EstudanteTest {
    public static void main (String[] args){
        /* Refenciando a class */
        Estudante _objjoao = new Estudante();

        /* Preenchendo os atributos da class */
        _objjoao.nome = "Lucas Silva";
        _objjoao.matricula = "154788";
        _objjoao.idade = 24;

        /* Imprimendo o conteudo do _OBJ */
        System.out.println(_objjoao.nome);
        System.out.println(_objjoao.matricula);
        System.out.println(_objjoao.idade);
    }
}
