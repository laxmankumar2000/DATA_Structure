package Tree.BinaryTree;

public class BinaryTreeLinkedListMain {

    public static void main(String[] args) {

        BinaryTreeByLinkedList obj = new BinaryTreeByLinkedList();

        obj.Create_Tree();
        obj.InOrderTraversal(obj.root);
    }

}
