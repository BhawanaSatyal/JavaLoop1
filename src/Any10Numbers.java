//1. Print any 10 numbers between given/user input
//range. For eg. Print numbers between 23-33


import java.util.Scanner;

public class Any10Numbers {
    public static void main(String[] args) { // main method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");// allows user to input number
        int a = scan.nextInt();
        System.out.println(" Enter Second Number: ");// allows user to input number
        int b = scan.nextInt();

        number(a, b);
    }

    public static void number(int num1, int num2) {

        for(int i = num1; i<=num1+10; i++){ // condition to print 10 numbers

            System.out.println(i);// output

    }

    }
    }
