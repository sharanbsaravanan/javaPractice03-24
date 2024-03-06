package PracticeSession;

/*Create a method in Java that takes an array
of integers as input and returns the sum of all
the elements.*/
public class SumofArray {
    public static void main(String[] args){
        int[] number ={23,65,98,45,44};
        int sum =calculatesum(number);
        System.out.println(sum);

}

    static int  calculatesum(int[] arr){
        int sum=0;
        for(int num : arr){
            sum = sum+num;
        }
        return sum;
    }
}
