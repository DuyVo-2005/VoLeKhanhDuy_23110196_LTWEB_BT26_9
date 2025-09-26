package vn.khanhduy.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import vn.khanhduy.entities.Product;
import vn.khanhduy.services.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@QueryMapping
	public List<Product> products(){
		return  productService.findAll();
	}
	
	@QueryMapping
	public Optional<Product> productById(@Argument Integer id){
		return productService.findById(id);
	}
	
	@MutationMapping
	public Product createProduct(@Argument Product product) {
		return productService.save(product);
	}
}
