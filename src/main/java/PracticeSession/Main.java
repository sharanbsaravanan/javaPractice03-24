package PracticeSession;



public  class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 6);
        Circle1 circle = new Circle1(50);

        System.out.println("area of rectangle is : " + rectangle.calculateArea());
        System.out.println("perimeterof rectangle is : " + rectangle.calculatePerimeter());

        System.out.println("area of circle is : " + circle.calculateArea());

        System.out.println("perimeter of circle is : " + rectangle.calculatePerimeter());


    }

}

  class Shape {

    public double calculateArea(){
        return 0;
    }
    public double calculatePerimeter(){
        return 0;
    }

}

class Rectangle extends Shape {
     private double length;
     private double width;

     public Rectangle(double length, double width) {
         this.length = length;
         this.width = width;
     }

     public double calculateArea() {
         return length * width;
     }

     public double calculatePerimeter() {
         return 2 * (length * width);
     }
 }


  class Circle1 extends Shape {

     private double radius;

     public Circle1(double radius) {
         this.radius = radius;
     }

     public double calculateArea() {
         return Math.PI * radius * radius;
     }

     public double calculatePerimeter() {
         return Math.PI * radius * 2;

     }
 }

