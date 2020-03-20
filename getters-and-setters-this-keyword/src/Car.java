public class Car {

    // car definition
    private String color;
    private String make;
    private String model;
    private int year;
    private int doors;

    public Car() {
        this(1995, 4, "UAZ");
        this.color = "White";
        this.make = "Unknown";
        System.out.println("Executing constructor without parameters...");
    }

    public Car(int year, int doors, String model) {
        this.year = year;
        this.doors = doors;
        this.model = model;
        System.out.println("Executing constructor with three parameters...");
    }


    public void increaseSpeed() {
        System.out.println("Increasing the speed!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    // setter with validation
    public void setYear(int year) {
        if (year > 1900 && year <= 2020) {
            this.year = year;
        } else {
            System.out.println("This year is not valid");
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
