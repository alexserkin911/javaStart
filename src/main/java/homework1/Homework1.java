package homework1;

public class Homework1 {

    public static void print(){

        byte b = 127; // -128 - 127
        short s = 32767; //- 32768 - 32767
        int i = 2_000_000_000;
        long l = 2_000_000_000_000_000_000L;

        float f = 0.6f;
        double d = 0.14;

        System.out.println(b + " " + s + " " + i + " " + l);
        System.out.println(f + " " + d);
    }

    public static int calculating(int a, int b, int c, int d){

        return a *(b + (c / d));
    }

    public static boolean sumBool(int one, int two){
        int s = one + two;

        return s >= 10 && s <= 20;
    }

    public static String isNegative(int z) {
        if (z >= 0){
            return "Число положительное";
        } else{
            return "Число отрицательное";
        }
    }


}
