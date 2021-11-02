// 11.	WAP to enter any String and count total number of 'a' in that String.

import java.util.Scanner;

public class StringCount {


    public static void main(String[] args) { // main method
        Scanner scan = new Scanner(System.in);// an object of Scanner class
        System.out.println("Type a word");// allows user to input
        String string = scan.next();

        int c = 0;

        for(int i = 0; i < string.length(); i++) {
            if((string.charAt(i) == 'a')||(string.charAt(i) == 'A'))// condition
                c++;
        }

        System.out.println("Total number of 'a' or 'A' in a sentence is : " + c);// output
    }
}
