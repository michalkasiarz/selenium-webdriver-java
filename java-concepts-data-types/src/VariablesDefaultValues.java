public class VariablesDefaultValues {

    static byte mybyte; // from -128 up to 127
    static short myshort; // from -32768 up to 32767
    static int myint; // from -2_147_483_648 up to 2_147_483_747
    static long mylong; // from -2^63 up to 2^63 - 1
    static float myfloat; // default 0.0f
    static double mydouble; // default 0.0d
    static boolean isRaining; // is it raining now?
    static char mychar;// min: 0, max: 65_535 (symbol index)

    public static void main(String[] args) {


        System.out.println("mybyte value is " + mybyte + ".");
        System.out.println("mymshort value is " + myshort + ".");
        System.out.println("myint value is " + myint + ".");
        System.out.println("mylong value is " + mylong + ".");
        System.out.println("myfloat value is " + myfloat + ".");
        System.out.println("mydouble value is " + mydouble + ".");
        System.out.println("Is it raining now? " + isRaining + ".");
        System.out.println("mychar value is " + mychar + ".");


    }

}
