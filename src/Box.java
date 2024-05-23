public class Box {
    private final Bottle[][] storageArea;

    public Box() {
        storageArea = new Bottle[3][3];
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (storageArea[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public void add(Bottle bottle) {
        if (isFull()) {
            throw new RuntimeException("Box is full!");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (storageArea[i][j] == null) {
                    storageArea[i][j] = bottle;
                    return;
                }
            }
        }
    }
}
