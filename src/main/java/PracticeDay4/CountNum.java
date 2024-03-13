package PracticeDay4;
/*Write a Java program to count the number of
occurrences of a specific element in an array.*/
public class CountNum {
    public static void main(String[] args) {

        int[] num= {1,4,5,7,6,4,2,4,3,4,6,4,6,7,8,9};

        int target =4;

        int count =0;
        for(int i=0; i<num.length; i++){
            if(num[i]==target){
                count++;
            }
        }
        System.out.println("number of occurences " + target + "  in array is " + count);

    }
}
