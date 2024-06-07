package br.com.stone_payments_challenge.transaction.controller;

import br.com.stone_payments_challenge.transaction.model.dto.request.TransactionRequest;
import br.com.stone_payments_challenge.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/starstore")
@RestController
@RequiredArgsConstructor
public class TransactionRest {

    private final TransactionService transactionService;

    @PostMapping("/buy")
    public void buy(@RequestBody TransactionRequest request) {
        transactionService.buy(request);
    }
}


