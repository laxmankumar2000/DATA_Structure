package Tree.BinarySearchTree.BinarySaerchTreeByRecursion;

public class BstByRecursionn {

    Node root;

    public static Node  Insertion(Node root , Node newnode)
    {
        if (root == null) {
            root = newnode;
            return root;
        }
        if (root.data > newnode.data)
        {
            if (root.left == null)
                root.left = newnode;
            else
                Insertion(root.left , newnode);
        }
        else if (root.data < newnode.data)
        {
            if (root.right == null)
            {
                root.right = newnode;
            }
            else
            {
                Insertion(root.right , newnode);
            }
        }
        return root;
    }

    public void inorder(Node root)
    {
        if (root == null)
            return;
        else
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public static boolean search(Node root  ,  Node searchnode)
    {
        if (root == null)
            return false;
        if (root.data == searchnode.data)
            return true;
        boolean result = false;

        if (root.data> searchnode.data)
        {
           result = search(root.left , searchnode);
        }
        else if (root.data < searchnode.data){
            result = search(root.right,searchnode);
        }
        return result;
    }


/*
    public Node delete(Node root, int val) {
        if (root == null)
            return null;
        if (val < root.data)
            root.left = delete(root.left, val);
        if (val > root.data)
            root.right = delete(root.right, val);
        else {
            if (root.left == null || root.right == null) {
                Node temp;
                temp = root.left == null ? root.right : root.left;
                if (temp == null) {
                    return null;
                } else {
                    return temp;
                }
            }
        }
        return null;
    }

 */

}
