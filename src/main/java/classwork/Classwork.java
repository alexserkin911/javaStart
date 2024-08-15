package classwork;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Classwork {

    static void bufferedInput() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(new File("bigData.txt")));

        while (true) {
            String s = bf.readLine();
            if (s == null) {
                break;
            }
        }
    }

    static void input() throws FileNotFoundException {
        Scanner in = new Scanner(new File("bigData.txt"));
        while (in.hasNext()) {
            in.next();
        }
    }

    static void genBigData() {
        File file = new File("bigData.txt");

        try (PrintWriter pr = new PrintWriter(file)) {
            for (int i = 0; i < 10_000_000; i++) {
                pr.print("aaa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static  int[] randomArray(int n, int limit){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() - Math.random()) * limit);
        }
        return array;

    }

    static  int[] randomArrayFT(int n, int from, int to){
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (from + (Math.random() * (to- from)));
        }
        return array;

    }

    public static void main(String[] args) throws IOException {
//        long start = System.currentTimeMillis();
//        genBigData();
//        System.out.println(new File("bigData.txt").length());
//        input();
//        bufferedInput();
//        System.out.println(System.currentTimeMillis() - start + " ms");
//          phone: 6465465465, 546546464, 13414655798
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String[] data = s.split("[:, ]+");
//        System.out.println(Arrays.toString(data));
//
//        long[] numbers = new long[data.length - 1];
//        for (int i = 1; i < data.length; i++) {
//            numbers[i - 1] = Long.parseLong(data[i]);
//        }
//        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(randomArrayFT(5,50, 100)));

    }
}
