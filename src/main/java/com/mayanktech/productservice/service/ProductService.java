package com.mayanktech.productservice.service;

import org.springframework.stereotype.Service;

import com.mayanktech.productservice.dto.ProductRequest;
import com.mayanktech.productservice.modal.Product;
import com.mayanktech.productservice.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {

	private final ProductRepository productRepository = null;
	public void createProduct(ProductRequest productRequest) {
		Product product = Product.builder()
				.name(productRequest.getName())
				.description(productRequest.getDescription())
				.price(productRequest.getPrice())
				.build();
		productRepository.save(product);
		
		log.info("Product {} is saved",product.getId());
	}
}
