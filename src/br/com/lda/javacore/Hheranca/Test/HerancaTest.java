package br.com.lda.javacore.Hheranca.Test;

import br.com.lda.javacore.Hheranca.Classes.Endereco;
import br.com.lda.javacore.Hheranca.Classes.Funcionario;
import br.com.lda.javacore.Hheranca.Classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        /****** OBJ **********/
        Pessoa _objPessoa = new Pessoa();
        Endereco _objend = new Endereco();
        Funcionario _objFunc = new Funcionario();

        /****** Inicializando ******/
        _objPessoa.setNome("Lucas");
        _objPessoa.setCpf("4587211");
        _objend.setBairro("Das cavas");
        _objend.setRua("Virgulas");

        /**** Associando end a pessoa ******/
        _objPessoa.setEndereco(_objend);

        /***** Chamando a função PRINT ********/
        _objPessoa.print();

        System.out.println("__________________________");
        _objFunc.setNome("João da Silva");
        _objFunc.setCpf("548721");
        _objFunc.setSalario(4587);
        _objFunc.setEndereco(_objend);
        _objFunc.print();

    }
}
