import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        float result = Calculator.Calculate("2+3*4");
        assertEquals(14.0, result, 0.001);
    }
}
