// 9.	WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately


public class Division {

    public static void main(String[] args) { // main method

            System.out.println("Divided by 3: "); // message output

            for (int i=1; i<100; i++) {

                if (i%3==0)
                    System.out.println(i); // number output divisible by 3
            }

            System.out.println(" Divided by 5: ");

            for (int i=1; i<100; i++) {

                if (i%5==0) System.out.println(i); // number output divisible by 5

            }

        }
    }
