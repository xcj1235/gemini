package shunp.geminiapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shunp.geminiapi.domain.Currency;
import shunp.geminiapi.service.CurrencyService;


import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

    private final CurrencyService currencyService;

    @GetMapping("/")
    public ResponseEntity<CurrencyResponse> findAll() {
        List<Currency> currencies = currencyService.findAll();
        CurrencyResponse currencyResponse = CurrencyResponse.builder()
                .currencies(currencies)
                .build();
        return new ResponseEntity<>(currencyResponse, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<HttpStatus> save(@RequestBody CurrencyAddRequest request) {
        currencyService.save(request.getName(), request.getSymbol());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long id) {
        currencyService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}