package atividade12_1;

public class Main {
    public static void main(String args[]){
        PilhaVet pilhaVet = new PilhaVet(5);
        pilhaVet.Push("n");
        pilhaVet.Push("a");
        pilhaVet.Push("t");
        pilhaVet.Push("a");
        pilhaVet.Push("n");


        System.out.println(pilhaVet.isPalindromo()); 
        pilhaVet.imprimeEstado();
    }
}
