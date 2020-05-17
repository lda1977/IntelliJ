package br.com.lda.javacore.Gassociacao.Test;

import br.com.lda.javacore.Gassociacao.Classes.Aluno;
import br.com.lda.javacore.Gassociacao.Classes.Local;
import br.com.lda.javacore.Gassociacao.Classes.Professor;
import br.com.lda.javacore.Gassociacao.Classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args){
        Aluno _objAluno = new Aluno("Juca",45);
        Aluno _objAluno2 = new Aluno("JAIR",23);

        Professor _objProf = new Professor("Yodu","Dados");
        Local _objLocal = new Local("Rua grande","Centro");
        Seminario _objSeminario = new Seminario("Como ser um programador: ");

        _objAluno.setSeminario(_objSeminario);
        _objAluno2.setSeminario(_objSeminario);
        _objAluno.print();
        _objAluno2.print();
        _objSeminario.setProfessor(_objProf);
        _objSeminario.getLocal(_objLocal);
        _objSeminario.setAlunos(new Aluno[]{_objAluno,_objAluno2});

        Seminario[] seminariosArray = new Seminario[1];
        seminariosArray[0] = _objSeminario;
        _objProf.setSeminarios(seminariosArray);

       _objSeminario.print();

        _objProf.print();
    }
}
