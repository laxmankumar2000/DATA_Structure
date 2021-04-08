package Tree.BinaryTree;

import java.util.Scanner;

public class BinaryTreeByLinkedList {

        Node root;
        Scanner s = new Scanner(System.in);

        public void Create_Tree()
        {
            System.out.println("enter the 7 values for tree Creation");
            Node n1 = new Node(s.nextInt());
            Node n2 = new Node(s.nextInt());
            Node n3 = new Node(s.nextInt());
            Node n4 = new Node(s.nextInt());
            Node n5 = new Node(s.nextInt());
            Node n6 = new Node(s.nextInt());
            Node n7 = new Node(s.nextInt());
            root = n1;
            root.left = n2;
            root.right = n3;
            n2.left = n4;
            n2.right = n5;
            n3.left = n6;
            n4.right = n7;
        }


        public void InOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            InOrderTraversal(root.left);
            System.out.println(root.data);
            InOrderTraversal(root.right);
        }



}
