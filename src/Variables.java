public class Variables {

    public static void main(String[] args) {

        byte mybyte = 127; // from -128 up to 127
        System.out.println("mybyte value is " + mybyte + ".");

        short myshort = 32_767; // from -32768 up to 32767
        System.out.println("mymshort value is " + myshort + ".");

        int myint = 2_147_483_647; // from -2_147_483_648 up to 2_147_483_747
        System.out.println("myint value is " + myint + ".");

        long mylong = 10000000000L; // from -2^63 up to 2^63 - 1
        System.out.println("mylong value is " + mylong + ".");

        float myfloat = 20.0f; // default 0.0f
        System.out.println("myfloat value is " + myfloat + ".");

        double mydouble = 23.0/4; //default 0.0.d
        System.out.println("mydouble value is " + mydouble + ".");

        boolean isRaining = true; // is it raining now?
        System.out.println("Is it raining now? " + isRaining + ".");

        char mychar = 3251;// min: 0, max: 65_535 (symbol index)
        System.out.println("mychar value is " + mychar + ".");





    }

}
