public class StorageRobot {
    private final BoxTrack boxTrack;
    private final StorageArea storageArea;

    private boolean isActivated;

    public StorageRobot(BoxTrack boxTrack, StorageArea storageArea) {
        this.boxTrack = boxTrack;
        this.storageArea = storageArea;

        isActivated = Configuration.INSTANCE.isActivated;
    }

    public void activate() {
        isActivated = true;
    }

    public void deactivate() {
        isActivated = false;
    }

    public void deliverNewBox() {
        if (isActivated) {
            Box box = boxTrack.getBox();
            storageArea.addBox(box);
        }
    }
}
