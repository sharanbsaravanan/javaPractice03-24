package PracticeSession;

/*Define a class named Circle with appropriate
attributes and methods. Calculate the area
and circumference of the circle.*/
public class    Circle {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter(){
        return Math.PI*2*radius;
    }

    public double getRadius(){
        return radius;

    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public static void main(String[] args) {
     Circle circle = new Circle(5.0);

     double area = circle.calculateArea();
        System.out.println(area);

        double perimeter = circle.calculatePerimeter();
        System.out.println(perimeter);
        }
    }

