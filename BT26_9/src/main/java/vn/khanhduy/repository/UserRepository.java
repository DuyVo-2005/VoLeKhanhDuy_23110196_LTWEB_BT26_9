package vn.khanhduy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.khanhduy.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
}
