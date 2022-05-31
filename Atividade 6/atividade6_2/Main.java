package atividade6_2;

public class Main {
    public static void main(String[] args) {
        Lista l = new LDE();
        Aluno al1 = new Aluno("Axel", 20, 10);
        Aluno al2 = new Aluno("Lucas", 18, 8);
        l.insereInicio(al1);
        l.insereFim(al2);
        System.out.println(l.estaVazia());
        System.out.println(l.tamanho());
        Aluno aluno3 = new Aluno("Luana", 22, 8);
        l.insereInicio(aluno3);
        l.imprime();
        System.out.println(l.remove(al2));
        l.imprime();
    }
}
