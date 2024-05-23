import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ParamTest {

        FillingMachine fillingMachine = mock(FillingMachine.class);

        @Test
        public void TestIncreaseContent() {
                // fillingMachine.fillingBottle();
                doNothing().when(fillingMachine).fillingBottle();
                // verify(fillingMachine).fillingBottle();

        }


        public void TestDeactivate() {

        }

        public void TestFillingBottle() {

        }

}

