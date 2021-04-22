public class Human extends Sportsmans implements Runnable, Jumping {


    public Human(String name, int runDictance, int jumpHeight) {
        super(name, runDictance, jumpHeight);
    }

    @Override
    public void jump(Wall wall) {
        System.out.println("Human " + getName() + " jumps...");
        if (wall.getHeight() > this.getJumpHeight()) {
            setCanJump(false);
            System.out.println("Human " + getName() + " can't jump and go out.");
        }else {
            System.out.println("Good jump, " + getName() + "!");
        }
    }

    @Override
    public void run(Treadmill treadmill) {
        System.out.println("Human " + getName() + " runing...");
        if (treadmill.getDistance() > this.getRunDictance()) {
            setCanRun(false);
            System.out.println("Human " + getName() + " can't run and go out.");
        }else {
            System.out.println("Good run, " + getName() + "!");
        }
    }
}
