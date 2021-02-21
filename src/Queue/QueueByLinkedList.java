package Queue;

class Node                                                      //Node class  for LINKEDLIST
{
    int data;                                                  //Node class Attributes
    Node next;

    public Node(int datanode) {                                //constructor of Node class
        data = datanode;
        next = null;
    }


}

public class QueueByLinkedList                              // class for implementaion for Queue
{
    Node begaining;                                            //Begining variable for Queue
    Node top ;                                                 //Top variable for Queue

    QueueByLinkedList() {                                       //Conctructor for Queue
        begaining = null;
        top =null;
    }

    public boolean isEmpty()                                    //Empty Method
    {
        return top == null;
    }

    public void enQueue(int newdata)                                //Method for inserting a newNode
    {
        Node newnode = new Node(newdata);

        if (top == null)                                            //Empty Queue is Empty or not
        {
         begaining = newnode;
         top = newnode;
         return;
        }

        top.next = newnode;                                       //Newnode is assign in last node of Queue
        top = newnode;                                            //Top is equleto newnode

    }


    public void deQueue()                                           //Method for Delete node from queue
    {
        Node temp = begaining;                                      //Object of node class
        begaining = begaining.next;

        if(begaining == null)                                       //Check queue is empty
        {
            return;                                                  //Then return null
        }

        if(begaining ==null)                                         //Check begaining is null
        {
            top = null;                                              //Then change top to null for delete
        }
    }

    public void Display()                                            // Mehtod for Display queue
    {
        System.out.println("Queue in begining : " + begaining.data);
        System.out.println("Queue in top : " + top.data);
    }
}

class test99                                                            //MAin class
{
    public static void main(String[] args) {                            //Min Method

        QueueByLinkedList obj = new QueueByLinkedList();                //Object of Queue Class

        obj.enQueue(10);                                       //Enqueue mathod call
        obj.enQueue(20);
        obj.enQueue(30);

        obj.deQueue();                                                 //DeQueue method call


       obj.Display();                                                  //Display method is call
    }
}





