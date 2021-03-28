import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        randomNumber();

        randomWords();
    }

    public static void randomNumber(){
        Random numRand = new Random();
        int i = numRand.nextInt(10);
        int step = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Введите число от 0 до 9: ");
            int numb = scanner.nextInt();
            if (numb == i){
                System.out.println("Вы выиграли!");
            }
            else {
                if(numb > i){
                    System.out.println("Введенное число больше загаданного");
                }
                else if (numb < i){
                    System.out.println("Введенное число меньше загаданного");
                }
            }
            step++;
        } while (step <= 2);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        if(scanner.nextInt() == 1){
            randomNumber();
        }
    }

    public static void randomWords(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random randWord = new Random();
        String compWord = words[randWord.nextInt(25)];
        Boolean youWin = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите предполагаемое слово: ");
            String wordPlayer = scanner.next().toLowerCase();
            for (String s : words
            ) {
                if (compWord.equals(wordPlayer)) {
                    System.out.println("Вы угадали!");
                    youWin = true;
                    break;
                }
            }
            if (!youWin) {
                //System.out.println(compWord);
                char[] chComp = compWord.toCharArray();
                char[] chPlayer = wordPlayer.toCharArray();
                int lengthArr = chComp.length < chPlayer.length ? chComp.length : chPlayer.length;
                for (int i = 0; i < lengthArr; i++) {
                    if (chComp[i] == chPlayer[i]) {
                        System.out.print(chPlayer[i]);
                    } else {
                        System.out.print("*");
                    }
                }
                for (int j = 15; j > lengthArr; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } while (!youWin);
    }
}
