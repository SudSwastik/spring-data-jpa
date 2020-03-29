package com.sudarshan.sud;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.sudarshan.sud.model.Product;
import com.sudarshan.sud.repository.ProductRepository;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreateProduct() {

		Product product = new Product();
		product.setId(1l);
		product.setDesc("Nokia");
		product.setName("Phone");
		product.setPrice(1000d);

		productRepository.save(product);
	}

	@Test
	public  void testProduct() {
		Optional<Product> repositoryId = productRepository.findById(1l);
		assertNotNull(repositoryId.get());
		assertEquals("Phone", repositoryId.get().getName());
	}

}
