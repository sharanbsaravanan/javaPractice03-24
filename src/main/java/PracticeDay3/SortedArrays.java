package PracticeDay3;

import java.util.Arrays;

/*Create a Java program to merge two sorted
arrays into a single sorted array.*/

public class SortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1,3,52,7,99};
        int[] array2 = {2,4,6,88,10};

        int[] mergedArray = mergeArrays(array1,array2);

        System.out.print("merged arrays are : " + Arrays.toString(mergedArray));

    }


    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergedArray =new int[arr1.length + arr2.length];
     int i=0, j=0, k=0;


     while (i< arr1.length && j< arr2.length){
         if(arr1[i] <= arr2[j]){
             mergedArray[k++]=arr1[i++];
         }
         else {
             mergedArray[k++]=arr2[j++];

         }
     }
        while (i < arr1.length) {

            mergedArray[k++]=arr1[i++];

        }
        while ((j < arr2.length)) {

            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }
}
