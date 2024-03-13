package PracticeDay4;
/*Write a Java program that returns true if a given number is palindrome, otherwise false.*/
public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;

        boolean palindrome =checkPalindrome(number);
        if(palindrome){
            System.out.println(number + " is a palindrome");
        }
        else {
            System.out.println(number + " is not a palindrome");
        }



    }

    public static boolean checkPalindrome(int num){
        int org =num, rev=0 , digit;

        while (num>0){
             digit = num%10;
            rev =rev* 10+digit;
            num =num/10;
        }
        return org== rev;
    }
}
