package homework3;

import java.util.Scanner;

public class Homework3 {

/*    1. Написать программу, которая загадывает случайное число от 0 до 9,
    и пользователю дается 3 попытки угадать это число. При каждой попытке
    компьютер должен сообщить больше ли указанное пользователем число чем
    загаданное, или меньше. После победы или проигрыша выводится запрос –
    «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
      2 * Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
            apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы*/

//    public static byte randomNumber() {
//        return (byte) (Math.random() * 10);
//    }


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
