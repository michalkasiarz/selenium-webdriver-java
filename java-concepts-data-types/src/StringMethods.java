public class StringMethods {

    public static void main(String[] args) {
        String str = "This is the test string";

        System.out.println(str.length()); // gives the length of the str
        System.out.println(str.charAt(0)); // returns the character at index 0 -> T
        System.out.println(str.concat(", as you know!")); // concatenation; prints
        // "This is the test string, as you know!"
        System.out.println(str.contains("test")); // returns boolean - true
        System.out.println(str.contains("!")); // returns boolean - false
        System.out.println(str.startsWith("This")); // returns boolean - true
        System.out.println(str.startsWith("is")); // returns boolean - false
        System.out.println(str.endsWith("ng")); // returns boolean - true
        System.out.println(str.endsWith("hi man!")); // returns boolean - false
        System.out.println(str.equals("This will give false!")); // returns boolean - false
        System.out.println(str.equals("This is the test string")); // returns boolean true
        System.out.println(str.indexOf("T")); // returns 0
        System.out.println(str.indexOf("test")); // returns 12
        System.out.println(str.indexOf("none!")); // returns -1 (the is no such string in str)
        System.out.println(str.isEmpty()); // returns boolean - false
        System.out.println(str.replace("T", "t")); // prints "this is the test string"
        System.out.println(str.substring(2)); // prints whatever is from 4 - beginning index
        System.out.println(str.toCharArray()); // returns array made out of the given string
        System.out.println(str.toLowerCase()); // returns lowercase string
        System.out.println("text".toUpperCase()); // returns uppercase string -> TEXT


    }
}
