import org.junit.Assert;
import org.junit.Test;

public class SquareRootCalculatorTests {

    @Test
    public void testForNonDecimalNumber(){
        Assert.assertEquals("4.00000", SquareRootCalculator.calculateSuareRoot("16"));
    }

    @Test
    public void testForDecimalNumber(){
        Assert.assertEquals("0.50000", SquareRootCalculator.calculateSuareRoot("0.25"));
    }
}
