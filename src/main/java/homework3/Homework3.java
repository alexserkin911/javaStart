package homework3;

import java.util.Scanner;

public class Homework3 {

    public static byte getNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 - 9: ");
        return in.nextByte();
    }

    public static void printNumberOfAttempts(int n) {
        switch (n) {
            case 3:
                System.out.println("У вас " + n + " попытки");
                break;
            case 2:
                System.out.println("У вас осталась " + n + " попытки");
                break;
            default:
                System.out.println("У вас осталась последняя попытка");
        }


    }

    public static void clueNumber(int randomNumber, int inNumber) {
        if (inNumber > randomNumber) {
            System.out.println("Указанное число Больше загадонного");
        } else {
            System.out.println("Указанное число Меньше загадонного");
        }
    }

    public static boolean gameOver() {
        Scanner end = new Scanner(System.in);
        System.out.println();
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        return end.nextByte() == 1;
    }

    public static void game() {
        byte randomNum = (byte) (Math.random() * 10);
        System.out.println(randomNum);

        boolean end = true;

        while (end) {
            gameLoop:
            for (int i = 3; i > 0; i--) {
                printNumberOfAttempts(i);
                byte num = getNumber();
                if (num >= 0 && num <= 9) {
                    if (num == randomNum) {
                        System.out.println("Вы угадали!");
                        break gameLoop;
                    } else {
                        System.out.println("Вы не угадали!");
                        clueNumber(randomNum, num);
                        System.out.println();
                    }
                } else {
                    System.out.println("Вы ввели не верное число!");
                }

            }
            end = gameOver();
            System.out.println();

            randomNum = (byte) (Math.random() * 10);

        }
    }

}
