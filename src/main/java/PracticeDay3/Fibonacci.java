package PracticeDay3;

import java.util.Scanner;
  /*Write a Java program to print the Fibonacci
series up to a given number using a for loop.*/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number : ");
        int value = scanner.nextInt();

        int num1 = 0;
        int num2 = 1;


        for ( int i = 1; i <= value; i++) {

            System.out.print( num1 + " ");

            int fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
        }
    }
}
