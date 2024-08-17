package classwork2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ClassWork2 {

    public String[] getWords() throws Exception {
        return Files.newBufferedReader(Path.of(Objects.requireNonNull(getClass().getResource("worlds.txt")).toURI()))
                .readLine().replaceAll("\"+", "").split(", ");
    }

    public static void main(String[] args) throws Exception {
        ClassWork2 cs = new ClassWork2();
        Scanner in = new Scanner(System.in);
        String[] words = cs.getWords();
        String randomWord = words[(int) (Math.random() * words.length)];

        System.out.println("Загаданное слово (для тестирования): " + randomWord);
        char[] chars = fillChars(randomWord);
        char[] randomChars = randomWord.toCharArray();

        System.out.println(Arrays.toString(chars));

        boolean isInGame = true;
        while (isInGame) {
            System.out.println("Введите ваше слово:");
            String userWord = in.next();
            System.out.println("Вы ввели: " + userWord);
            if (userWord.equals(randomWord)) {
                System.out.println("Victory!");
                isInGame = false;
            } else {
                System.out.println("Try again!");
                char[] userChars = userWord.toCharArray();
                System.out.println(Arrays.toString(userChars));
                for (int i = 0; i < 15; i++) {
                    if (i < userChars.length && i < randomWord.length()) {
                        if (userChars[i] == randomChars[i]) {
                            chars[i] = userChars[i];
                            }
                        }
                    }

                // Преобразование массива chars в строку и вывод
                System.out.println("Подсказка: " + new String(chars));


            }
        }

    }

    private static char[] fillChars(String randomWord) {
        char[] chars = new char[15];
        Arrays.fill(chars, '#');
//        for (int i = 0; i < randomWord.length(); i++) {
//            chars[i] = randomWord.charAt(i);
//        }

        return chars;
    }
}
