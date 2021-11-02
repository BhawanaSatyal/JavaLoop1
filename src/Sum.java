//8.	write a program that prints the sum of x ranging from 1 to 20.

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) { // main method
        int input = 20;
        int sum = 0;

        Scanner scan = new Scanner(System.in);// an object of Scanner class
        System.out.println(" Enter the Number: ");// allows user to input number
        input = scan.nextInt();


        for (int i = 1; i <= input ; i++) {  // condition
            sum = sum + i;

            System.out.println("Sum after adding " + i + " is : " + (sum + input));// output
        }
    }


}
