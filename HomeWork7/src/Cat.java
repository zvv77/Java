public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Bowl b){
            if (!satiety && appetite <= b.getFood()) {
                System.out.printf("Кот %s поел.\n", this.name);
                b.decreaseFood(appetite);
                satiety = true;
            } else {
                System.out.printf("Коту %s не хватило еды.\n", this.name);
            }
        }

    public boolean isSatiety() {
        return satiety;
    }
}

