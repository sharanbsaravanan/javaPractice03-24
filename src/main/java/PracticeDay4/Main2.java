package PracticeDay4;
/*Define a superclass called Shape with an
abstract method calculateArea(). Create
subclasses such as Circle and Rectangle to
implement the method according to their
shapes.*/


abstract class Shape2 {
        public abstract double calculateArea();
    }

    class Circle2 extends Shape2 {
        private double radius;

        public Circle2(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

        class Rectangle2 extends Shape2 {
            private double length;
            private double width;

            public Rectangle2(double length, double width) {
                this.length = length;
                this.width = width;
            }

            @Override
            public double calculateArea() {
                return length * width;
            }
        }

        public class Main2 {
            public static void main(String[] args) {
                Circle2 circle2 = new Circle2(70);
                System.out.println("area of circle is : " + circle2.calculateArea());

                Rectangle2 rectangle2 = new Rectangle2(4, 5);

                System.out.println("area of rectangle is : " + rectangle2.calculateArea());

            }
        }

