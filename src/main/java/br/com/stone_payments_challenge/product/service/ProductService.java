package br.com.stone_payments_challenge.product.service;

import br.com.stone_payments_challenge.product.dto.request.ProductRequest;
import br.com.stone_payments_challenge.product.dto.response.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest request);

    List<ProductResponse> listAll();
}
