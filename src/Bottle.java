public class Bottle {
    private final String name;
    private int content;
    private final MouthPiece mouthPiece;
    private final String height;
    private final String diameter;
    private final int marginalCapacity;
    private final String weight;
    private boolean isFilled;
    private long serialNumber;

    public Bottle(String name, long serialNumber) {
        this.name = name;
        content = 0;
        this.mouthPiece = MouthPiece.CARNETTE;
        height = Configuration.INSTANCE.bottleHeight;
        diameter = Configuration.INSTANCE.diameter;
        marginalCapacity = Configuration.INSTANCE.marginalCapacity;
        weight = Configuration.INSTANCE.weight;
        isFilled = false;
        this.serialNumber = serialNumber;
    }
}
