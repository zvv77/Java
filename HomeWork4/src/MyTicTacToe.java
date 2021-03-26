import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class MyTicTacToe {
    private static final char SIGN_X = 'x';
    private static final char SIGN_O = 'o';
    private static final char SIGN_EMPTY = '.';
    private static final int NUM_OF_WIN = 4;
    private static Scanner scanner;
    private static Random random;
    private static char table[][];
    private static int sizeTable = 5;

    public static void main(String[] args) {
        game();
    }

    private static void game() {

        table = new char[sizeTable][sizeTable];
        random = new Random();
        scanner = new Scanner(System.in);
        initTable();

        while (true) {
            turnPlayer();
            if (checkWin('x')) {
                System.out.println("You win");
                printTable();
                System.out.print("Game again (y/n)");
                if (scanner.next().equals("y")) {
                    game();
                }
                break;
            }

            turnAI();
            if (checkWin('o')) {
                System.out.println("AI win");
                printTable();
                System.out.print("Game again (y/n)");
                if (scanner.next().equals("y")) {
                    game();
                }
                break;
            }

            printTable();
        }

    }

    public static void printTable() {
        for (int x = 0; x < sizeTable; x++) {
            for (int y = 0; y < sizeTable; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkWin(char sign) {

        int horisontalLine = 0;
        int verticalLine = 0;
        int diagonalLine = 0;

        for (int x = sizeTable - 1; x >= 0; x--) {
            verticalLine = 0;
            for (int y = 0; y < sizeTable; y++) {
                if (table[y][x] == sign) {
                    verticalLine++;
                    if (verticalLine == NUM_OF_WIN) return true;
                } else {
                    verticalLine = 0;
                }
            }
            /////////////////
            diagonalLine = 0;
            if (x == 1) {
                int stepY = 0;
                int stepX = x;
                do{
                    if (table[stepY][stepX] == sign) {
                        diagonalLine++;
                        if (diagonalLine == NUM_OF_WIN) return true;
                    }else {
                        diagonalLine = 0;
                    }
                    stepX++;
                    stepY++;
                }while (stepX < sizeTable && stepY < sizeTable);
                ///
                stepY = sizeTable-1;
                stepX = x;
                do{
                    if (table[stepY][stepX] == sign) {
                        diagonalLine++;
                        if (diagonalLine == NUM_OF_WIN) return true;
                    }else {
                        diagonalLine = 0;
                    }
                    stepX++;
                    stepY--;
                }while (stepX < sizeTable && stepY >= 0);
            }
            /////////////////
            diagonalLine = 0;
            if (x == sizeTable-1) {
                int stepY = 0;
                int stepX = x;
                do{
                    if (table[stepY][stepX] == sign) {
                        diagonalLine++;
                        if (diagonalLine == NUM_OF_WIN) return true;
                    }else {
                        diagonalLine = 0;
                    }
                    stepX--;
                    stepY++;
                }while (stepX >= 0 && stepY < sizeTable);
            }
            /////////////////
            diagonalLine = 0;
            if (x == sizeTable-2) {
                int stepY = 0;
                int stepX = x;
                do{
                    if (table[stepY][stepX] == sign) {
                        diagonalLine++;
                        if (diagonalLine == NUM_OF_WIN) return true;
                    }else {
                        diagonalLine = 0;
                    }
                    stepX--;
                    stepY++;
                }while (stepX >= 0 && stepY < sizeTable);
            }
        }
        ////////////////////////
        for (int y = 0; y < sizeTable; y++) {
            horisontalLine = 0;
            for (int x = 0; x < sizeTable; x++) {
                if (table[y][x] == sign) {
                    horisontalLine++;
                    if (horisontalLine == NUM_OF_WIN) return true;
                } else {
                    horisontalLine = 0;
                }
            }
            ///////////////////////////////////
            diagonalLine = 0;
            if (y == 0) {
                for (int x = 0; x < sizeTable; x++) {
                    if (table[x][x] == sign) {
                        diagonalLine++;
                        if (diagonalLine == NUM_OF_WIN) return true;
                        } else {
                            diagonalLine = 0;
                        }

                    }
            }
            ///////////////////////////////////
            diagonalLine = 0;
            if (y == 1) {
                int stepY = y;
                int stepX = 0;
                do{
                    if (table[stepY][stepX] == sign) {
                        diagonalLine++;
                        if (diagonalLine == NUM_OF_WIN) return true;
                    }else {
                        diagonalLine = 0;
                    }
                    stepX++;
                    stepY++;
                }while (stepX < sizeTable && stepY < sizeTable);
            }
        }
        return false;
    }

    private static void turnAI() {
        int x, y;
        do {
            y = random.nextInt(5);
            x = random.nextInt(5);
        } while (!isEmty(y, x));
        table[y][x] = SIGN_O;
    }

    private static boolean isEmty(int y, int x) {
        return table[y][x] == SIGN_EMPTY;
    }

    private static void turnPlayer() {
        int x, y;
        do {
            System.out.print("Enter y and x (1...5) >>> ");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while (!isValid(y, x) || !isEmty(y, x));
        table[y][x] = SIGN_X;
    }

    private static boolean isValid(int y, int x) {
        return x >= 0 && x <= 4 && y >= 0 && y <= 4;
    }

    public static void initTable() {
        for (int x = 0; x < sizeTable; x++) {
            for (int y = 0; y < sizeTable; y++) {
                table[x][y] = SIGN_EMPTY;
            }
        }
    }
}




