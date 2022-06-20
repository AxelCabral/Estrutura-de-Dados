package atividade_7;

public class Vetor {
    public int num[] = new int[1001];
    private int totalNum = 0;

    public void adiciona(int numero){
        this.num[this.totalNum] = numero;
        this.totalNum++;
    }

    public int tamanho(){
        return this.totalNum;
    }

    public int maximoRec(int[] num, int inicio, int fim){
        if(inicio == fim){
            return num[inicio];
        }
        else{
            int meio = (inicio + fim)/2;
            int max1 = maximoRec(num, inicio, meio);
            int max2 = maximoRec(num, meio+1, fim);

            if(max1 > max2){
                return max1;
            }
            else{
                return max2;
            }
        }
    }

    public int maximoIte(){
        int maiorValor = 0;
        for(int i=0;i<this.totalNum;i++){
            if(this.num[i] > maiorValor){
                maiorValor = this.num[i];
            }
        }
        return maiorValor;
    }
}
