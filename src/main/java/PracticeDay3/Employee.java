package PracticeDay3;
/*Define a class named Employee with
attributes such as name, employee ID, and
salary. Implement methods to get and set
these attributes.*/
public class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.salary = salary;
        this.id = id;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Sharan", 121, 579514.04);

        System.out.println(" Employee name is : " + emp.getName());
        System.out.println("employee id is : " + emp.getId());
        System.out.println("employee salary is  : " + emp.getSalary());

        emp.setName("maverick");
        emp.setSalary(98845.88);
        emp.setId(178);
        //modified
        System.out.println(" Employee name is : " + emp.getName());
        System.out.println("employee id is : " + emp.getId());
        System.out.println("employee salary is  : " + emp.getSalary());




    }
}
