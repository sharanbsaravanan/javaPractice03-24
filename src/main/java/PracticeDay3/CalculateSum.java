package PracticeDay3;

import java.util.Scanner;

/*Write a Java program that calculates the sum
of digits of a given number using a method.*/
public class CalculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        int sum = sumOfDigit(number);
        System.out.println("sum of digit of : " + number + " is " + sum);
    }

  public static int sumOfDigit(int num){
        int sum =0;
        while (num !=0){
            int digit = num%10;
            sum =sum+ digit;
            num = num/10;
        }
        return sum;
}}


