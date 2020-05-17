package br.com.lda.javacore.Gassociacao.Classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;

    /* Relacionamento entre class */
    private Professor professor;
    private Local local;

    /**
     * Construtor
     **/
    public Seminario(String tituloP) {
        this.titulo = tituloP;
    }

    public Seminario() {
    }

    /**********
     * Metodo imprime
     * *****/
    public void print() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Professor Palestrante: " + this.professor.getNome());
        if (this.local != null) {
            System.out.println("Local e Rua " + this.local.getRua() + "Bairro " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminario!!!");
        }/* Fim IF*/
        if (alunos != null && alunos.length != 0) {
            System.out.println("----- Alunos participantes ----- ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }/*Fim For*/
            return;
        }/* Fim if */
        System.out.println("Nenhum aluno cadastrador!!!!");
    }

    /**
     * Metodos Set and Get
     **/
    public void setProfessor(Professor professorP) {
        this.professor = professorP;
    }

    public void setLocal(Local localP) {
        this.local = localP;
    }

    public void setAlunos(Aluno[] alunosP) {
        this.alunos = alunosP;
    }

    public void setTitulo(String tituloP) {
        this.titulo = tituloP;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Local getLocal(Local _objLocal) {
        return local;
    }

}
