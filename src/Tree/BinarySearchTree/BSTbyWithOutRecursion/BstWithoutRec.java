package Tree.BinarySearchTree.BSTbyWithOutRecursion;

public class BstWithoutRec {
    Node root;

    public void insertion(int val)
    {
        Node newnode = new Node(val);

        if (root == null)
        {
            root = newnode;
            System.out.println( val + " is  inserted as a root");
        }
        else
        {
            Node current = root;
            Node parent = null;

            while(true)
            {
                if (current.data > val)
                {
                    current = current.left;
                    if (current== null) {
                        current = newnode;
                        System.out.println(val + " is inserted");
                        return;
                    }
                }
                else if (current.data<val)
                {
                    current = current.right;
                    if (current == null)
                    {
                        current = newnode;
                        System.out.println(val +  " is inserted");
                        return;
                    }
                }
            }
        }
    }
}

class test
{
    public static void main(String[] args) {

        BstWithoutRec obj = new BstWithoutRec();

        obj.insertion(10);
        obj.insertion(20);
        obj.insertion(30);
        obj.insertion(5);

    }
}