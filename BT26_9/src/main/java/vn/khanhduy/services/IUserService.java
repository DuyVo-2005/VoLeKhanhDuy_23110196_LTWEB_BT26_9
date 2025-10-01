package vn.khanhduy.services;

import java.util.List;
import java.util.Optional;

import vn.khanhduy.entities.User;

public interface IUserService {

	void deleteById(Integer id);

	Optional<User> findById(Integer id);

	List<User> findAll();

	<S extends User> S save(S entity);
	
	User updateUser(Integer id, User user);
}
