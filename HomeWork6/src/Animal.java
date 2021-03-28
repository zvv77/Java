public abstract class Animal {

    protected String name;
    private static int kolAnimals;

    public Animal(String name) {
        this.name = name;
        kolAnimals++;
    }

    public static int getKolAnimals() {
        return kolAnimals;
    }

    public void run(int distanceOfRun){
        if((this instanceof Cat && distanceOfRun > 200) || (this instanceof Dog && distanceOfRun > 500)){
            cantRun();
        } else {
            System.out.printf("%s пробежал %d м.\n", name, distanceOfRun);
        }
    }

    public void swim(int distanceOfSwim){
        if(this instanceof Cat || (this instanceof Dog && distanceOfSwim > 10)){
            cantSwim();
        } else {
            System.out.printf("%s проплыл %d м.\n", name, distanceOfSwim);
        }
    }

    public abstract void cantRun();

    public abstract void cantSwim();

}
