package PracticeDay5;

public class RemoveDuplicateFrmArray {
    public static void main(String[] args) {
        int[] array ={4,9,7,8,3,4,2,1,6,5,6,9};
        System.out.println("given arrays ");

        for(int n : array){
            System.out.print(n + " ");
        }
            for(int i=0; i< array.length; i++){
                if(array[i] != -1){
                    for(int j=i+1; j< array.length; j++ ){
                        if(array[i]== array[j]){
                            array[j]=-1;
                        }
                    }
                }

            }
        System.out.println("\n \nAfter removing duplicates " );
            for (int n : array){
                if(n != -1){
                    System.out.print(n + " ");
                }
        }
    }
}
