package atividade_13;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private float nota;

    public Aluno(String matricula, String nome, int idade, float nota) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
