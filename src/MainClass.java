public class MainClass {
    public static void main(String[] args) {
        float result = calc();

        int first = 13;
        int second = 5;
        boolean boolResult = boolCalc(first, second);

        int digit = -5;
        plusOrMinus(digit);

        String name = "Иван";
        myName(name);

        int year = 2100;
        yearIs(year);
    }
    private static float calc(){
        int a = 10;
        int b = 20;
        int c = 50;
        int d = 5;
        float result = a * (b + c/d);
        return result;
    }

    private static boolean boolCalc(int first, int second) {
        if (first + second >= 10 && first + second <= 20){
            return true;
        } else {
            return false;
        }
    }

    private static void plusOrMinus(int a){
        if(a < 0){
            System.out.println("Число " + a + " - отрицательное");
        } else {
            System.out.println("Число " + a + " - положительное");
        }
    }

    private static void myName(String name){
        System.out.println("Привет, " + name);
    }

    private static void yearIs(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Год " + year + " - високосный");
        }
        else {
            System.out.println("Год " + year + " - не високосный");
        }
    }

}
