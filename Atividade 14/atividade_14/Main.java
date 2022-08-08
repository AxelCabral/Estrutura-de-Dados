package atividade_14;

public class Main {
    public static void main(String args[]){
        
        Aluno aluno1 = new Aluno("2022123456", "Axel", 20, 10);
        Aluno aluno2 = new Aluno("2022123457", "Chamber", 30, 8);
        Aluno aluno3 = new Aluno("2022123458", "Jett", 20, 9);
        Aluno aluno4 = new Aluno("2022123459", "Skye", 19, 2.5f);
        Aluno aluno5 = new Aluno("2022123451", "Irelia", 22, 30);
        Aluno aluno6 = new Aluno("2022123456", "Axel2", 20, 10);

        VetorHashMap HashMap = new VetorHashMap();
        
        System.out.println(HashMap.tamanho());

        HashMap.put(aluno1.getMatricula(), aluno1);
        HashMap.put(aluno2.getMatricula(), aluno2);
        HashMap.put(aluno3.getMatricula(), aluno3);
        HashMap.put(aluno4.getMatricula(), aluno4);
        HashMap.put(aluno5.getMatricula(), aluno5);
        System.out.println(HashMap.tamanho());

        HashMap.remove(aluno1.getMatricula());
        HashMap.put(aluno6.getMatricula(), aluno6);

        HashMap.print();
    }
}