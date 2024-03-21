package PracticeDay5;
/*Create a class called Circle with attributes
radius and methods to calculate the area and
circumference.
*/
public class Circle {
    private Double radius;

    public Circle(Double radius){
        this.radius=radius;
    }

    public  Double calcArea(){
        return Math.PI*radius*radius;
    }
    public Double calcCircumference(){
        return Math.PI*2*radius;
    }
    public  Double getRadius(){
        return radius;
    }

    public void setRadius(Double radius){
        this.radius= radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(7.0);

        System.out.println("Area of circle is : " + circle.calcArea());
        System.out.println("circumference of circle is :  "+ circle.calcCircumference());
    }

}
