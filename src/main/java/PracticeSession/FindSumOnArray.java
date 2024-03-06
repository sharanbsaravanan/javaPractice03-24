package PracticeSession;


import java.io.OptionalDataException;

/*Write a Java program to find the sum an
average of elements in an array.*/
public class FindSumOnArray {
    public static void main(String[] args) {
        int numbers[] ={10,20,30,40,50};
        int sum =0;
    for (int number: numbers) {
        sum =sum + number;
    }
        System.out.println("sum of array elements :" + sum);
        double avg =(double) sum/numbers.length;
        System.out.println("avg of array elements :" + avg);
    }
    }
