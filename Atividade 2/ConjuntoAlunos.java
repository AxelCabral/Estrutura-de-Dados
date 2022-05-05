public class ConjuntoAlunos {
    private Aluno[] alunos = new Aluno[10];
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno){
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;
    }

    public int tamanho(){
        return this.totalAlunos;
    }

    public boolean contem(Aluno aluno){
        for(int i=0; i<this.totalAlunos; i++){
            if(aluno == this.alunos[i]){
                return true;
            }
        }
        return false;
    }
}
