package PracticeSession;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age : " );

        int age = scanner.nextInt();

        String result =(age>= 18) ? "Eligible to vote" : "not eligible to vote";
        System.out.println(result);


    }

}
