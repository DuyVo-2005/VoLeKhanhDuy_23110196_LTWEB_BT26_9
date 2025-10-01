package vn.khanhduy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import vn.khanhduy.entities.Product;
import vn.khanhduy.services.ICategoryService;

@Controller
public class CategoryController {

	@Autowired
	ICategoryService categoryService;
	
	
}
