package shunp.geminiapi.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
public class Currency {

    /** 自動採番ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** 仮想通貨名 */
    private String name;

    /** シンボル */
    private String symbol;

    /** 数量 */
    private BigDecimal amount;

    public static Currency newCurrency(String name, String symbol) {
        Currency currency = new Currency();
        currency.name = name;
        currency.symbol = symbol;
        currency.amount = BigDecimal.ZERO;
        return currency;
    }
}