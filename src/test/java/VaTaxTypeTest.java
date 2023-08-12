import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VaTaxTypeTest {
    VaTaxType sut = new VaTaxType();


    @Test
    public void vATaxTypeTestTest() {

        BigDecimal amount = new BigDecimal(20000);
        BigDecimal expected = new BigDecimal("3600.00");

        BigDecimal result = sut.calculateTaxFor(amount);

        assertEquals(expected, result);
    }
}
