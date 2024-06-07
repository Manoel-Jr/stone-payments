package br.com.stone_payments_challenge.product.controller;

import br.com.stone_payments_challenge.product.dto.request.ProductRequest;
import br.com.stone_payments_challenge.product.dto.response.ProductResponse;
import br.com.stone_payments_challenge.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/starstore")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


    @PostMapping("/product")
    public void createProduct(@RequestBody ProductRequest request){
        productService.createProduct(request);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponse>> listAll() {
        return new ResponseEntity<>(productService.listAll(), HttpStatus.CREATED);
    }
}
