package PracticeDay5;
/*Create a Java program to find the second
smallest element an array without sorting
it.

*/
public class FindSecondSmall {
    public static void main(String[] args) {
        int[] num = {4, 9, 26, 49, 3, 1, 6, 7, 88};

        Integer smaller = Integer.MAX_VALUE;
        Integer secondSmaller = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < smaller) {
                secondSmaller = smaller;
                smaller = num[i];
            } else if (num[i] < secondSmaller && num[i] != smaller) {
                secondSmaller = num[i];

            }
        }
        if (secondSmaller != Integer.MAX_VALUE) {
            System.out.println(secondSmaller);
        } else {
            System.out.println("there is no second small value ");
        }
    }
}