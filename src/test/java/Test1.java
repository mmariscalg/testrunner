/**
 * Created by mario.mariscal on 20/11/2017.
 */
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @Test
    void firstTest() {
        System.out.println("First test run");
    }

    @Test
    void secondTest() {
        System.out.println("Second test run");
    }

    @Test
    @Disabled("for demonstration purposes")
    void thirdTest() {
        System.out.println("Third test skipped");
    }

    @Test
    void fourthTest() {
        System.out.println("Fourth test failure");
        assertEquals(2, 3);
    }

    @Test
    void fifthTest() {
        throw new ArithmeticException("Fifth test error");
    }

    @Test
    void sixthTest() {
        throw new NullPointerException("Sixth test error");
    }

    @Test
    void seventhTest() {
        throw new IllegalArgumentException("Seventh test error");
    }
}
