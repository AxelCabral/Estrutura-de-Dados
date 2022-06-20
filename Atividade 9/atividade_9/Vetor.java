package atividade_9;

public class Vetor {
    public int num[] = new int[10000];
    private int totalNum = 0;

    public void adiciona(int numero){
        this.num[this.totalNum] = numero;
        this.totalNum++;
    }

    public int tamanho(){
        return this.totalNum;
    }

    public void BubbleSort(){
        for(int i = 0; i < this.totalNum; i++){
            for(int j = 0; j < this.totalNum-1; j++){
                if(this.num[j] > this.num[j+1]){
                    int aux = this.num[j];
                    this.num[j] = this.num[j+1];
                    this.num[j+1] = aux;
                }
            }
        }
    }

    public void SelectionSort(){
        for(int i = 0; i < this.totalNum; i++){
            int menor = i;
            for(int j = i+1; j < this.totalNum; j++){
                if(this.num[j] < this.num[menor]){
                    menor = j;
                }
            }
            int aux = num[i];
            this.num[i] = this.num[menor];
            this.num[menor] = aux;
        }
    }

    public void InsertionSort(){
        for(int i = 1; i < this.totalNum; i++){
            int chave = this.num[i];
            int j = i - 1;
            while(j >= 0 && chave < this.num[j]){
                this.num[j + 1] = this.num[j];
                j--;
            }
            this.num[j + 1] = chave;
        }
    }
}
