package PracticeDay5;
/*Write a Java method to find the GCD
(Greatest Common Divisor) of two numbers
using recursion.
*/
public class FindGcd {
    public static void main(String[] args) {
        int num1 =84;
        int num2 =36;
        int gcd= findGcd(num1,num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is  : " + gcd );
    }

    public static int findGcd(int a, int b){
        if(b==0){
            return a;
        }
        else {
            return findGcd(b,  a%b);

        }
    }
}
