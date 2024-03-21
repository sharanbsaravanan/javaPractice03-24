package PracticeDay5;

import java.util.Scanner;

/*
Create a Java program to find the factorial of
a given number using a while loop
*/
public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int num= sc.nextInt();
        int factorial=1;
    int i=1;


        while (i<= num){
            factorial = factorial*i;
            i++;
        }
        System.out.println("The given number" + num + "factorial is  : " + factorial);

    }
}
