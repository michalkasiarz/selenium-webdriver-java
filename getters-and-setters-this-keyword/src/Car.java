public class Car {

    // car definition
    private String color;
    private String make;
    private String model;
    private int year;
    private int doors;


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
