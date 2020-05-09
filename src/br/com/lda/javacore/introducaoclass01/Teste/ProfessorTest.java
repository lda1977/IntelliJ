package br.com.lda.javacore.introducaoclass01.Teste;

import br.com.lda.javacore.introducaoclass01.Classes.Professor;

public class ProfessorTest {
    public static void main (String[] args){
        Professor _objProfessor = new Professor();

        _objProfessor.nome = "Juca Furi";
        _objProfessor.matricula = "AgB45121";
        _objProfessor.rg = 2078125498;
        _objProfessor.cpf = 90126530097L;

        System.out.println(_objProfessor.nome);
        System.out.println(_objProfessor.matricula);
        System.out.println(_objProfessor.rg);
        System.out.println(_objProfessor.cpf);
    }
}
