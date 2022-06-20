package atividade_7;
import java.util.Random;

public class Main {
    public static void main(String args[]){

        Vetor vetor = new Vetor();

        Random numbers = new Random();
        for(int i=0;i<1000;i++){
            int number = numbers.nextInt(5000);
            vetor.adiciona(number);
        }

        long funcRec = System.currentTimeMillis();
        log("Maior número:"+vetor.maximoRec(vetor.num, 0, vetor.tamanho()));
        long funcRecF = System.currentTimeMillis() - funcRec;
        System.out.printf("Tempo de execução em segundos com método de recursão: %.5f", funcRecF/1000d);
        log("");
 
        long funcIte = System.currentTimeMillis();
        log("Maior número:"+vetor.maximoIte());
        long funcIteF = System.currentTimeMillis() - funcIte;
        System.out.printf("Tempo de execução em segundos com método iterativo: %.5f", funcIteF/1000d);
        log("");
    }

    public static void log(String text){
        System.out.println(text);
    }
}