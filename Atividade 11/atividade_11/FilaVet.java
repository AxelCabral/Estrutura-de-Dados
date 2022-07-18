package atividade_11;

public class FilaVet implements IFila {
    private int numElem;
    private Noh inicio;
    private Noh fim;

    public FilaVet(){ //construtor
        this.inicio = null;
        this.fim = null;
        this.numElem = 0;
    }

    public boolean add(Aluno aluno){ //insere
        Noh novo = new Noh(aluno);
        if (this.isEmpty())
        {
            inicio = novo;
        }
        else
        {
            fim.setProx(novo);
        }       
        fim = novo;
        this.numElem++;
        return true;
    }

    public boolean remove(){ //remove
        if (!isEmpty()){
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else{
                inicio = inicio.getProx();
                return true;
            }
            this.numElem--;
        }
        return false;
    }
    
    public int size(){
        return numElem;
    }

    public boolean isEmpty(){
        if(this.numElem == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(){
        for(int i = 0; i<this.size(); i++){
            Aluno aluno = (Aluno) this.inicio.getInfo();
            System.out.println("Índice: "+i+" Valor: "+aluno.getNome());
            inicio = inicio.getProx();
        }
    }
}