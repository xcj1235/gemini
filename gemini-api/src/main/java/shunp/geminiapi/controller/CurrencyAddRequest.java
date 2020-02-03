package shunp.geminiapi.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CurrencyAddRequest {

    private String name;

    private String symbol;
}