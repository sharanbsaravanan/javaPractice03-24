package PracticeDay4;

import java.util.Scanner;


        /*Create a Java program to print the
        multiplication table of a given number using
        a for loop.*/

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to multiply : ");
        int mul= scanner.nextInt();

        for(int i=1; i<=10; i++){


        System.out.println( i + " * " + mul + " = : " + i*mul );

    }
    }
}
