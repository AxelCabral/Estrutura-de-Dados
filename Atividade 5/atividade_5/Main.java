package atividade_5;

public class Main {
    public static void main(String[] args) {
        Lista l = new LSE();
        l.insereInicio(5);
        l.insereInicio(10);
        l.insereFim(7);
        l.remove(5);
        l.imprime();
        System.out.println(l.estaVazia());
        System.out.println(l.tamanho());
    }
}
