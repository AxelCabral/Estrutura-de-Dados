package atividade6_2;

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
        Noh f = fim;
        int i = 0;
        while (p!=null){ 
            p = p.getProx();
            i++;
        }
        while(f!= null){
            f = f.getAnt();
            i++;
        }
        return i;
    }

    public void insereFim(Object info) { 
        Noh novo = new Noh(info);
        if (fim == null){
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
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
        if (p==null)
        return false;
        if (ant==null)
        inicio = p.getProx();
        else
        ant.setProx(p.getProx());
        return true;
    }

    public void imprime(){
        Noh p = inicio;
        while (p!=null){
            System.out.println(p.getInfo().toString());
            p = p.getProx();
        }
        Noh f = fim;
        while (f!=null){
            System.out.println(f.getInfo().toString());
            f = f.getAnt();
        }
    }
}