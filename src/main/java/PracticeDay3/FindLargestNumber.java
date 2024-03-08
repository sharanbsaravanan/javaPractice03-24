package PracticeDay3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*Write a Java program to find the largest
among three numbers using nested if-else
statements.*/
public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number : ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter the Third Number : ");
        double number3 = scanner.nextDouble();


        double largest;

        if (number1 >= number2) {
            if (number1 >= number3) {
                largest = number1;
            } else {
                largest = number3;
            }
        } else {
            if (number2 >= number3) {
                largest = number2;
            } else {
                largest = number3;
            }
        }

        System.out.print("the largest number is : " + largest);
    }
}

