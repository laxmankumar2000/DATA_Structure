package Queue;

public class QueueByArray {                    // Queue Class
    int arr[] ;                                //Array intiliazation
    int begining;                              //Attributes
    int top;

    public QueueByArray(int size)               //Conctructor
    {
        arr =new int[size];                    //array declaration
        begining = -1;
        top = -1;
    }

    public boolean isEmpty()                    //Isempty Method
    {
        if (begining==-1 || begining == arr.length)
            return true;
        else
            return false;

    }

    public boolean isFull()                     //isFull Method
    {
        if (top == arr.length-1)
        {
            return true;
        }
        else
            return false;
    }

    public void enQueue(int val)                //Method for Value insert in queue
    {
        if(isFull())
            System.out.println("overflow");
        else if (isEmpty())
        {
            begining = 0;
            top++;
            arr[top] = val;
            System.out.print("Value " + val + " is inseted");
            System.out.println();
        }
        else
        {
            top ++;
            arr[top] = val;
            System.out.print("Value " + val + " is inseted");
            System.out.println();
        }

    }

    public void deQueue()                           //Method for Delete value in Queue
    {
        if (isEmpty())
            System.out.println("Empty");
        else {
            System.out.println(arr[begining]);
            arr[begining] =0;
            begining++;
        }
        if(begining>arr.length-1)
        {
            begining=top-1;
        }
    }

    public void PeekOfQueue()                       //Method for find Peek value In the queue
    {
        if (!isEmpty())
            System.out.println(arr[top]);
    }

    public void deleteQueue()
    {
       arr = null;
        System.out.println("queue Deleted");
    }

    public void displayQueue()                          //Method for Display Queue
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("value in queue"+ arr[i]);

        }
    }

    public void traverse() {                            //Method for Display Queue
        int temp = begining;
        while(temp<=top)
        {
            System.out.println(arr[temp]);
            temp++;
        }
    }




}

class test                                                              //Main Class
{
    public static void main(String[] args) {                            //Main Method
        QueueByArray obj = new QueueByArray(3);                     //Objdect of class

        obj.enQueue(10);                                            //insert value
        obj.enQueue(11);                                            //insert value
        obj.enQueue(12);                                            //insert value
        System.out.println();

        System.out.println("peek of Queue");
        obj.PeekOfQueue();                                              //call peek method
        System.out.println();

//            obj.deQueue();
        obj.displayQueue();                                             //Call deisplay method


    }
}
