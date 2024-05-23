import org.mockito.*;


public class ParamTest {

        Bottle bottle = new Bottle(name, serialNumber);


        @BeforeEach
        void setup() {
        }

        @Test
        public void TestIncreaseContent() {
                void content = bottle.increaseContent();
                assertNotNull(content);

        }

        @Test
        public void TestDeactivate() {

        }
        @Test
        public void TestFillingBottle() {

        }

}

