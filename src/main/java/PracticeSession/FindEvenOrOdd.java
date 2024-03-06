package PracticeSession;


import java.util.Scanner;

//Write a Java program to determine if a given
//number is even or odd using if-else
//statements.
public class FindEvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();

        if(number%2==0){
            System.out.println("Even number");

        }
        else {
            System.out.println("odd number");
        }
    }
}
