package vn.khanhduy.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import vn.khanhduy.entities.User;
import vn.khanhduy.services.IUserService;

@Controller
public class UserController {

	@Autowired
	IUserService userService;

	@QueryMapping(name = "users")
	public List<User> findAllUsers() {
		return userService.findAll();
	}

	@QueryMapping
	public Optional<User> findUserById(@Argument Integer id) {
		return userService.findById(id);
	}

	@MutationMapping
	public User createUser(@Argument String email, @Argument String fullname, @Argument String password,
			@Argument String phone) {
		User user = new User();
		user.setEmail(email);
		user.setFullname(fullname);
		user.setPassword(password);
		user.setPhone(phone);
		return userService.save(user);
	}

	@MutationMapping
	public User updateUser(@Argument Integer id, @Argument String email, @Argument String fullname,
			@Argument String password, @Argument String phone) {
		User user = new User();
		user.setEmail(email);
		user.setFullname(fullname);
		user.setPassword(password);
		user.setPhone(phone);
		return userService.updateUser(id, user);
	}

	@MutationMapping
	public Boolean deleteUser(@Argument Integer id) {
		userService.deleteById(id);
		return true;
	}
}
