public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite){
        food -= appetite;
        System.out.printf("В миске осталось %d еды\n", food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food += food;
    }
}
