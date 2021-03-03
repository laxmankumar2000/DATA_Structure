package Genaric;

import pog1.Employee;

interface Mystack<t> {

    public void push(t data);
    public t pop();
    public t peek();
    public boolean isEmpty();

}



class  StackByLinkedList<t> implements Mystack<t>
{
    node <t> top;

    public StackByLinkedList() {
        this.top =null;
    }

    @Override
    public void push(t data)
    {
        node newnode = new node(data);

        newnode.next = top;
        top = newnode;




    }

    @Override
    public t pop() {
        t result = null;
        if (isEmpty())
            return result;

        else {
            result = top.data;
            top = top.next;
            return result;
        }
    }

    @Override
    public t peek(){
        t result = null;
        if (isEmpty())
            return result;

        else {
            result = top.data;
//            top = top.next;
            return result;
        }


    }


    @Override
    public boolean isEmpty() {

        return (top==null);


       /* if (top==null)
        return true;
        else
            return false;
            */

    }

    public  void trverse()
    {
        node temp = top;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}

class test1010
{
    public static void main(String[] args) {

        StackByLinkedList<employee2> obj = new StackByLinkedList<>();
        employee2 obj1 = new employee2(101 , "laxman" , 2000);
        employee2 obj2 = new employee2(102,"ala",1212);
        employee2 obj3 = new employee2(103,"aaa",2313);
        obj.push(obj1);
        obj.push(obj2);
        obj.push(obj3);
        System.out.println(obj.peek());
        obj.trverse();
    }
}
