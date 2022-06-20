package atividade_8;

public class Main {
    public static void main(String args[]){

        Vetor vetor = new Vetor();

        for(int i=0;i<1000;i++){
            vetor.adiciona(i+1);
        }

        long funcRec = System.currentTimeMillis();
        log("Posição do valor:"+vetor.buscaBinRec(vetor.num, 0, vetor.tamanho(), vetor.tamanho()));
        long funcRecF = System.currentTimeMillis() - funcRec;
        System.out.printf("Tempo de execução em segundos com método de recursão: %.5f", funcRecF/1000d);
        log("");
 
        long funcIte = System.currentTimeMillis();
        log("Posição do valor:"+vetor.buscaBinIte(1000));
        long funcIteF = System.currentTimeMillis() - funcIte;
        System.out.printf("Tempo de execução em segundos com método iterativo: %.5f", funcIteF/1000d);
        log("");
    }

    public static void log(String text){
        System.out.println(text);
    }
}