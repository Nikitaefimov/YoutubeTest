package startTests;

import org.junit.Test;
import java.util.logging.Logger;
import tests.mainPageTest;

public class startTests extends driverSetup.driverSetup {
    private static Logger log = Logger.getLogger(startTests.class.getName());

    @Test
    public void test() {
        mainPageTest.A();
    }
}