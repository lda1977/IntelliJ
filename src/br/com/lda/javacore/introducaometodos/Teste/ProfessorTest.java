package br.com.lda.javacore.introducaometodos.Teste;

import br.com.lda.javacore.introducaometodos.Classes.Professor;

public class ProfessorTest {
    public static void main(String[] agrs){
        Professor _objProf = new Professor();
        _objProf.cpf = 45454545L;
        _objProf.rg = 21435445;
        _objProf.matricula = "23234WER";
        _objProf.nome = "Juca Furi";

        Professor _objProf2 = new Professor();
        _objProf2.cpf = 1122554L;
        _objProf2.rg = 45218754;
        _objProf2.matricula = "4578FD";
        _objProf2.nome = "Jonas Silva";

        System.out.println("Referencia do _objProf "+_objProf);
        /* Passando o endereço da referencia dp OBJ */
        _objProf.imprime(_objProf);
        System.out.println("Referencia do _objProf2 "+_objProf2);
        _objProf.imprime(_objProf2);


        /* Passando com THIS para OBJ */
        _objProf.imprimeComThis();
        _objProf2.imprimeComThis();



    }/* Fim Main*/
}/* Fim Class */
