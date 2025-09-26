package vn.khanhduy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import vn.khanhduy.repository.CategoryRepository;
import vn.khanhduy.services.ICategoryService;

public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	
}
