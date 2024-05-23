import java.util.ArrayList;

public class StorageArea {
    private final ArrayList<Box> storage;

    public StorageArea() {
        storage = new ArrayList<>();
    }

    public void addBox(Box box) {
        storage.addLast(box);
    }

    public Box getBox() {
        try {
            return storage.getLast();
        } catch (Exception e) {
            return null;
        }
    }
}
