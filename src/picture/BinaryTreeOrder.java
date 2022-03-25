package picture;

public class BinaryTreeOrder {

    public void preOrder(Node root) {
        if(root!= null){
            System.out.print(root.toString());
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
