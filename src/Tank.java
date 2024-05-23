public class Tank {
    private int content;

    public Tank(int length, int width, int height) {
        content = length * width * height;
    }

    public void decreaseContent() {
        if (content < 0) {
            throw new RuntimeException("No content left!");
        }

        content--;
    }

    public boolean isEmpty() {
        if (content <= 0) {
            return true;
        }
        return false;
    }
}
