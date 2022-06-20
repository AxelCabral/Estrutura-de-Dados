package atividade_8;

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

    public int buscaBinRec(int[] num, int inicio, int fim, int valor){
        int meio = (inicio+fim)/2;
        if(num[meio] == valor){
            return meio;
        }
        else if(num[meio] > valor){
            int b1 = buscaBinRec(num, inicio, meio-1, valor);
            return b1;
        }
        else{
            int b1 = buscaBinRec(num, meio+1, fim, valor);
            return b1;
        }
    }

    public int buscaBinIte(int valor){
        int inicio = 0;
        int fim = this.totalNum;
        int meio = 0;
        while(inicio <= fim){
            meio = (inicio+fim)/2;
            if(num[meio] == valor){
                return meio;
            }
            else if(num[meio] > valor){
                fim = meio-1;
            }
            else{
                inicio = meio+1;
            }
        }
        return meio;
    }
}
