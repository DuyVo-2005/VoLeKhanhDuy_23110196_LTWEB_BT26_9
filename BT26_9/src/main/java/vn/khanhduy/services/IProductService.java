package vn.khanhduy.services;

import java.util.List;
import java.util.Optional;

import vn.khanhduy.entities.Product;

public interface IProductService {

	<S extends Product> S save(S entity);

	Optional<Product> findById(Integer id);

	List<Product> findAll();

	List<Product> findAllByOrderByPriceAsc();
}
