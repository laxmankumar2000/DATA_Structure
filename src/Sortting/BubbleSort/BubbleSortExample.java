package Sortting.BubbleSort;

import java.util.Scanner;

public class BubbleSortExample {

    public static  void Bubblesort(int arr[])
    {
        int n = arr.length;
        int temp =0;

        for (int i = 0; i < n-1  ; i++) {
            {
                for (int j = 0; j < n-1-i; j++) {
                    {
                        if (arr[j]>arr[j+1])
                        {
                            temp = arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }

                }
            }

        }
    }

    static void print(int arr[])
    {
        for (int i = 0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int arr [] = new int[5];
        System.out.println("enter hte element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println();

        System.out.println("array before sort");
        print(arr);
        System.out.println();

        System.out.println("array after sort");
        Bubblesort(arr);
        print(arr);
    }
}
