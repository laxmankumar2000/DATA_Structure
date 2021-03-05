package Stack;

public class StackByArray {
    int arr[];
    int toOfstack;

    public StackByArray(int size)
    {
        toOfstack=-1;
        arr =new int[size];

    }

    public boolean isEmpty()
    {
        if (toOfstack==-1)
            return true;
        else
            return false;
    }

    public boolean isFull()
    {
        if (toOfstack == arr.length-1     )
            return true;
        else
            return false;
    }

    public void push(int val)
    {
        if(isFull())
            System.out.println("stack id full");
        else
        {
            toOfstack++;
            arr[toOfstack] =val;
        }
    }

    public void pop()
    {
        System.out.println("in pop method" + arr[toOfstack]);
        toOfstack = arr[toOfstack--];

//        toOfstack--;

    }

    public void peek()
    {
        if (!isFull())
            System.out.println("peek value " + arr[toOfstack]);


    }

    public void display()
    {
        for (int i = 0; i <arr.length; i++)
        {
            System.out.println(" in stack " + arr[i]);
        }
    }


    public void deletearray()
    {
        arr = null;
    }
}



class test
{
    public static void main(String[] args) {

        StackByArray obj = new StackByArray(3);

        obj.push(12);
        obj.push(13);
        obj.push(14);

        obj.peek();

        obj.pop();

        obj.display();
    }
}

