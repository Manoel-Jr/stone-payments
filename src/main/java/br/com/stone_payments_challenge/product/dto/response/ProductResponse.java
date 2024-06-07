package br.com.stone_payments_challenge.product.dto.response;

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
public class ProductResponse {

    private String id;
    @JsonProperty(value = "title")
    private String  title;
    @JsonProperty(value = "price")
    private Integer  price;
    @JsonProperty(value = "zipcode")
    private String  zipcode;
    @JsonProperty(value = "seller")
    private String  seller;
    @JsonProperty(value = "thumbnailHd")
    private String  thumbnailHd;
    @JsonProperty(value = "date")
    private LocalDate data;
}
