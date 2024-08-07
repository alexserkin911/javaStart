package homework5;

public class HW {

    public boolean checkArray(int[] array) {
        long sum = arraySum(array);
        long leftSum = 0;

        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            if (leftSum * 2 == sum) {
                printInfo(array, i);
                return true;
            }
        }
        return false;

    }

    private static void printInfo(int[] array, int pos) {
        System.out.println("pos = " + pos);
        for (int j = 0; j <= pos ; j++) {
            System.out.print(array[j] + "");
        }
        System.out.print(" | ");
        for (int i = pos + 1; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }


    private static long arraySum(int[] array) {
        long sum = 0;
        for (int el : array) {
            sum += el;
        }
        return sum;
    }
}
