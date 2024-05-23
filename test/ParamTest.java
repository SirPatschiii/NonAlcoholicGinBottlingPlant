import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.mockito.Mockito.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ParamTest {

    FillingMachine fillingMachine = mock(FillingMachine.class);
    StorageRobot storageRobot = mock(StorageRobot.class);
    FillingRobot fillingRobot = mock(FillingRobot.class);
    Bottle bottle = new Bottle("test", 1);

    @Test
    @Order(1)
    public void TestFillingBottle() {
        doNothing().when(fillingMachine).fillingBottle();

    }

    @Test
    @Order(2)
    public void TestActivateFillingMachine() {
        doNothing().when(fillingMachine).activate();
    }

    @Test
    @Order(3)
    public void TestDeactivateFillingMachine() {
        doNothing().when(fillingMachine).deactivate();
    }

    @Test
    @Order(4)
    public void TestActivateStorageRobot() {
        doNothing().when(storageRobot).activate();
    }

    @Test
    @Order(5)
    public void TestDeactivateStorageRobot() {
        doNothing().when(storageRobot).deactivate();
    }

    @Test
    @Order(6)
    public void TestActivateFillingRobot() {
        doNothing().when(fillingRobot).activate();
    }

    @Test
    @Order(7)
    public void TestDeactivateFillingRobot() {
        doNothing().when(fillingRobot).deactivate();
    }

    @Test
    @Order(8)
    public void TestStoreBottleFillingRobot() {
        doNothing().when(fillingRobot).storeBottle(bottle);
    }

    @Test
    @Order(9)
    public void TestCommandNewBoxFillingRobot() {
        doNothing().when(fillingRobot).commandNewBox();
    }
}
