package br.com.stone_payments_challenge.product.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String  title;
    @Column
    private Integer  price;
    @Column
    private String  zipcode;
    @Column
    private String  seller;
    @Column
    private String  thumbnailHd;
    @Column
    private LocalDate data = LocalDate.now();
}
