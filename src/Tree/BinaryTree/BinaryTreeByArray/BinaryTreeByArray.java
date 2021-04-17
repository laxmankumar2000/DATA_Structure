package Tree.BinaryTree.BinaryTreeByArray;

/* A tree node can have any no of children but in binary tree each node can have atmost two children.

 when we want to store a tree in an array we never use the 0th cell because of mathematical complexity.
 To root node we store at the first cell
 To refer Left child we use (2 * x) here x is parent node)
 To refer Right child we use ( 2 * x + 1)

 Binary Tree common operations
 1) creation of Tree
 2) insertion of a node
 3) searching of a node
 4) deletion of a node
 5) treaverse all nodes with three types
*/



public class BinaryTreeByArray {
    int arr[];                               //array declaration
    int size;
    int lastindex;

    public BinaryTreeByArray(int size)        // this is a Constructor off class
    {
        arr =  new int[size];
        this.size = size;
        lastindex = 0;
     }

     public void insert(int value)

             // inert the value in a treee in same as the inert in a array ....

     {
         if (lastindex == size)
             return;
         else
         {
             arr[lastindex+1] = value;
             lastindex++;
             System.out.println(value + " is inserted");

             //we can use  arr[++lastusedindex]= value;
         }
     }

     public int search(int value)

//    here return type of the method is int. if the value found it will return the index where it is found...
//  else return -1{means value is not available in the tree};

     {
         for (int i  = 1 ; i<=lastindex ; i++)
         {
             if (value == arr[i])
             {
                 System.out.println(arr[i] + " found at " + i + " index");
                 return i;
             }
             else
             {
                 System.out.println(value +" is not in tree");
             }
         }
         return -1;
     }

     public void delete(int value)
             //here we find the index of that value wwe want to delete in the tree, if it is not present, it return -1 otherwise
             //it will delete.
     {
         int location = search(value);

         if (location == -1)
         {
             return;
         }
         else
         {
             arr[location]= arr[lastindex];
             lastindex--;
         }
     }

     public void preordertraversal(int index)
     {
         if (index > lastindex)
             return;
         else
         {
             System.out.println(arr[index] + " ");
             preordertraversal(2*index);
             preordertraversal(2*index +1);
         }
     }

     public void postordertraversal( int index)
     {
         if (index > lastindex)
             return;
         else
         {
             postordertraversal(index*2);
             postordertraversal(index*2 +1);
             System.out.println(arr[index]);
         }
     }

     public  void inordertraversal(int index)
     {
         if (index>lastindex)
             return;
         else
         {
             inordertraversal(index*2);
             System.out.println(arr[index] + " ");
             inordertraversal(index*2+1);
         }
     }
}
