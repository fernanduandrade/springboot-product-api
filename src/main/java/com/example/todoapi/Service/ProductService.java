package com.example.todoapi.Service;

import java.util.List;
import java.util.Optional;

import com.example.todoapi.Model.Product;

public interface ProductService {
	Product save(Product product);
	List<Product> findAll();
	Optional<Product> findById(Long id);
	Product update(Product product);
	void deleteById(Long id);
}
