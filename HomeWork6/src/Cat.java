public class Cat extends Animal{

    private static int kolCats;

    public Cat(String name) {
        super(name);
        kolCats++;
    }

    public static int getKolCats() {
        return kolCats;
    }

    public void cantRun() {
        System.out.printf("%s не может бегать больше 200 метров\n", name);;
    }

    public void cantSwim() {
        System.out.printf("%s не может плавать\n", name);;
    }
}
