package atividade_17;

public class Main {
    public static void main(String[] args) {
        ABB tree = new ABB();
        //51, 57, 98, 19, 11, 45, 79
        tree.root = tree.insertNoh(tree.root, 51);
        tree.root = tree.insertNoh(tree.root, 57);
        tree.root = tree.insertNoh(tree.root, 98);
        tree.root = tree.insertNoh(tree.root, 19);
        tree.root = tree.insertNoh(tree.root, 11);
        tree.root = tree.insertNoh(tree.root, 45);
        tree.root = tree.insertNoh(tree.root, 79);
       
        tree.printTree(tree.root, "", true);
        System.out.println("After Deletion: ");
        tree.printTree(tree.root, "", true);
      }
}