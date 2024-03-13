package PracticeDay4;

/*Write a Java program to find the largest
among two numbers without using
conditional statements (if-else).*/
public class FindLargest {
    public static void main(String[] args) {

        int num1 = 7877, num2 = 29290;
        System.out.println("largest number is :" + largestNum(num2, num1));
    }

    static int largestNum(int x, int y) {
        return (Math.abs(x - y) + (x + y)) / 2;
    }
}