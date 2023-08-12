import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxTypeTest {
    IncomeTaxType sut= new IncomeTaxType();


    @Test
    public void incomeTaxTypeTest()
    {
        BigDecimal amount = new BigDecimal (1000);
        BigDecimal expected = new BigDecimal("130.00");

        BigDecimal result = sut.calculateTaxFor(amount);
        assertEquals(expected, result);
    }
}
