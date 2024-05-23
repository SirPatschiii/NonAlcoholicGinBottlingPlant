public class FillingRobot {
    private final StorageArea storageArea;
    private final StorageRobot storageRobot;

    private boolean isActivated;

    public FillingRobot(StorageArea storageArea, StorageRobot storageRobot) {
        this.storageArea = storageArea;
        this.storageRobot = storageRobot;

        isActivated = Configuration.INSTANCE.isActivated;
    }

    public void activate() {
        isActivated = true;
    }

    public void deactivate() {
        isActivated = false;
    }

    public void storeBottle(Bottle bottle) {
        if (!(storageArea.getBox().isFull())) {
            storageArea.getBox().add(bottle);
        } else {
            storageRobot.activate();
            storageRobot.deliverNewBox();
            storageRobot.deactivate();
            storageArea.getBox().add(bottle);
        }
    }
}
