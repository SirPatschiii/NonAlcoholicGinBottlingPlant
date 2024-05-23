public class Application {
    public static void main(String[] args) {
        // Bottles
        Bottle[] bottles = new Bottle[27];
        Identity identity = new Identity();

        for (int i = 0; i < 27; i++) {
            bottles[i] = new Bottle("Lab Gin 2008", identity.getSerialNumber());
        }
    }
}
