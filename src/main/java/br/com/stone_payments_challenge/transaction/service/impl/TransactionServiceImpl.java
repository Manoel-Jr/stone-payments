package br.com.stone_payments_challenge.transaction.service.impl;

import br.com.stone_payments_challenge.history.service.HistoryService;
import br.com.stone_payments_challenge.transaction.model.dto.request.TransactionRequest;
import br.com.stone_payments_challenge.transaction.model.entity.CreditCard;
import br.com.stone_payments_challenge.transaction.model.entity.Transaction;
import br.com.stone_payments_challenge.transaction.repositories.TransactionRepository;
import br.com.stone_payments_challenge.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    private final HistoryService historyService;

    @Override
    public void buy(TransactionRequest request) {
        Transaction transaction = toDomain(request);
        transactionRepository.save(transaction);
        historyService.saveHistory(request);
    }

    private Transaction toDomain(TransactionRequest request) {
        return Transaction.builder()
                .clientId(request.getClientId())
                .clientName(request.getClientName())
                .totalPay(request.getTotalPay())
                .creditCard(CreditCard.builder()
                        .cvv(request.getCreditCard().getCvv())
                        .amount(request.getCreditCard().getAmount())
                        .cardHolderName(request.getCreditCard().getCardHolderName())
                        .cardNumber(request.getCreditCard().getCardNumber())
                        .expDate(request.getCreditCard().getExpDate())
                        .build())
                .build();
    }
}
