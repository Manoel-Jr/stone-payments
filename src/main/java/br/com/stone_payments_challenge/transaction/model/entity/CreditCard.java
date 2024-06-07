package br.com.stone_payments_challenge.transaction.model.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Builder
public class CreditCard {

    private String cardNumber;
    private String cardHolderName;
    private	Integer amount;
    private Integer cvv;
    private String expDate;

}
