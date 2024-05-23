import java.util.LinkedList;
import java.util.Queue;

public class BottleTrack extends Track{
    private Queue<Bottle> bottles;

    public BottleTrack() {
        bottles = new LinkedList<>();
    }

    public Bottle getBottle() {
        if (bottles.isEmpty()) {
            throw new RuntimeException("Track is empty!");
        }

        return bottles.poll();
    }

    public void setBottle(Bottle bottle) {
        bottles.add(bottle);
    }
}
