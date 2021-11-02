// 3.	Program to check whether input number is prime or not

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) { // main method
        int num;
        boolean a = false;
        Scanner scan = new Scanner(System.in); //create a scanner object for input
        System.out.print("Enter a number: ");// allows user to input number
        num = scan.nextInt();

        for (int i = 2; i <= num / 2; ++i) // condition for nonprime number
        {
            if (num % i == 0) {
                a = true;
                break;
            }
        }
        if (!a)
            System.out.println(num + " is a Prime number.");// output when condition is met
        else
            System.out.println(num + " is not a Prime number.");// output when condition is met
    }
}