import java.util.Random;

public class Identity {
    private long serialNumber;
    private long[] serialNumbers;
    private int c;

    public Identity() {
        serialNumbers = new long[27];
        c = 0;
    }

    private long generateSerialNumber() {
        Random random = new Random();

        long min = 1_000_000_000L;
        long max = 9_999_999_999L;

        do {
            serialNumber = min + (long)(random.nextDouble() * (max - min + 1));
        } while (checkIfSerialNumberAlreadyExists(serialNumber));

        serialNumbers[c] = serialNumber;
        c++;

        return serialNumber;
    }

    private boolean checkIfSerialNumberAlreadyExists(long serialNumber) {
        for (long number : serialNumbers) {
            if (serialNumber == number) {
                return true;
            }
        }
        return false;
    }

    public long getSerialNumber() {
        return generateSerialNumber();
    }
}
