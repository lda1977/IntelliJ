package br.com.lda.javacore.Kenum.Test;

import br.com.lda.javacore.Kenum.Classes.Cliente;
import br.com.lda.javacore.Kenum.Classes.TipoCliente;

public class CleinteTest4 {
    public static void main (String[] args){
        Cliente _objC = new Cliente("Juca Furi" , TipoCliente.PESSOA_FISICA);
        System.out.println(_objC);

    }
}
