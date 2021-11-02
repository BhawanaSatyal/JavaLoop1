//2. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci
//number) – limitation is n.


import java.util.Scanner;

public class FibonnaciNumber {

    public static void main(String[] args) { // main method
        {
            int n1=0,n2=1,n3,i,count=10;

            System.out.println(n1+ " & " +n2);//prints 0 and 1


            for(i=2; i<count;++i)// loop
            {
                n3=n1+n2;
                System.out.println(" "+n3);
                n1=n2;
                n2=n3;
            }

        }
    }
}

