public class Box {
    private Bottle[][] storageArea;

    public Box() {
        storageArea = new Bottle[3][3];
    }

    public Bottle[][] getStorageArea() {
        return storageArea;
    }
}
