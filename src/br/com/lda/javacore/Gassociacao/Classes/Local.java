package br.com.lda.javacore.Gassociacao.Classes;

public class Local {
    private String rua;
    private String bairro;


    /*************
     * Construtor
     * ***********/
    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public Local() {
    }

    public void print(){
        System.out.println("Rua: "+this.rua);
        System.out.println("Bairro: "+this.bairro);

    }

    /*********
     * Metodos Set
     * *********/
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /************
     * Metodo Get
     * ***********/

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

}
