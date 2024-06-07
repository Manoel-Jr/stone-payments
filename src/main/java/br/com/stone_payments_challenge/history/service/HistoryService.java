package br.com.stone_payments_challenge.history.service;

import br.com.stone_payments_challenge.history.dto.response.HistoryResponse;
import br.com.stone_payments_challenge.transaction.model.dto.request.TransactionRequest;

import java.util.List;

public interface HistoryService {

    List<HistoryResponse> listHistory();

    List<HistoryResponse> listAllHistory(String clientId);

    public void saveHistory(TransactionRequest request);
}
