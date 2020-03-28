package com.sudarshan.sud.repository;

import com.sudarshan.sud.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {

}