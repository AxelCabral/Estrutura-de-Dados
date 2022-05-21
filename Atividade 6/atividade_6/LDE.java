package atividade_6;

public class LDE implements Lista {
    private Noh inicio;
    private Noh fim;
    
    public LDE (){
        this.inicio = null;
        this.fim = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
        }
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public boolean estaVazia(){
        if(tamanho() == 0){
            return true;
        }
        return false;
    }

    public int tamanho(){
        Noh p = inicio;
        int i = 0;
        while (p!=null){ 
            p = p.getProx();
            i++;
        }
        return i;
    }

    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        Noh ultimo;
        ultimo = null;
        if (inicio == null){
            inicio = novo;
        }
        else {
            for(Noh i=inicio; i != null; i=i.getProx()){
                ultimo = i;
            }
            ultimo.setProx(novo);
        }
    }

    public boolean remove(Object info) {
        Noh ant, p;
        p = inicio;
        ant = null;
        while (p!=null && p.getInfo() != info){ //busca
        ant = p;
        p = p.getProx();
        }
        if (p==null) // não achou, então não faz nada e retorna false
        return false;
        if (ant==null) //retira info do início
        inicio = p.getProx();
        else
        ant.setProx(p.getProx());
        return true;
    }

    public void imprime(){
        Noh p = inicio;
        while (p!=null){ 
            System.out.println(p.getInfo());
            p = p.getProx();
        }
    }
}