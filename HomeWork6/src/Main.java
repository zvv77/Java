public class Main {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik"),
                new Dog("Reks"),
                new Cat("Murzik")
        };

        for (Animal animal : animals) {
            animal.run(180);
            animal.swim(11);
        }

        System.out.println("------------------------");
        System.out.printf("Создано %d котов\n", Cat.getKolCats());
        System.out.printf("Создано %d собак\n", Dog.getKolDogs());
        System.out.printf("Создано %d животных\n", Animal.getKolAnimals());
    }
}
