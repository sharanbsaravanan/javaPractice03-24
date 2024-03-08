package PracticeDay3;

import java.util.Scanner;
/*Create a method in Java to find the factorial
of a given number using recursion.*/
public class FindFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int number = scanner.nextInt();

        int fact  = factorial(number);

        System.out.println("Factorial of : " + number + " is " + fact)  ;
    }
    public static int factorial(int num){
        if(num ==0 || num ==1){
            return 1;

        }
        else {
            return num*factorial(num-1);
        }
    }

}
