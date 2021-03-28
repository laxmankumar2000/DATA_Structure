package CombineLinkedSatckQueue;

public class Exampratice {

//    1.LINKED LIST


    class node
    {
        int data;
        node next;

        public node(int data)
        {
            this.data=data;
            next = null;
        }
    }

    node head;

    public boolean isEmpty() {


        if (head == null)
            return true;
        else
            return false;
    }

    public void insertatbegiing(int data)
    {
        node newnode= new node(data);
        newnode.next = head;
        head=  newnode;
    }

    public void insertion(int data)
    {
        node newnode =new node(data);

        if (isEmpty())
        {
            head = newnode;
        }
        else
        {
            node temp=head;
            while (temp.next!=null)
            {
             temp=temp.next;
            }
            temp.next = newnode;
        }

    }

//    public void insertbetween()

    public void deleteLinkdeatbegining()
    {
        head = head.next;
    }

    public void deleteatlast()
    {
        node temp =head;
        node pre = null;
        while(temp.next!=null)
        {
            pre = temp;
            temp= temp.next;
        }
        pre.next=null;

    }

    public void display()
    {
        node temp = head;
        while(temp!=null)
        {
            System.out.println("inlinked" + temp.data) ;
            temp=temp.next;
        }
    }

}

class tets
{
    public static void main(String[] args) {

        Exampratice obj = new Exampratice();
        obj.insertion(12);
        obj.insertion(13);
        obj.insertion(15);

//        obj.deleteLinkdeatbegining();
//        obj.deleteatlast();

        obj.insertatbegiing(11);
        obj.display();
    }
}

    //2.circular singly linked list

    public void insert(int data)
    {
        node newnode= new node(data);

        if (isEmpty())
        {
            newnode.next = head;
            head = newmode;
        }
        else
        {
            node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next = newmode;
            newnode.next=head;

        }
    }



    //3.STCKBYAARAY
    int topofStack ;
    int arr[];
    public Exampratice(int size)
    {
        arr = new int[size];
        topofStack = -1;
    }

    public boolean isEmpty()
    {
        if (topofStack == -1)
            return true;
        else
            return false;
    }

    public boolean isFull()

    {
        {
            if (topofStack== arr.length-1)
                return true;
            else
                return false;
        }
    }

    public void insert(int data)
    {
        if (isFull())
            System.out.println("overflow");
        else {
            topofStack++;
            arr[topofStack] = data;
            System.out.println(data + "is pushed");
        }
    }

    public void pop()
    {
        if ( isEmpty())
        {
            System.out.println("downflow");

        }
        else{
            System.out.println("top" + topofStack);

            int x = arr[topofStack--];
            System.out.println("in x" + x);
        }
    }

    public void peek()
    {
        System.out.println("peekin stack" + arr[topofStack]);
    }
    public void delete()
    {
        arr= null;
    }
    public void display()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }


}
class test12
{
    public static void main(String[] args) {

        Exampratice obj = new Exampratice(3);
        obj.insert(11);
        obj.insert(12);
        obj.insert(13);
        obj.pop();
        obj.display();
    }


//    4.STACK BY LINKEDLINK

    class node{
        int data;
        node next;


        public node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    node topofstack;

    public Exampratice()
    {
        topofstack = null;
    }

    public boolean isEmpty()
    {
        if (topofstack == null)
            return true;
        else
            return false;
    }

    public void push(int data)
    {
        node newnode = new node(data);
        newnode.next = topofstack;
        topofstack = newnode;
        System.out.println(data + " ispushed");
    }

    public void pop()
    {
        if (isEmpty())
        {
            System.out.println("downlode");

        }
        else
        {
            System.out.println(topofstack.data + " is poped");
            topofstack = topofstack.next;
//            System.out.println();
        }
    }

    public void traverse()
    {
        node temp = topofstack;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

}

class tets
{
    public static void main(String[] args) {

        Exampratice obj = new Exampratice();
        obj.push(12);
        obj.push(13);
        obj.push(15);

        obj.pop();

        obj.traverse();
    }




//    5. Queue by array

    int arr[];
    int begining;
    int top;

    public Exampratice(int size){
        arr = new int[size];
        begining = -1;
        top = -1;
    }

    public boolean isEmpty() {
        if (begining == -1 || begining == arr.length)
            return true;
        else
            return false;
    }

    public boolean  isFull()
    {
        if (top == arr.length-1)
            return true;
        else return false;

    }

    public void enQueue(int data)
    {
        if (isFull())
        {
            System.out.println("Queu is full soe i=cannt insert");


        }
        else if (isEmpty())
        {
            begining = 0;
            top = top + 1;
            arr[top ] = data;
            System.out.println(data + " is pushed");

        }
        else
        {
            top++;
            arr[top ] = data;
            System.out.println(data + " s pushed");
        }
    }

