public class Sportsmans implements Runnable, Jumping {
    private int runDictance;
    private int jumpHeight;
    private String name;
    private boolean canJump = true;
    private boolean canRun = true;
    public Sportsmans(String name, int runDictance, int jumpHeight) {
        this.name = name;
        this.runDictance = runDictance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void jump(Wall wall) {

    }

    @Override
    public void run(Treadmill treadmill) {

    }

    public int getRunDictance() {
        return runDictance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setCanJump(boolean canJump) {
        this.canJump = canJump;
    }

    public void setCanRun(boolean canRun) {
        this.canRun = canRun;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public boolean isCanRun() {
        return canRun;
    }

    public String getName() {
        return name;
    }
}
