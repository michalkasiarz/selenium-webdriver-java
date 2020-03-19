import java.util.*;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] myArray = new int[10];

        myArray[0] = 100;
        myArray[1] = 90;
        myArray[2] = 80;
        myArray[3] = 70;
        myArray[4] = 60;
        myArray[5] = 50;


        System.out.println("0 index - " + myArray[0]);
        System.out.println("1st index - " + myArray[1]);
        System.out.println("2nd index - " + myArray[2]);
        System.out.println("3rd index - " + myArray[3]);
        System.out.println("6th index - " + myArray[6]); // 0 as default value

        String[] myStringArray = {"BMW", "Audi", "Honda"};

        int myStringArrayLength = myStringArray.length;

        System.out.println(myStringArray[1]); // Audi
        // System.out.println(myStringArray[6]);
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 6 out of bounds for length 3

        System.out.println("myStringArray length is " + myStringArrayLength
                + " because it has elements: "
                + myStringArray[0] + ", "
                + myStringArray[1] + ", "
                + myStringArray[2] + ".");

        for (int i = 0; i < myStringArrayLength; i++) {
            System.out.println(myStringArray[i]);
        }

        // sorting elements alphabetically
        Arrays.sort(myStringArray);

        for (int i = 0; i < myStringArrayLength; i++) {
            System.out.println(myStringArray[i]);
        }

    }

}
