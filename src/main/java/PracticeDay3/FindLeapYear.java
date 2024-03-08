package PracticeDay3;

import java.util.Scanner;

/*Create a Java program that checks if a given
year is a leap year or not using if-else
statements.*/
public class FindLeapYear {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the year : ");
          int year = scanner.nextInt();

          if((year%4 ==0 && year%100 !=0 ) || (year %400 ==0)) {
              System.out.println("It is a leap year");
          }
          else {
              System.out.println("its not a leap year");
          }
      }
}
