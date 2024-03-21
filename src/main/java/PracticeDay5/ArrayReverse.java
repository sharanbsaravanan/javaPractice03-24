package PracticeDay5;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        System.out.print("Original array  : ");

        for(int i =0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        System.out.print("Reversed array :  ");

        for (int i= array.length-1; i>= 0; i--)
        System.out.print(array[i] +" ");
    }
}
