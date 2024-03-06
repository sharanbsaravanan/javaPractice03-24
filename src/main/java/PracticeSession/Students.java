package PracticeSession;

 /*Create a class named Student with attributes
such as name, roll number, and marks.
Implement methods to calculate the total
marks and average marks of the student.*/
public class Students {
     private String name;
     private int rollno;
     private int[] marks;

     public Students(String name, int rollno, int[] marks) {
         this.name = name;
         this.rollno = rollno;
         this.marks = marks;
     }

         public int calculateMarks () {
         int total = 0;
         for (int mark : marks) {

             total+= mark;

         }

         return total;

     }
         public double calculateAverageMarks() {
         int totalMarks = calculateMarks();
         return (double) totalMarks / marks.length;
     }



     public String getName() {
         return name;
     }

     public int getRollNumber() {
         return rollno;
     }

     public int[] getMarks() {
         return marks;
     }

     public static  void main(String [] args){

             // Creating a student object with name, roll number, and marks
             int[] marks = {85, 90, 75, 88, 92}; // Sample marks
             Students student = new Students("John", 123456, marks);

             // Calculating and printing total marks of the student
             int totalMarks = student.calculateMarks();
             System.out.println("Total marks: " + totalMarks);

             // Calculating and printing average marks of the student
             double averageMarks = student.calculateAverageMarks();
             System.out.println("Average marks: " + averageMarks);
         }
     }







