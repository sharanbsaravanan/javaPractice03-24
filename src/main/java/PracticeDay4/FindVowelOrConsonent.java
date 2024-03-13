package PracticeDay4;

import java.util.Scanner;

/*Write a Java program to check if a given
character is a vowel or consonant using a
switch statement.*/
public class FindVowelOrConsonent {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch =scanner.next().charAt(0);

        if(ch == 'a'|| ch== 'e' || ch =='i'|| ch == 'o'|| ch == 'u'||
                ch == 'A'|| ch== 'E' || ch =='I'|| ch == 'O'|| ch == 'U')
        {
            System.out.print("Given character is vowel");
        }
        else {
            System.out.print("Given character is consonent");
        }


    }
}
