package br.com.stone_payments_challenge.history.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HistoryResponse {

    private Long id;
    @JsonProperty(value = "client_id")
    private String clientId;
    @JsonProperty(value = "purchase_id")
    private String purchaseId;
    @JsonProperty(value = "value")
    private Integer amount;
    @JsonProperty(value = "date")
    private LocalDate data;
    @JsonProperty(value = "card_number")
    private String cardNumber;
}
