//10.	Java Program to Print Multiplication Table for any Number

//  2 x 1 = 2
// 2 x 2 = 4
// 2 x 3 = 6

import java.util.Scanner;

public class Multiplication
{
    public static void main(String[] args) // main method
    {
        Scanner scan = new Scanner(System.in);// an object of Scanner class
        System.out.println("Enter Number "); // allows user to input Number
        int a = scan.nextInt();
        for (int i = 1; i <= 20; i++) // condition

        {
            System.out.println( a + "*" +i+ "=" + a *i); // output
        }
    }
}


