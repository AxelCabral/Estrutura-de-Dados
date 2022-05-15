package atividade_3;

public class ConjuntoAlunos {
    private Aluno[] alunos = new Aluno[10];
    private int totalAlunos = 0;

    public void adiciona(Aluno a1){
        this.garanteEspaco();
        this.alunos[this.totalAlunos] = a1;
        this.totalAlunos++;
    }

    public int tamanho(){
        return this.totalAlunos;
    }

    public boolean contem(Aluno a1){
        for(int i=0; i<this.totalAlunos; i++){
            if(a1 == this.alunos[i]){
                return true;
            }
        }
        return false;
    }

    public boolean cheio(){
        if(totalAlunos == this.alunos.length){
            return true;
        }
        return false;
    }

    public void garanteEspaco(){
        if(this.cheio()){
            Aluno[] newAlunos = new Aluno[this.alunos.length*2];
            for(int i=0;i<this.alunos.length;i++){
                newAlunos[i] = this.alunos[i];
            }
            this.alunos = newAlunos;
        }
    }

    public boolean remove(Aluno a2){
        int indice = -1;
        for(int i=0;i<totalAlunos;i++){
            if(a2 == this.alunos[i]){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            for(int i=0;i<totalAlunos-1;i++){
                alunos[i] = alunos[i+1];
            }
            totalAlunos--;
            return true;
        }
        return false;
    }
}
