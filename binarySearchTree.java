class new_Node {
    int data;
    new_Node left;
    new_Node right;

    new_Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    new_Node root = null;

    void insertTree(int data) {
        root = insert(root, data);
    }

    new_Node insert(new_Node root, int data) {
        if (root == null) {

            return new new_Node(data); // Create a new node if the position is empty
        }
        if (data < root.data) {
            root.left = insert(root.left, data); // Recur left for smaller values
        } else {
            root.right = insert(root.right, data); // Recur right for larger or equal values
        }
        return root; // Return the unchanged node pointer
    }
}

public class binarySearchTree {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insertTree(5);
        tree.insertTree(3);
        tree.insertTree(7);
        // Additional insertions can be done here
    }
}
