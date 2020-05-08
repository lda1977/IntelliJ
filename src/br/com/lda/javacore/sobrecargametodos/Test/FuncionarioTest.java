package br.com.lda.javacore.sobrecargametodos.Test;

import br.com.lda.javacore.sobrecargametodos.Classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] agrs) {
        /* Variavel de referencia _objFunc e objeto Funcionario */
        Funcionario _objFunc = new Funcionario();
        /* Usando Sobrecarga*/
        _objFunc.chamaInicio("Juliana lares", "784512-9", 4565, "45871");

        /* Modelo antigo sem sobrecarga */
        //_objFunc.setNome("Juliana Lares");
        //_objFunc.setCpf("45871212-5");
        //_objFunc.setSalario(7854);

        _objFunc.imprime();
    }
}
