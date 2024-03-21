package PracticeDay5;
/*Define a superclass called Vehicle with
attributes like make, model, and year. Create
subclasses such as Car and Motorcycle with
additional attributes and methods.
*/
public class Vehicle {
    private String make;
    private String model;
    private Integer year;

    public Vehicle(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;

    }

    public Integer getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    class Car extends Vehicle {
        private Integer noDoors;

        public Car(String make, String model, Integer year, Integer noDoors) {
            super(make, model, year);
            this.noDoors = noDoors;

        }

        public Integer getNoDoors() {
            return noDoors;

        }

        public void setNoDoors(Integer noDoors) {
            this.noDoors = noDoors;
        }

    }

    class MotorCycle extends Vehicle {
        private String type;

        public MotorCycle(String make, String model, Integer year, String type) {
            super(make, model, year);
            this.type = type;
        }

        public String setType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle("Audi", "Q5", 2022 );
        System.out.println(vehicle.getMake());
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getYear());





    }

}
