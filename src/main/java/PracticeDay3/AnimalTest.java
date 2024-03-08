package PracticeDay3;


/*        Define a superclass called Animal with
        methods like eat() and sleep(). Create
        subclasses such as Dog, Cat, and Bird and
        override the methods according to their
        behavior.
*/

 class Animal {
     public void eat() {
         System.out.println("Animal is eating");
     }

     public void sleep() {
         System.out.println("Animal is sleeping");
     }
 }

  class Dog extends Animal{
    @Override
     public void eat(){
          System.out.println("Dog is eating ");
      }

      @Override
      public void sleep() {
          System.out.println("Dog is sleeping");
      }
  }

  class Cat extends Animal{
      @Override
     public void eat(){
         System.out.println("Cat is eating");
     }
     @Override
      public void sleep(){
         System.out.println("Cat is sleeping");
     }

  }
  class Bird extends Animal {
      @Override
      public void eat() {
          System.out.println("Bird is eating");
      }

      @Override
      public void sleep() {
          System.out.println("bird is sleeping");
      }
  }
public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.eat();
        dog.sleep();
        cat.eat();
        cat.sleep();
        bird.eat();
        bird.sleep();
    }
}
