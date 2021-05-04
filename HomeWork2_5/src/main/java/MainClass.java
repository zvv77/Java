import java.util.Arrays;

public class MainClass {
    static final int SIZE = 10000000;
    static final int H = SIZE / 2;

    public static void main(String[] args) {
        createArr1();
        createArr2();
    }

    public static void createArr1(){
        float[] arr1 = new float[SIZE];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = 1.0f;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    public static void createArr2() {
        float[] arr2 = new float[SIZE];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = 1.0f;
        }

        long a = System.currentTimeMillis();
        float[] arr2_1 = new float[H];
        float[] arr2_2 = new float[H];
        System.arraycopy(arr2,0, arr2_1, 0, H);
        System.arraycopy(arr2, H, arr2_2, 0, H);

        Thread thread1 = new Thread(() -> {
                for (int i = 0; i < arr2_1.length; i++) {
                    arr2_1[i] = (float) (arr2_1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
                for (int i = 0; i < arr2_2.length; i++){
                    arr2_2[i] = (float)(arr2_2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
        });
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr2_1, 0, arr2, 0, H);
        System.arraycopy(arr2_2, 0, arr2, H, H);
        long b = System.currentTimeMillis();
        System.out.println(b - a);
        System.out.println(Arrays.equals(arr2_1,arr2_2));
    }
}
