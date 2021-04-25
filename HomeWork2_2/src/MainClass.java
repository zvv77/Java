import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        String[][] arr = new String[4][4];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){

//                if (i == 3 && j == 3){
//                    arr[i][j] = "a";
//                    continue;
//                }

                Random random = new Random();
                arr[i][j] = String.valueOf(random.nextInt(20));
            }
        }
        try {
            System.out.println(checkArr(arr));
        }
        catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }

    private static int checkArr(String[][] arr) throws MyArraySizeException {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4){
            throw new MyArraySizeException("Array size is not valid");
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                try {
                    int d = Integer.parseInt(arr[i][j]);
                    sum += d;
                }catch (NumberFormatException e){
                    throw new MyArrayDataException("Wrong data in [" + i + "][" + j + "]");
                }

            }
        }
        return sum;
    }
}


