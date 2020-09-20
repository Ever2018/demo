package es.soaint.demo.controller;

import es.soaint.demo.model.UserResponse;
import es.soaint.demo.service.JWTToken;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class UserController {

	private JWTToken jwtToken;

	@PostMapping("user")
	public UserResponse login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
		String token = jwtToken.getJWTToken(username);
		UserResponse user = new UserResponse();
		user.setUser(username);
		user.setToken(token);		
		return user;
	}
}
