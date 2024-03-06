package PracticeSession;


import java.util.Scanner;

/*Write a Java program that converts
temperature from Celsius to Fahrenheit
using a method.*/
public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celsius :" );
        double celsius = scanner.nextDouble();

        double farenheit = temp(celsius);

        System.out.println(celsius + "  celsius equal to  " + farenheit + " farenheit ");

        scanner.close();

    }

    static double temp(double celsius){
        return (celsius * 9/5) + 32;
    }

}
