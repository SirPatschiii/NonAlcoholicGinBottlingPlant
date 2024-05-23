public class Tank {
    private int content;

    public Tank(int length, int width, int height) {
        content = length * width * height;
    }

    public void decreaseContent(int amount) {
        content = content - amount;
    }
}
