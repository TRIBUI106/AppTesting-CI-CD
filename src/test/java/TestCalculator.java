import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testSum() {
        Calculator cal = new CalculatorImplement();
        Assert.assertEquals(cal.sum(2, 4), 6);
    }

}
