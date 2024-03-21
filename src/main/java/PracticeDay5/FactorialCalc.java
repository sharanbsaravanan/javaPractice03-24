package PracticeDay5;
/*Write a Java program that returns the
factorial of a given number using both
recursion and iteration.
*/
public class FactorialCalc {
    public static void main(String[] args) {
        int n= 5;
        long factRecursion = factRecursion(n);
        long factIteration= factIteration(n);

        System.out.println("factorial of "  + n + " using recursion is : " + factRecursion );
        System.out.println("factorial of "  + n + " using iteration is : " + factIteration );
    }
    public static long factRecursion(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return n * factRecursion(n-1);
        }
    }
    public static long factIteration(int n){
        long factorial =1;
        for(int i =1; i<=n; i++){
            factorial= factorial*i;
        }
        return factorial;
    }
}
