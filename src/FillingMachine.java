public class FillingMachine {
    private final BottleTrack bottleTrack;
    private final Tank tank;
    private final FillingRobot fillingRobot;

    private boolean isActivated;

    public FillingMachine(BottleTrack bottleTrack, Tank tank, FillingRobot fillingRobot) {
        this.bottleTrack = bottleTrack;
        this.tank = tank;
        this.fillingRobot = fillingRobot;

        isActivated = Configuration.INSTANCE.isActivated;
    }

    public void fillingBottle() {
        Bottle bottleToBeFilled;
        while (isActivated && !(tank.isEmpty())) {
            bottleToBeFilled = bottleTrack.getBottle();

            while (!(bottleToBeFilled.isFilled())) {
                bottleToBeFilled.increaseContent();
                tank.decreaseContent();
            }

            fillingRobot.activate();
            fillingRobot.storeBottle(bottleToBeFilled);
            fillingRobot.deactivate();
        }
    }

    public void activate() {
        isActivated = true;
    }

    public void deactivate() {
        isActivated = false;
    }
}
