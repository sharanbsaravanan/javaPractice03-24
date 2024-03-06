package PracticeSession;

import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number :" );

        int number = scanner.nextInt();

        int [] fibonacciSeries = generateFibo(number) ;
            System.out.print("Fibonacci Sequence of " + number + " numbers: ");
            for (int num : fibonacciSeries) {
                System.out.print(num + " ");
            }

        }

         static int[] generateFibo(int n) {
        int[] fibonacciSeries = new int[n];
        int a = 0;
        int b = 1;

        int i;
        for  (i = 0; i < n; i++) {
            fibonacciSeries[i] = a;
            int next = a + b;
            a = b;
            b = next;
        }
        return fibonacciSeries;
    }
}
