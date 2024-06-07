package br.com.stone_payments_challenge.product.service.impl;

import br.com.stone_payments_challenge.product.dto.request.ProductRequest;
import br.com.stone_payments_challenge.product.dto.response.ProductResponse;
import br.com.stone_payments_challenge.product.entity.Product;
import br.com.stone_payments_challenge.product.repositories.ProductRepository;
import br.com.stone_payments_challenge.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    private final ModelMapper modelMapper;

    public void createProduct(ProductRequest request) {
        Product product = modelMapper.map(request,Product.class);
         modelMapper.map(repository.save(product),ProductResponse.class);
    }

    @Override
    public List<ProductResponse> listAll() {
        List<Product> products = repository.findAll();
        return Arrays.asList(modelMapper.map(products,ProductResponse[].class));
    }
}
