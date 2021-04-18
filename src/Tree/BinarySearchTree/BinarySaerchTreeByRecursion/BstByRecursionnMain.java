package Tree.BinarySearchTree.BinarySaerchTreeByRecursion;

public class BstByRecursionnMain {
    public static void main(String[] args) {

        Node root = new Node(50);
        Node n1 = new Node(40);
        Node n2 = new Node(90);
        Node n3 = new Node(70);

        BstByRecursionn.Insertion(null,root);
        BstByRecursionn.Insertion(root,n1);
        BstByRecursionn.Insertion(root,n2);
        BstByRecursionn.Insertion(root,n3);
        System.out.println();

        BstByRecursionn.search(root , n2);

        BstByRecursionn obj = new BstByRecursionn();

        obj.inorder(root);

    }
}
