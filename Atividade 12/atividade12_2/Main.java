package atividade12_2;

public class Main {
    public static void main(String args[]){
        Pilha pilha = new Pilha();

        Aluno aluno1 = new Aluno("Axel", 19, 9);
        Aluno aluno2 = new Aluno("Lucas", 22, 6);
        Aluno aluno3 = new Aluno("Zé", 15, 4);
        LSE listaAlunos = new LSE();
        
        listaAlunos.insereInicio(aluno1);
        listaAlunos.insereFim(aluno2);
        listaAlunos.insereFim(aluno3);

        listaAlunos.imprime();

        pilha.Push(listaAlunos.returnNoh(0));
        pilha.Push(listaAlunos.returnNoh(1));
        pilha.Push(listaAlunos.returnNoh(2)); 

        pilha.imprimeEstado();
    }
}