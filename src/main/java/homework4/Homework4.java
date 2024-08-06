package homework4;

import org.junit.platform.engine.support.discovery.SelectorResolver;

import java.util.Scanner;

public class Homework4 {

/*    Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    apple – загаданное
    apricot - ответ игрока
    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    Для сравнения двух слов посимвольно, можно пользоваться:
    String str = "apple";
    str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
    Играем до тех пор, пока игрок не отгадает слово
    Используем только маленькие буквы*/

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
