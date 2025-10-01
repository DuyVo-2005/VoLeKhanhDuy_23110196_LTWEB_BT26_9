package vn.khanhduy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.khanhduy.repository.CategoryRepository;
import vn.khanhduy.services.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	
}
