package atividade_9;

import java.util.Random;

public class Main {
    public static void main(String args[]){

        Vetor vetor10 = new Vetor();
        Vetor vetor100 = new Vetor();
        Vetor vetor1000 = new Vetor();
        Vetor vetor10000 = new Vetor();

        Random random = new Random();

        for(int i =0; i<10; i++){
            int numero = random.nextInt(10);
            vetor10.adiciona(numero);
        }
        for(int i =0; i<100; i++){
            int numero = random.nextInt(100);
            vetor100.adiciona(numero);
        }
        for(int i =0; i<1000; i++){
        int numero = random.nextInt(1000);
        vetor1000.adiciona(numero);
       }
       for(int i =0; i<10000; i++){
        int numero = random.nextInt(10000);
        vetor10000.adiciona(numero);
       }

        long func = System.currentTimeMillis();
        //vetor10.BubbleSort();
        //vetor100.BubbleSort();
        //vetor1000.BubbleSort();
        //vetor10000.BubbleSort();
        //vetor10.SelectionSort();
        //vetor100.SelectionSort();
        //vetor1000.SelectionSort();
        //vetor10000.SelectionSort();
        //vetor10.InsertionSort();
        //vetor100.InsertionSort();
        //vetor1000.InsertionSort();
        vetor10000.InsertionSort();
        long funcF = System.currentTimeMillis() - func;
        
        System.out.printf("Tempo de execução em segundos: %.5f", funcF/1000d);

    }

    public static void log(String text){
        System.out.println(text);
    }
}