// Data reference Type - String

public class StringDemo {

    public static void main(String[] args) {
        // String literal -> String Constant Pool
        String str1 = "Hello ";

        // it creates one more reference to object "Hello"
        String str3 = "Hello";

        // String Object - Heap
        String str2 = new String("World!");

        // It creates a new object!
        String str4 = new String("World!");

        System.out.println(str1 + str2);

        // Strings are immutable
        str1 = "Hi "; // it creates a new object and changes reference to "Hi ",
        // garbage collector takes care of "Hello " object, if nothing references to it
    }
}
