package PracticeDay4;
/*Create a Java program to copy elements
from one array to another.*/
public class CopyElements {
    public static void main(String[] args) {
        int[] org = {5, 79, 45};
        int[] copy = new int[org.length];

        copy = org;


        System.out.println("content of org is ");
        for (int i = 0; i < org.length; i++) {
            System.out.print(org[i] + " ");
        }
        System.out.println("\ncontent of copy is ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
