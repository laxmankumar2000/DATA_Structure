package CombineProgram;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CheckAnagram {
    public static void IsAnagram(String str1 , String str2)            //Method
    {
        str1 = str1.replaceAll("\\s" , "");            //Remove space from 1st String
        str2 = str2.replaceAll("\\s" , "");            //Remove space from 2nd String

        boolean status = true;                                      //Take a bolean variable
        if(str1.length() != str2.length())                               //Length Compare
        {
            status = false;
        }

        else
        {
            char ch1[] = str1.toLowerCase().toCharArray();           //Convert String into Char and Store in Char Array
            char ch2[] = str2.toLowerCase().toCharArray();           //Convert String into Char and Store in Char Array

            Arrays.sort(ch1);                                      //Sort char Array1
            Arrays.sort(ch2);                                      //Sort char Array2

            status = Arrays.equals(ch1,ch2);                       //equale Char1 and Char2 ,, and store boolean value in boolean varialbe
        }

        if(status)
        {
            System.out.println(str1 + " and " + str2 + "is ANAGRAM");  // print String is Anagram
        }
        else
        {
            System.out.println(str1 + " and " + str2 + " is NOT ANAGRAM"); //print String is not Anagram
        }

    }

    public static void main(String[] args) {                        //Main Methode
        Scanner obj = new Scanner(System.in);                       //Scanner Class

        System.out.println("Enter the Frist String");
        String str1 = obj.nextLine();                               //Input from user for String1

        System.out.println("Enter the Second String");
        String str2 = obj.nextLine();                                //Input from user for String2

        IsAnagram(str1,str2);                                        //Call method
    }

}
