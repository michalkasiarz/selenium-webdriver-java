public class ClassDemo {

    public static void main(String[] args) {

        Car bmw = new Car(); // create
        // and initialize the object
        bmw.setColor("Red");
        bmw.setDoors(4);
        bmw.setMake("Germany");
        bmw.setModel("e220");
        bmw.setYear(1992);

        Car benz = new Car(); // create and initialize object
        benz.setModel("c300");
        benz.setYear(2021);


        // method call on bmw object
        bmw.increaseSpeed();

        // calling getters
        System.out.println(bmw.getModel());
        System.out.println(bmw.getColor());
        System.out.println("Benz make is " + benz.getMake()); // Benz make is null, since it hasn't been set
        // null is the default value of String


    }

}