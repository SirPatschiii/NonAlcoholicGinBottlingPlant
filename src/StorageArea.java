public class StorageArea {
    private Box[] storage;
    private final int capacity = 3;
    private int top;

    public StorageArea() {
        storage = new Box[capacity];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void addBox(Box box) {
        if (!isFull()) {
            storage[++top] = box;
        } else {
            throw new IndexOutOfBoundsException("Storage area already full!");
        }
    }

    public Box getBox() {
        return storage[top];
    }
}
