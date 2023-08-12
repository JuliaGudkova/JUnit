import java.math.BigDecimal;

public class VaTaxType extends TaxType {
    public BigDecimal amount;

    public VaTaxType() {
        this.amount = amount;
    }

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        return amount.multiply(BigDecimal.valueOf(0.18));
    }
}
