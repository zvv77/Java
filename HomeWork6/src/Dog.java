public class Dog extends Animal{

    private static int kolDogs;

    public Dog(String name) {
        super(name);
        kolDogs++;
    }

    public static int getKolDogs() {
        return kolDogs;
    }

    public void cantRun() {
        System.out.printf("%s не может бегать больше 500 метров\n", name);;
    }

    public void cantSwim() {
        System.out.printf("%s не может плавать больше 10 м\n", name);;
    }
}
