package br.com.stone_payments_challenge.history.controller;

import br.com.stone_payments_challenge.history.dto.response.HistoryResponse;
import br.com.stone_payments_challenge.history.service.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/starstore")
@RequiredArgsConstructor
public class HistoryController {

    private final HistoryService historyService;


    @GetMapping("/history")
    public ResponseEntity<List<HistoryResponse>> listPurchase() {
        return new ResponseEntity<>(historyService.listHistory(), HttpStatus.OK);
    }

    @GetMapping("/history/{clientId}")
    public ResponseEntity<List<HistoryResponse>> listAllHistory(@PathVariable String clientId) {
        return new ResponseEntity<>(historyService.listAllHistory(clientId), HttpStatus.OK);
    }
}
