// 4.	Reverse a number using for Loop

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) { // main method
        int number = 0;
        int a = 0;
        int b;
        Scanner scan = new Scanner(System.in);// an object of Scanner class
        System.out.println( "Enter Number:");// allows user to enter number
        b = scan.nextInt();

        for (;b !=0;)
        {
            a = a * 10;
            a = a + b%10;
            b = b/10;
        }

        System.out.println("Reverse Number is: " +a);// output
    }

}
