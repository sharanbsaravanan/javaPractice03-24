package PracticeDay3;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int  number = sc.nextInt();

        if(isPrime(number)){
            System.out.print(number +"  is a prime number");
        }
        else {
            System.out.print(number + " is not a prime number");
        }

    }


    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
