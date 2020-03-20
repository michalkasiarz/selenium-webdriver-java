public class ConstructorDemo {

    public static void main(String[] args) {

        Car c1 = new Car();

        System.out.println(c1.getMake()); // Unknown
        System.out.println(c1.getColor()); // White

        System.out.println("****");

        Car c2 = new Car(1989, 3, "Toyota Carina");
        System.out.println(c2.getMake()); // no make defined - null
        System.out.println(c2.getYear()); // 1989
        System.out.println(c2.getDoors()); // 3
        System.out.println(c2.getModel()); // Toyota Carina
    }
}
