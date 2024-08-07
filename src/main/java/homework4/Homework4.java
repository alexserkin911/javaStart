package homework4;

import java.util.Scanner;

public class Homework4 {


    public static String getRandomWord(String[] words) {
        int index = (int) (Math.random() * words.length);
        return words[index];
    }


    public static void guessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = getRandomWord(words);

        System.out.println(word);
        System.out.println(word.charAt(0) + "" + word.charAt(1) + "###############");
        System.out.println("Угадайте слово!");

        Scanner in = new Scanner(System.in);
        boolean start = true;
        while (start) {
            String inWord = in.nextLine();

            if (word.equals(inWord)) {
                System.out.println("Правильно!");
                start = false;
            } else {
                System.out.println("Не верно, повторите слово!");
            }
        }
        in.close();
    }

}
