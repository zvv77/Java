public class MainClass {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 15, false),
                new Cat("Vaska", 15, false),
                new Cat("Murka", 20, false),
                new Cat("Mashka", 25, false),
                new Cat("Kitty", 15, false),
                new Cat("Murzik", 30, false)
        };
        Bowl bowl = new Bowl(100);

        for (Cat cat : cats) {
            cat.eat(bowl);
            if (!cat.isSatiety()){
                bowl.setFood(100 - bowl.getFood());
                System.out.println("В миску досыпали еду.");
                cat.eat(bowl);
            }
        }

    }
}
