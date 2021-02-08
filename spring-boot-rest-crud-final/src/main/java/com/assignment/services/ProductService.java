package com.assignment.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.pojos.Product;
import com.assignment.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}

	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "this product is not available" + id;
	}

	public Product updateProduct(Product product) {
		Product existingProd = productRepository.findById(product.getId()).orElse(null);
		existingProd.setName(product.getName());
		existingProd.setDescription(product.getDescription());
		existingProd.setPrice(product.getPrice());
		existingProd.setSeller(product.getSeller());
		existingProd.setLocation(product.getLocation());
		return productRepository.save(existingProd);

	}
}
