package atividade_16;

//import java.util.Random;

public class Main {
    public static void main(String args[]){
        
        ABB tree = new ABB();
        //Random random = new Random();

        for(int i = 1; i < 51; i++){
            tree.addRecursive(i);
        }

        tree.inorder();

        System.out.println(tree.buscaRec(20));
        tree.delete(20);
        System.out.println(tree.buscaRec(20));
    }
}