package atividade_4;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Axel", 20, 10.0f);
        Aluno a2 = new Aluno("Axel", 20, 10.0f);
       ConjuntoObjetos objetos = new ConjuntoObjetos();
        objetos.adiciona(a1);
        objetos.adiciona("aaaa");
        objetos.adiciona(1);
        objetos.adiciona(a2);
        System.out.println((objetos.tamanho()));
        System.out.println((objetos.contem(a1)));
        System.out.println(objetos.remove(1));
        System.out.println(objetos.tamanho());
        if(objetos.contem(a2)){
            System.out.println("O Objeto está no sistema");
        }
        else{
            System.out.println("O Objeto não está no sistema");
        }
        objetos.imprime();
    }
}
