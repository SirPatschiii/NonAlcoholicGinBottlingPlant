public class Application {
    public static void main(String[] args) {
        // Bottles
        Bottle[] bottles = new Bottle[27];
        Identity identity = new Identity();

        for (int i = 0; i < 27; i++) {
            bottles[i] = new Bottle("Lab Gin 2008", identity.getSerialNumber());
        }

        // Box
        Box[] boxes = new Box[3];

        for (int i = 0; i < 3; i++) {
            boxes[i] = new Box();
        }

        // BoxTrack
        BoxTrack boxTrack = new BoxTrack();

        for (Box box : boxes) {
            boxTrack.setBox(box);
        }

        // BottleTrack
        BottleTrack bottleTrack = new BottleTrack();

        for (Bottle bottle : bottles) {
            bottleTrack.setBottle(bottle);
        }
    }
}
