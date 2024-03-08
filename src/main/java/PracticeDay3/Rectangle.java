package PracticeDay3;
  /*Create a class called Rectangle with
attributes length and width. Implement
methods to calculate the area and perimeter
of the rectangle.

*/
public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length , double width){
        this.length = length;
        this.width= width;
    }
    public  double calculateArea() {
        return length * width;
    }
    public double calculatePeri() {
        return 2 * (length * width);
    }

      public static void main(String[] args) {
          Rectangle rec = new Rectangle(5.0,41.6);

          double area= rec.calculateArea();
          double perimter = rec.calculatePeri();
          System.out.println("Area of given rectangle is : " + area);
          System.out.println("perimeter of given rectangle is : " + perimter);
      }

}
