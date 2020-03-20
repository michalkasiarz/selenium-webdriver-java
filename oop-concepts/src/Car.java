package src;

public class Car {

    // car definition
    String color;
    String make;
    String model;
    int year;
    int doors;


    // constructor
    public Car(String color, String make, String model, int year, int doors) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
        this.doors = doors;
    }

    public static void main(String[] args) {

        // creating new object
        Car car = new Car("red", "ford", "mondeo", 2010, 3);

        // calling methods on object
        car.engineStarted(true);
        car.go();
        car.engineStarted(false);

    }

    public void go() {
        System.out.println("Car goes!");
    }

    public void increaseSpeed() {
        System.out.println("Increasing the speed!");
    }

    public void engineStarted(boolean isStarted) {
        if (isStarted) {
            System.out.println("Engine is on!");
        } else {
            System.out.println("Engine if off!");
        }
    }
}
