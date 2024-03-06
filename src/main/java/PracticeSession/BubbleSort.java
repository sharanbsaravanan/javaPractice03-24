package PracticeSession;


        /*write a Java program to sort an array of
        integers in ascending order using the bubble
        sort algorithm.*/
public class BubbleSort {
    public static void main(String[] args) {


        int[] numbers = {5, 2, 8, 3, 1};

        System.out.println("Original array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nSorted array in ascending order:");
        printArray(numbers);
    }

    // Bubble sort algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}