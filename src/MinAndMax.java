// 12.	Write a program in Java to find min and max number from any 3 numbers which user enters.

import java.util.Scanner;

public class MinAndMax {


        public static void main(String [] args) { // main method

            Scanner scan = new Scanner(System.in);// an object of Scanner class
            System.out.print("Enter the First Number: "); // allows user to input Number

            int a = scan.nextInt();
            System.out.print("Enter the Second Number: ");// allows user to input Number
            int b = scan.nextInt();
            System.out.print("Enter the Third Number: ");// allows user to input Number
            int c = scan.nextInt();

            int i = Math.max(a, b); // condition
            i = Math.max(i, c);

            int s = Math.min(a, b);
            s = Math.min(s, c);
            System.out.println(); // creates space
            System.out.println("The Highest Number is :  " + i); // output
            System.out.println("The Smallest Number: " + s);// output
        }
    }
