package br.com.lda.javacore.Kenum.Classes;

public class Cliente {
    /**
     * Atributos
     **/
    private String nome;
    private TipoCliente tipo;

    public Cliente(String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeP) {
        this.nome = nomeP;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipoP) {
        this.tipo = tipoP;
    }
}
