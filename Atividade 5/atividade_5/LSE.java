package atividade_5;

public class LSE implements Lista {
    private Noh inicio;
    
    public LSE (){
        this.inicio = null;
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

    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
        }
        else {
        Noh ultimo;
            for(Noh i=inicio; i != null; i=i.getProx()){
                ultimo = i;
            }
            ultimo.setProx(novo);
        }
    }
    
    public boolean estaVazia() {}

    public boolean remove(Object info) {
        Noh ant, p;
        p = inicio;
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

    public int tamanho() {}
    }