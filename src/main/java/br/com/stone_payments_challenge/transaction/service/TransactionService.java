package br.com.stone_payments_challenge.transaction.service;

import br.com.stone_payments_challenge.transaction.model.dto.request.TransactionRequest;

public interface TransactionService {

     void buy(TransactionRequest request);

}
