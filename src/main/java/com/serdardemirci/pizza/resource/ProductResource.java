package com.serdardemirci.pizza.resource;

import java.util.ArrayList;
import java.util.List;

import com.serdardemirci.pizza.model.Product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {

    @RequestMapping("products")
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<>();
		
		Product p1 = new Product(1, "Bir");
		Product p2 = new Product(2, "iki");
		
		products.add(p1);
		products.add(p2);
		
		return products;
	}
}
