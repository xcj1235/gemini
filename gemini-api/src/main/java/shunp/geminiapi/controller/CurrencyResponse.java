package shunp.geminiapi.controller;

import lombok.Builder;
import lombok.Getter;
import shunp.geminiapi.domain.Currency;

import java.util.List;

@Getter
@Builder
public class CurrencyResponse {

    private List<Currency> currencies;
}
