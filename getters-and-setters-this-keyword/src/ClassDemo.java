public class ClassDemo {

    public static void main(String[] args) {

        CarWithGettersAndSetters bmw = new CarWithGettersAndSetters(); // create
        // and initialize the object
        bmw.setColor("Red");
        bmw.setDoors(4);
        bmw.setMake("Germany");
        bmw.setModel("e220");
        bmw.setYear(1992);

        // method call on bmw object
        bmw.increaseSpeed();

        // calling getters
        System.out.println(bmw.getModel());
        System.out.println(bmw.getColor());

    }

}