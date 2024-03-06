package PracticeSession;


/*Create a Java program that finds the
maximum and minimum elements in an
array .*/
public class FindMaxMin {
    public static void main(String[] args) {
        int[] values = {2, 4, 66, 78, 334, 123};

        int max = values[0];
        int min = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
            if (values[i] < min) {
                min = values[i];
            }
        }

        System.out.println("maximum element is : " + max);
        System.out.println("minimum element is : " + min);

    }
}


