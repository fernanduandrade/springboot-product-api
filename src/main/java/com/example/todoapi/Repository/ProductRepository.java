package com.example.todoapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todoapi.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
