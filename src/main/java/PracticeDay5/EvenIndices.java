package PracticeDay5;
/*Implement a Java program to find the sum of
elements in the even indices of an array.
*/
public class EvenIndices {
    public static void main(String[] args) {
        int[] arr ={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum=0;

        for(int i=0; i<arr.length; i+=2){
            sum += arr[i];

        }
        System.out.println(sum);


    }
}
