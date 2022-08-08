package atividade_17;

class ABB {
    Noh root;
  
    int height(Noh N) {
      if (N == null)
        return 0;
      return N.height;
    }
  
    int max(int a, int b) {
      return (a > b) ? a : b;
    }
  
    Noh rightRotate(Noh y) {
      Noh x = y.left;
      Noh T2 = x.right;
      x.right = y;
      y.left = T2;
      y.height = max(height(y.left), height(y.right)) + 1;
      x.height = max(height(x.left), height(x.right)) + 1;
      return x;
    }
  
    Noh leftRotate(Noh x) {
      Noh y = x.right;
      Noh T2 = y.left;
      y.left = x;
      x.right = T2;
      x.height = max(height(x.left), height(x.right)) + 1;
      y.height = max(height(y.left), height(y.right)) + 1;
      return y;
    }
  
    // Get balance factor of a Noh
    int getBalanceFactor(Noh N) {
      if (N == null)
        return 0;
      return height(N.left) - height(N.right);
    }
  
    // Insert a Noh
    Noh insertNoh(Noh Noh, int item) {
  
      // Find the position and insert the Noh
      if (Noh == null)
        return (new Noh(item));
      if (item < Noh.item)
        Noh.left = insertNoh(Noh.left, item);
      else if (item > Noh.item)
        Noh.right = insertNoh(Noh.right, item);
      else
        return Noh;
  
      // Update the balance factor of each Noh
      // And, balance the tree
      Noh.height = 1 + max(height(Noh.left), height(Noh.right));
      int balanceFactor = getBalanceFactor(Noh);
      if (balanceFactor > 1) {
        if (item < Noh.left.item) {
          return rightRotate(Noh);
        } else if (item > Noh.left.item) {
          Noh.left = leftRotate(Noh.left);
          return rightRotate(Noh);
        }
      }
      if (balanceFactor < -1) {
        if (item > Noh.right.item) {
          return leftRotate(Noh);
        } else if (item < Noh.right.item) {
          Noh.right = rightRotate(Noh.right);
          return leftRotate(Noh);
        }
      }
      return Noh;
    }
  
    Noh NohWithMimumValue(Noh Noh) {
      Noh current = Noh;
      while (current.left != null)
        current = current.left;
      return current;
    }
  
    // Delete a Noh
    Noh deleteNoh(Noh root, int item) {
  
      // Find the Noh to be deleted and remove it
      if (root == null)
        return root;
      if (item < root.item)
        root.left = deleteNoh(root.left, item);
      else if (item > root.item)
        root.right = deleteNoh(root.right, item);
      else {
        if ((root.left == null) || (root.right == null)) {
          Noh temp = null;
          if (temp == root.left)
            temp = root.right;
          else
            temp = root.left;
          if (temp == null) {
            temp = root;
            root = null;
          } else
            root = temp;
        } else {
          Noh temp = NohWithMimumValue(root.right);
          root.item = temp.item;
          root.right = deleteNoh(root.right, temp.item);
        }
      }
      if (root == null)
        return root;
  
      // Update the balance factor of each Noh and balance the tree
      root.height = max(height(root.left), height(root.right)) + 1;
      int balanceFactor = getBalanceFactor(root);
      if (balanceFactor > 1) {
        if (getBalanceFactor(root.left) >= 0) {
          return rightRotate(root);
        } else {
          root.left = leftRotate(root.left);
          return rightRotate(root);
        }
      }
      if (balanceFactor < -1) {
        if (getBalanceFactor(root.right) <= 0) {
          return leftRotate(root);
        } else {
          root.right = rightRotate(root.right);
          return leftRotate(root);
        }
      }
      return root;
    }
  
    void preOrder(Noh Noh) {
      if (Noh != null) {
        System.out.print(Noh.item + " ");
        preOrder(Noh.left);
        preOrder(Noh.right);
      }
    }
  
    // Print the tree
    public void printTree(Noh currPtr, String indent, boolean last) {
      if (currPtr != null) {
        System.out.print(indent);
        if (last) {
          System.out.print("R----");
          indent += "   ";
        } else {
          System.out.print("L----");
          indent += "|  ";
        }
        System.out.println(currPtr.item);
        printTree(currPtr.left, indent, false);
        printTree(currPtr.right, indent, true);
      }
    }
}