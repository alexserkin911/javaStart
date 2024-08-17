package xo;

public class XO {

    private static final char[][] map = new char[3][3];

    static void fillMap() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = '_';
            }
        }
    }

    static void printMap(){
        System.out.print("  ");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    fillMap();
    printMap();
    }

}
