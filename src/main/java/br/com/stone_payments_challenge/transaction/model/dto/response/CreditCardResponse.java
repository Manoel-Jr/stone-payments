package br.com.stone_payments_challenge.transaction.model.dto.response;

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
public class CreditCardResponse {

    @JsonProperty(value = "card_number")
    private String cardNumber;
    @JsonProperty(value = "card_holder_name")
    private String cardHolderName;
    @JsonProperty(value = "value")
    private	Integer amount;
    @JsonProperty(value = "cvv")
    private Integer cvv;
    @JsonProperty(value = "exp_date")
    private LocalDate expDate;
}
