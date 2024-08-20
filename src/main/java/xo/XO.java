package xo;

import java.util.Scanner;

public class XO {

    private static int SIZE;
    private static char[][] MAP;
    private static boolean isInGame;
    private static final char USER = 'X';
    private static final char PC = 'O';
    private static final char DEFAULT = '_';

    static void fillMap(int size) {
        isInGame = true;
        MAP = new char[size][size];
        SIZE = size;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + "|");
            }
            System.out.println();
        }
    }

    static boolean move(int x, int y, char player) {
        try {
            if (MAP[x][y] == DEFAULT) {
                MAP[x][y] = player;
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private static void moveAI() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DEFAULT) {
                    MAP[i][j] = PC;
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    static boolean isVictory(char player) {
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fillMap(3);
        printMap();

        System.out.println("""
                Game XO!
                You game X.
                Enter row number and column number.
                """);

        while (isInGame) {
            System.out.println("Your move!");
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();

            } catch (Exception e) {
                System.out.println("Enter correct number");
                in.nextLine();
                continue;
            }
            x--;
            y--;
            if (move(x, y, USER)) {
                printMap();
                if (isVictory(USER)) {
                    System.out.println("Your win!");
                    break;
                }
                try {
                    System.out.println("Comp move!");
                    moveAI();
                    printMap();
                } catch (Exception e) {
                    System.out.println("=");
                    break;
                }
                if (isVictory(PC)) {
                    System.out.println("Your lose!");
                    break;
                }
            } else {
                System.out.println("Enter correct number");
            }
        }
    }


}
