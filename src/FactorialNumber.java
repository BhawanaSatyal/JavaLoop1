// 5.	Finding factorial of a number entered by user

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) { // main method
        int a;
        System.out.println("Enter the Number: "); // allows user to input number
        Scanner scan = new Scanner(System.in); // an object of Scanner class
        a = scan.nextInt();

        long fact = 1;
        int i = 1;
        while(i<=a)
        {
            fact = fact * i; i++; // condition
        }
        System.out.println("Factorial of "+a+" is: "+fact); // output
    }
}
