package br.com.stone_payments_challenge.history.service.impl;

import br.com.stone_payments_challenge.history.dto.response.HistoryResponse;
import br.com.stone_payments_challenge.history.entity.History;
import br.com.stone_payments_challenge.history.repositories.HistoryRepository;
import br.com.stone_payments_challenge.history.service.HistoryService;
import br.com.stone_payments_challenge.transaction.model.dto.request.TransactionRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HistoryServiceImpl implements HistoryService {

    private final HistoryRepository historyRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<HistoryResponse> listHistory() {
        List<History> historyList = historyRepository.findAll();
        return Arrays.asList(modelMapper.map(historyList, HistoryResponse[].class));
    }

    @Override
    public List<HistoryResponse> listAllHistory(String clientId) {
        List<History> histories = historyRepository.findByClientId(clientId);
        return Arrays.asList(modelMapper.map(histories, HistoryResponse[].class));
    }

    public void saveHistory(TransactionRequest request) {
        History history = new History();
        history.setClientId(request.getClientId());
        history.setPurchaseId(UUID.randomUUID().toString());
        history.setAmount(request.getTotalPay());
        history.setDate(LocalDate.now());
        history.setCardNumber(request.getCreditCard().getCardNumber());
        historyRepository.save(history);
    }
}
