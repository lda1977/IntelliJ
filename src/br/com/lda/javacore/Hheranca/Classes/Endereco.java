package br.com.lda.javacore.Hheranca.Classes;

public class Endereco {
    private String rua;
    private String bairro;

    public void print(){
        System.out.println("Rua : "+this.rua);
        
    }

    /***********
     * Metodos Set
     * *******/
    public void setRua(String ruaP) {
        this.rua = ruaP;
    }

    public void setBairro(String bairroP) {
        this.bairro = bairroP;
    }
    /**********
     * Metodos Get
     * *******/

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

}
