package PracticeDay3;

/*write a Java program to find the second
largest element in an array.*/
public class FindSecondLargest {
    public static void main(String[] args) {
        int[] number = {10, 5, 20, 8, 25, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];
            } else if (number[i] > secondLargest && number[i] != largest) {
                secondLargest = number[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}


