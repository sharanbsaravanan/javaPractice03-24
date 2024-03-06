package PracticeSession;


import java.util.Scanner;

/*write a Java program to calculate the
factorial of a given number using a while
loop.*/
public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        int factorial= 1;
        int i = 1;

        while (i<= number)
        {
            factorial *= i;
            i++;
        }
        System.out.println("factorial of " + number + " is " + factorial);
        scanner.close();


    }

}
