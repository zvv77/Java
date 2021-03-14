public class MainClass {
    public static void main(String[] args) {
        newArray();

        fullArr();

        lessThanSix();

        squareMass();

        minMaxArr();

        int[] mass = {1,1,2,0,4,7,1};
        boolean check = checkSum(mass);

        int[] intArr = {1, 2, 3, 4, 5};
        int n = 3;
        stepArray(intArr, n);
    }

    private static void newArray() {
        int[] intArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 1) {
                intArr[i] = 0;
            } else {
                intArr[i] = 1;
            }
        }
    }

    private static void fullArr() {
        int[] intArr = new int[8];
        int a = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = a;
            a += 3;
        }
    }

    private static void lessThanSix(){
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < mass.length; i++){
            if(mass[i] < 6) {
                mass[i] *= 2;
            }
        }
    }

    private static void squareMass(){
        int[][] mass = new int[4][4];
        int stepI = 0;
        int stepJ = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if(stepI == stepJ){
                    mass[i][j] = 1;
                }
                stepJ++;
            }
            stepJ = 0;
            stepI++;
        }
        int _stepI = 4;
        int _stepJ = 4;
        for (int i = mass.length - 1; i >= 0; i--){
            for (int j = 0; j < 4; j++){
                if(_stepI == _stepJ){
                    mass[i][j] = 1;
                }
                _stepJ--;
            }
            _stepJ = 4;
            _stepI--;
        }
//        for (int ii = 0; ii < 4; ii++){
//            for(int jj = 0; jj < 4; jj++){
//                System.out.print(mass[ii][jj]);
//            }
//            System.out.println();
//        }

    }

    private static void minMaxArr(){
        int[] mass = {1,53,11,-4,13,7,22,5};
        int max = 0;
        int min = 0;
        for (int i = 0; i < mass.length; i++){
            if(i == 0){
                min = mass[i];
                max = mass[i];
            }
            else {
                if (mass[i] > max) {
                    max = mass[i];
                }
                if (mass[i] < min) {
                    min = mass[i];
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    private static boolean checkSum(int[] mass){
        int sumLeft = 0;
        int sumRight = 0;
        for(int i = 0; i < mass.length - 1; i++){
            sumLeft += mass[i];
            for (int j = mass.length - 1; j > i; j--){
                sumRight += mass[j];
            }
            if (sumLeft == sumRight){
                return true;
            }
            sumRight = 0;
        }
        return false;
    }

    private static void stepArray(int[] intArr, int n) {
        int temp = 0;
        int i;
        if (n > 0) {
            i = 0;
            while (n!=0) {
                temp = intArr[i];
                intArr[i] = intArr[intArr.length - 1];
                for (int j = intArr.length - 1; j > 0; j--) {
                    if (j > 1) {
                        intArr[j] = intArr[j - 1];
                    } else {
                        intArr[j] = temp;
                    }
                }
                n--;
            }
        }
        else if (n < 0){
            i = intArr.length - 1;
            while (n!=0) {
                temp = intArr[i];
                intArr[i] = intArr[0];
                for (int j = 0; j < intArr.length - 1; j++) {
                    if (j < intArr.length - 2) {
                        intArr[j] = intArr[j + 1];
                    } else {
                        intArr[j] = temp;
                    }
                }
                n++;
            }
        }
//        for (int jj : intArr
//            ) {
//                System.out.print(jj);
//            }
        }
    }




