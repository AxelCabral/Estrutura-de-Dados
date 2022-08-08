package atividade_15;

public class ABB {
    private Noh raiz;

    public ABB(){
        this.raiz = null;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void addRecursive(int element) {
        if (isEmpty())
        {
            this.raiz = new Noh(element);
        }
        else {
            addRecursive(this.raiz, element);
        }
    }

    private void addRecursive(Noh current, int valor) {
        if (valor < current.valor) {
            if (current.esq == null) {
                Noh newNoh = new Noh(valor);
                current.esq = newNoh;
                newNoh.pai = current;
                return;
            }
            addRecursive(current.esq, valor);
        }
        else {
            if (current.dir == null) {
                Noh newNoh = new Noh(valor);
                current.dir = newNoh;
                newNoh.pai = current;
                return;
            }
            addRecursive(current.dir, valor);
        }
    }

    public Noh buscaRec(int element) {
        return buscaRec(this.raiz, element);
    }
    
    private Noh buscaRec(Noh current, int valor) {
        if (current == null) 
        {   
            return null;
        }
        if (valor == current.valor) 
        {
            return current;
        }
        if (valor < current.valor){
            return buscaRec(current.esq, valor);
        }
        else{
            return buscaRec(current.dir, valor);
        }
    }

    public void inorder()
    {
        if (this.raiz == null) {
            return;
        }
 
        inorder(raiz.esq);
        System.out.print(raiz.getValor() + "\n");
        inorder(raiz.dir);
    }

    private static void inorder(Noh current){
        if (current == null) {
            return;
        }
        inorder(current.esq);
        System.out.print(current.getValor() + "\n");
        inorder(current.dir);
    }

}
