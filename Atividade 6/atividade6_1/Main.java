package atividade6_1;

public class Main {
    public static void main(String[] args) {
        Lista l = new LDE();
        l.insereInicio(5);
        l.insereInicio(10);
        l.insereFim(7);
        l.insereFim(9);
        l.remove(7);
        l.imprime();
        System.out.println(l.estaVazia());
        System.out.println(l.tamanho());
    }
}
