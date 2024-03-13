package PracticeDay4;
/*Write a Java method to reverse a given
string.*/
public class ReverseGivenString {
    public static void main(String[] args) {
        String name = "asdfgh";
        String rev = "";

        for (int i=name.length()-1; i>=0; i--){
            rev+= name.charAt(i);

        }
        System.out.println("Original String is " + name);
        System.out.println("Reverse String  is " + rev);

    }
}
