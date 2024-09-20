// Binary Tree implementation

class Node{
    int data ;
    int position ;
    new_Node left ;
    new_Node right ;
    Node(int data){
        this.data = data ;
        this.right = null ;
        this.left = null ;
    }
}
class binaryTree{
    new_Node root = null ;
    void inorder(new_Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    void preorder(new_Node root){
        if(root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postOrder(new_Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data);
        }
    }
}

public  class binaryTreeImplementation{
    public static void main(String[] args) {
        binaryTree t = new binaryTree();

        t.root = new new_Node(5);
        t.root.left = new new_Node(10) ;
        t.root.right = new new_Node(15);
        t.inorder(t.root);
        t.preorder(t.root);
    }
}

