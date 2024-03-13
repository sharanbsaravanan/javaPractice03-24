package PracticeDay4;
/*create a method in Java to find the maximum
of two numbers without using the
Math.max() method.*/
public class FindMaxi {
    public static void main(String[] args) {
        int num1 =8722199;
        int num2 =962211128;

        int max= findMax(num1,num2);
        System.out.println("the maximum number of given two number is " + max);
    }


   public static int findMax(int num1, int num2){
        if(num1> num2){
            return num1;

        }
        else {
            return num2;
        }
}}

