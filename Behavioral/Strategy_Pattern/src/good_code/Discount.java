package good_code;

import java.math.BigDecimal;

public interface Discount {
    BigDecimal applyDiscount(BigDecimal price);
}
