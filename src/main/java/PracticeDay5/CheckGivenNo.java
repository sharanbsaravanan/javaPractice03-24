package PracticeDay5;

import java.util.Scanner;

/*Write a Java program to check if a given
number is positive, negative, or zero.
*/
public class CheckGivenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double number = sc.nextDouble();

            if(number> 0){
                System.out.println( "positive  number");

            }
            else if(number <0){
                System.out.println("negative number");
        }
            else {
                System.out.println("Given number is zero");
            }

            sc.close();

    }
}
