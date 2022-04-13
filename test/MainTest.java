import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

class MainTest {

    @BeforeAll
    void setUp() {
        System.out.println("Setting up test");
    }

    @DisplayName("main")

    @Test public void testMain() throws FileNotFoundException {
        String[] args = null;
        final InputStream original = System.in;
        final FileInputStream is = new FileInputStream("C:\\Users\\Terrence\\Documents\\GitHub\\Guess-The-Number-Exceptions\\java\\Main.java");
        System.setIn(is);
        Main.main(args);
        System.setIn(original);
    }

    @AfterAll
    void tearDown() {
        System.out.println("Ending test");
    }
}