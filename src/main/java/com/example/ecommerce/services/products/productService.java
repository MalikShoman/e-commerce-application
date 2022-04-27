package com.example.ecommerce.services.products;

import com.example.ecommerce.dto.productDto;

import java.util.List;

public interface productService {
    productDto insertProduct(productDto product_Dto);

    List<productDto> getAllProducts();

    productDto getProductById(int id);

    productDto updateProduct(productDto ProductDto, int id);

    void deleteProductById(int id);
}
