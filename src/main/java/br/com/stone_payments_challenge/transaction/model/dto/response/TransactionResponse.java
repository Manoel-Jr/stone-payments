package br.com.stone_payments_challenge.transaction.model.dto.response;

import br.com.stone_payments_challenge.transaction.model.dto.request.CreditCardRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {

    @JsonProperty(value = "client_id")
    private String clientId;
    @JsonProperty(value = "client_name")
    private String clientName;
    @JsonProperty(value = "total_to_pay")
    private Integer totalPay;
    @JsonProperty(value = "credit_card")
    private CreditCardResponse creditCard;
}
