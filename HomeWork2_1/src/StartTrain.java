public class StartTrain {

    public static void main(String[] args) {

        Sportsmans[] sportsmans = {
                new Cat("Barsik",100, 2),
                new Cat("Murzik", 120, 6),
                new Human("John", 200, 2),
                new Human("Alisa",220, 3),
                new Robot("Verter", 1000, 2),
                new Robot("T1000", 800,9)
        };

        Trens[] trens = {
                new Wall(3),
                new Treadmill(250)
        };

        for (Sportsmans sportsman: sportsmans) {
            for (Trens tren : trens) {
                if (sportsman.isCanJump() && sportsman.isCanRun()) {
                    if (tren instanceof Wall) {
                        sportsman.jump((Wall) tren);
                    } else {
                        sportsman.run((Treadmill) tren);
                    }
                }
            }
        }
    }
}

