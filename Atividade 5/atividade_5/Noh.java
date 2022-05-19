package atividade_5;

public class Noh {
    private Object info; //este exemplo armazena números inteiros
    private Noh prox;
    
    public Noh (Object info){
    this.info = info;
    this.prox = null;
    }
    
    public Object getInfo() { }
    public Noh getProx(){ }
    
    public Noh setProx(Noh n) { this.prox = n; }
    }