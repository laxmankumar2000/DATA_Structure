package Tree.BinaryTree.BinaryTreeByArray;

public class BinaryTreeByArrayMain {
    public static void main(String[] args) {

        BinaryTreeByArray obj = new BinaryTreeByArray(10);

        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);
        obj.insert(80);
        obj.insert(90);
        System.out.println();

        System.out.println("search is here");
        System.out.println(obj.search(50));
        System.out.println();

        System.out.println("delete is here");
        obj.delete(30);
        System.out.println();

        System.out.println("Postorder here");
        obj.preordertraversal(1);
        System.out.println();

        System.out.println("Preorder here");
        obj.preordertraversal(1);
        System.out.println();

        System.out.println("inorder here");
        obj.inordertraversal(1);


    }
}
