package Sortting.SelectionSort;

import java.util.Scanner;

public class SelectionSortExample {

    public static  void SelectionSort(int arr[])
    {
        int j , k , min , temp;

        for (int i = 0 ; i< arr.length-1 ; i++)
        {
            min = i;
            for (int l = i+1; l < arr.length ; l++)
            {
                if (arr[l]<arr[min])
                {
                    min = l;
                }
            }

            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void print(int arr[])
    {
        for (int i = 0 ; i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

class test101{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter the 5 values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Array before sort");
        SelectionSortExample.print(arr);
        System.out.println();

        SelectionSortExample.SelectionSort(arr);

        System.out.println("Array after sort");
        SelectionSortExample.print(arr);
    }
}
