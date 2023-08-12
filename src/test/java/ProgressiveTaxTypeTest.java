import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressiveTaxTypeTest {
    ProgressiveTaxType sut = new ProgressiveTaxType();

   @Test
    public void progressiveTaxTypeTest() {

        BigDecimal amount = new BigDecimal(100000.00);
        BigDecimal expected = new BigDecimal("15000.00");

        BigDecimal result = sut.calculateTaxFor(amount);

        assertEquals(expected, result);
    }

}
