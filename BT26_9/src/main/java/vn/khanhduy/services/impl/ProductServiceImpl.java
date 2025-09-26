package vn.khanhduy.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.khanhduy.entities.Product;
import vn.khanhduy.repository.ProductRepository;
import vn.khanhduy.services.IProductService;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public <S extends Product> S save(S entity) {
		return productRepository.save(entity);
	}
	
	
}
