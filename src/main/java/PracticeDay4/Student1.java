package PracticeDay4;
/*create a class called Student with attributes
name and grade. Implement a method to
display the student's details.*/
public class Student1 {
    private String name;
    private Integer grade;

    Student1(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public void details() {
        System.out.println("Student name is : " + name);
        System.out.println("Student Grade is : " + grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade() {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student1 student1 = new Student1("Vladamir", 54);

        student1.details();

        student1.setName("john");

       // System.out.println("update ");
        student1.details();

    }
}
