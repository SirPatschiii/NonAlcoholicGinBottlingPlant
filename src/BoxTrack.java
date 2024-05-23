import java.util.LinkedList;
import java.util.Queue;

public class BoxTrack extends Track{
    private Queue<Box> boxTrack;

    public BoxTrack() {
        boxTrack = new LinkedList<>();
    }

    public void setBox(Box box) {
        boxTrack.add(box);
    }
}
