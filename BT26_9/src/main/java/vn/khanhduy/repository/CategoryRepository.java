package vn.khanhduy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.khanhduy.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
