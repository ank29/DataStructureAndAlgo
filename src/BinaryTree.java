class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;

    }
    public void printInOrder(Node root){
        if(root == null)
            return;
        else{
            printInOrder(root.left);
            System.out.print(root.data +" ");
            printInOrder(root.right);
        }
    }
    public void printPostOrder(Node root){
        if(root == null)
            return;
        else{
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public void printPreOrder(Node root){
        if(root == null)
            return;
        else{
            System.out.print(root.data+" ");
            printPreOrder(root.left);
            printPreOrder(root.right);
        }
    }
    public int getHeight(Node root){
        if (root == null)
            return 0;
        else{
            int leftHeight = getHeight(root.left);
            int rightHeight = getHeight(root.right);
            if(leftHeight > rightHeight)
                return leftHeight+1;
            else return rightHeight+1;
        }

    }
    public void printLevelOrder(Node root){
        int height = getHeight(root);
        for(int i =1;i<=height;i++){
            levelOrder(root,i);
        }
    }
    public void levelOrder(Node root,int level){
        if(root == null)
            return;
        else if(level ==1)
            System.out.print(root.data +" ");
        else {
            levelOrder(root.left,level-1);
            levelOrder(root.right,level-1);
        }
    }

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In Order");
        tree.printInOrder(tree.root); //Left,Root,Right
        System.out.println("");
        System.out.println("Pre Order");
        tree.printPreOrder(tree.root); //Root,Left,Righ
        System.out.println("");
        System.out.println("Post Order");
        tree.printPostOrder(tree.root); //Left,Right,Root
        System.out.println("");
        System.out.println("Level Order");
        tree.printLevelOrder(tree.root);

    }
}
