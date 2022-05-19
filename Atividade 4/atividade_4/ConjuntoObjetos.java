package atividade_4;

public class ConjuntoObjetos implements IVetor{
    private Object[] objetos = new Object[10];
    private int totalObjetos = 0;

    public void adiciona(Object a1){
        this.garanteEspaco();
        this.objetos[this.totalObjetos] = a1;
        this.totalObjetos++;
    }

    public int tamanho(){
        return this.totalObjetos;
    }

    public boolean contem(Object a1){
        for(int i=0; i<this.totalObjetos; i++){
            if(a1 == this.objetos[i]){
                return true;
            }
        }
        return false;
    }

    public boolean cheio(){
        if(totalObjetos == this.objetos.length){
            return true;
        }
        return false;
    }

    public void garanteEspaco(){
        if(this.cheio()){
            Object[] newObjetos = new Object[this.objetos.length*2];
            for(int i=0;i<this.objetos.length;i++){
                newObjetos[i] = this.objetos[i];
            }
            this.objetos = newObjetos;
        }
    }

    public boolean remove(Object a2){
        int indice = -1;
        for(int i=0;i<totalObjetos;i++){
            if(a2 == this.objetos[i]){
                indice = i;
                break;
            }
        }
        if(indice != -1){
            for(int i=indice;i<(totalObjetos-1);i++){
                objetos[i] = objetos[i+1];
            }
            totalObjetos--;
            return true;
        }
        return false;
    }

    public void imprime(){
        for(int i=0; i<totalObjetos; i++){
            System.out.println(this.objetos[i]);
        }
    }
}
