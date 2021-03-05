package Stack;

class Node
{
    int data;
    Node next;

}
public class StackByLinkedList {
    Node top;

    public StackByLinkedList()
    {
        top=null;
    }

    public boolean isEmpty()
    {
        if (top==null)
            return true;
        else
            return false;
    }

    public void push(Node newnode)
    {
        if (isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        System.out.println("insert "  + newnode.data);



        newnode.next = top;
        top=newnode;

    }

    public void pop()
    {
        System.out.println(top);
        top = top.next;
    }

    public void peek()
    {
        if (!isEmpty())
            System.out.println(top.data);
    }

    public void display()
    {

    }
}

class Main
{
    public static void main(String[] args) {
        StackByLinkedList obj = new StackByLinkedList();
        Node n1 = new Node();
        n1.data = 10;
        obj.push(n1);


        Node n2 = new Node();
        n2.data = 11;
        obj.push(n2);


        obj.pop();
    }
}
