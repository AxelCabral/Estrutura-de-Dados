public class Main{
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Axel", 20, 10.0f);
        Aluno a2 = new Aluno("Lucas", 19, 5.9f);
        ConjuntoAlunos alunos = new ConjuntoAlunos();
        alunos.adiciona(a1);
        System.out.println((alunos.tamanho()));
        System.out.println((alunos.contem(a1)));
        System.out.println((alunos.contem(a2)));
        //System.out.println(a1.getNome());
        //System.out.println(a1.getIdade());
        //System.out.println(a1.getNota());
    }
}