    public void deQueue() {
        if (isEmpty())
            System.out.println("QueueisEmpty");

        else {
            System.out.println("dequeue " + arr[begining]);
            arr[begining] = 0;
            begining++;
        }
        if (begining> arr.length-1)
        {
            begining = top-1;
        }
    }

    public void peekinqueue()
    {
        if(!isEmpty())
        {
            System.out.println(arr[top]);
        }
    }

    public void deleteQueue()
    {
        arr=null;
    }

    public void travers()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
class test
{
    public static void main(String[] args) {

        Exampratice obj = new Exampratice(3);

        obj.enQueue(12);
        obj.enQueue(13);
        obj.enQueue(15);

        obj.deQueue();

    }



//    6. Queue By Linkedlist

    class node
    {
        int data;
        node next;

        public node (int data)
        {
            this.data = data;
            next = null;
        }

    }

    node begining;
    node top;

    public  boolean isEmpty()
    {
        if (begining == null && top ==null)
            return true;
        else return false;
    }

    public void enQueue(int data)
    {
        node newnode =new node(data);

        if(isEmpty())
        {
            begining=top=newnode;
            System.out.println(data +" insert");
        }
        else
        {
            top.next = newnode;
            top=newnode;
            System.out.println(data + "insert");
        }
    }

    public void dequeue()
    {
        if (isEmpty())
            System.out.println("fgfj");
        else
        {
            begining=begining.next;
        }
    }

    public void peek()
    {
        if(!isEmpty())
        {
            System.out.println("peek "+ top.data);
        }
    }

    public void traverse()
    {
        node temp=begining;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
class  test
{
    public static void main(String[] args) {
        Exampratice obj=new Exampratice();

        obj.enQueue(12);
        obj.enQueue(13);
        obj.enQueue(15);

        obj.dequeue();
        obj.traverse();

    }



//    7.CIRCULAR BY ARRAYLIST

    int arr[];
    int begining ;
    int top;
    int size;

    public Exampratice(int size)
    {
        arr = new int[size];
        begining = -1;
        top = -1;
        this.size = size;
    }

    public boolean isEmpty()
    {
        if (top == -1)
            return true;
        else return false;
    }

    public boolean isFull()
    {
        if (top + 1 == begining)
            return true;
        else if (begining == 0 && top+1 == size)
            return true;
        else
            return false;

    }

    public void enQueue(int data)
    {
        if (isFull())
        {
            System.out.println("queue is full");

        }
        else if (isEmpty())
        {
            begining = 0;
            top = 0;
            arr[top] = data;
            System.out.println(data + " is inesered");
        }
        else
        {
            if (top+1 ==size)
            {
                top=0;
            }
            else
            {
                top++;
            }
            arr[top ] = data;
            System.out.println(data + " in" );
        }
    }
    public void deQueue()
    {
        if (isEmpty())
        {
            System.out.println("empty");
        }
        else
        {
            System.out.println(arr[begining]);
            if (begining==top)
            {
                begining = top -1;
            }
            else if (begining+1 == size)
            {
                begining = 0;
            }
            else
            {
                begining++;
            }

        }

    }
}
class test
{
    public static void main(String[] args) {
         Exampratice obj = new Exampratice(3);
         obj.enQueue(11);
         obj.enQueue(12);
         obj.enQueue(13);

         obj.deQueue();
    }


        8. PRIOTITY OF QUEUE

    class node
    {
        int data;
        int priority;
        node next;

        public node(int data , int priority)
        {
            this.data = data;
            this.priority = priority;
            next = null;
        }
    }
    node begining  , top ;

    public boolean isEmpty()
    {
        if (top == null)
        {
            return true;
        }
        else return false;
    }

    public void specialdequeue(int priority , int data)
    {
        node newnode = new node(data , priority);

        if(isEmpty())
        {
            begining = newnode;
        }
        else if (newnode.priority< begining.priority)
        {
            newnode.next = begining;
            begining = newnode;
        }
        else
        {
            node temp = begining;
            while(temp.next!=null && temp.next.priority<= newnode.priority)
            {
                temp= temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }

    }
    public void trverse()
    {
        node temp = begining;
        while(temp!=null)
        {
            System.out.println(temp.data);

            temp = temp.next;
        }

    }
}

class test
{
    public static void main(String[] args) {

        PriorityOFQueue obj=new PriorityOFQueue();
        obj.specialdequeue(2,12);
        obj.specialdequeue(1,13);

        obj.trverse();

    }



     9.TOWER OF HONOII

    public void toh(int n, char s, char a, char d) {
        if (n>=1)
        {
            toh(n-1,s,d,a);
            System.out.println(n + " " + s + "==>" + d);
            toh(n-1 ,a, s, d);

        }

    }
}
class test
{
    public static void main(String[] args) {

        Exampratice obj = new Exampratice();
        obj.toh(4,'a' , 'b' , 'c');
    }






}


