package PracticeDay4;
/*Define a class named Circle with attributes
radius and color. Implement a method to
calculate the area of the circle.*/
public class Circle1 {

    private Double radius;
    private String color;

    Circle1(Double radius, String color){
        this.radius = radius;
        this.color =color;
    }
    public Double calculateArea() {
        return Math.PI * radius * radius;
    }
        public Double getRadius(){
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor(){
        return color;

    }
    public void setColor(String color){
        this.color = color;
    }

    public static void main(String[] args) {

        Circle1 circle1= new Circle1(6.2 , "Orange");
        System.out.println("Area of circle is :  " + circle1.calculateArea() );
        System.out.println("color of circle is : " + circle1.color);

    }
}
