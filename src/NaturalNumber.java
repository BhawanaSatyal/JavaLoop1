// 6.	Display Sum of n Natural Number

public class NaturalNumber {


        public static void main(String[] args)// main method
        {

            int num = 100, sum = 0;

            for(int i = 1; i <= num; ++i)  // sum = sum + i;
            {

                sum += i;
            }

            System.out.println("Sum = " + sum);// output
        }
    }

