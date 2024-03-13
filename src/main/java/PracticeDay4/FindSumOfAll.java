package PracticeDay4;

import java.util.Scanner;

/*Implement a Java program to find the sum of
all elements in an array.*/
public class FindSumOfAll {
    public static void main(String[] args) {

        int [] array = {54,89,79,46,78};

        int value=0;
        for(int i=0; i<array.length; i++) {
            value +=array[i];
        }
            System.out.println(value);


    }
}
