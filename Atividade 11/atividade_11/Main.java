package atividade_11;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Axel", 20, 10.0f);
        Aluno a2 = new Aluno("Lucas", 19, 5.9f);
        FilaVet fila = new FilaVet();
        System.out.println(fila.isEmpty());
        fila.add(a1);
        System.out.println(fila.size());
        fila.add(a2);
        System.out.println(fila.size());
        //fila.remove();
        //fila.remove();
        System.out.println(fila.isEmpty());
        fila.print();
    }
}