import org.example.CalculatorImplement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testSum() {
        CalculatorImplement cal = new CalculatorImplement();
        Assert.assertEquals(cal.sum(2, 4), 6);
    }

    @Test
    public void testSub() {
        CalculatorImplement cal = new CalculatorImplement();
        Assert.assertEquals(cal.sub(2, 2), 0);
    }

}
