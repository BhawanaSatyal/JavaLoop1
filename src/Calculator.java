// 7.	Making Calculator using the switch statement
// (The program takes three inputs from the user:
//one operator and 2 numbers. Based on the operator
//provided by the user, it performs the calculation on the
//numbers. Then the result is displayed on the screen.)

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) { // main method
        char symbol;
        double x, y, z = 0;

        Scanner input = new Scanner(System.in); // an object of Scanner class
        System.out.println("Enter first number"); // allows user to input number
        x  = input.nextDouble();
        System.out.println("Enter second number");// allows user to input second number
        y  = input.nextDouble();
        System.out.println("Enter any one of the symbols: +, -, *, or /");// allows user to input symbol
        symbol = input.next().charAt(0);

        calculate(symbol, x, y,z);
    }

    public static void calculate(char symbol, double num1, double num2, double output) {



        switch (symbol) {

            case '+' :
                output = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + output);// add numbers when + is entered
                break;
              case '-' :
                output = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + output);// subtract numbers when - is entered
                break;
             case '*' :
                output = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + output);// multiplication
                break;
            case '/' :
                output = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + output);// division
                break;
            default :
                System.out.println("Invalid Entry");
                break;

        }
    }
}

