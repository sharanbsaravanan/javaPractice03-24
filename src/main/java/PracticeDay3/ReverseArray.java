package PracticeDay3;

import java.util.Arrays;
import java.util.Scanner;

/*Implement a Java program to reverse an
array without using any additional array.*/
public class ReverseArray {
    public static void main(String[] args) {
       int[] value= {1,2,3,4,5};
        System.out.println("original array :"  + Arrays.toString(value));
        int length = value.length;
        for(int i =0; i< length/2; i++){
            int temp = value[i];

            value[i] = value[length -1-i];
            value[length-1-i]=temp;

        }
        System.out.println("Reversed array is : " +Arrays.toString(value));


    }
}
