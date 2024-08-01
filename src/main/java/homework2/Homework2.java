package homework2;

import java.util.Arrays;

public class Homework2 {

    public static void replaceD() {

        int[] a = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else {
                a[i] = 1;
            }

        }
        System.out.println(Arrays.toString(a));
    }

    public static void fillingArr() {

        int[] ar = new int[8];
        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            ar[i] = count;
            count += 3;
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void multiplyingByTwo() {

        int[] digArray = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < digArray.length; i++) {
            if (digArray[i] < 6) {
                digArray[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(digArray));
    }

    public static void addArray() {

        int[][] q = new int[5][5];

        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                if(i == j) {
                    q[i][j] = 1;
                    q[i][q.length - 1 - i] = 1;
                }
            }
        }

        for (int [] el : q){
            for (int e: el){
                System.out.print(e + "  ");
            }
            System.out.println();
        }

    }

    public static void minMaxEl() {

        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -5, 25};
        int max = array[0];
        int min = array[0];

        for (int j : array) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println("max = " + max + ", min = " + min);
    }
}
