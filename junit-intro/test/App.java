package test;

public class App {

    public static void main(String[] args) {
        nameUpper("andrzejek");
    }

    public static String nameUpper(String name) {
        String nameUppered = name.toUpperCase();
        System.out.println(nameUppered);
        return nameUppered;
    }


}
