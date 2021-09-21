package com.eve_coding.spring.security;

import com.eve_coding.spring.security.model.Role;
import com.eve_coding.spring.security.model.User;
import com.eve_coding.spring.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner runner(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"Eversmile","eve","123" +
					"4",new ArrayList<>()));
			userService.saveUser(new User(null,"Tshifhiwa","chief","123" +
					"4",new ArrayList<>()));
			userService.saveUser(new User(null,"Naruto","john","123" +
					"4",new ArrayList<>()));

			userService.addRoleToUser("eve","ROLE_USER");
			userService.addRoleToUser("eve","ROLE_MANAGER");
			userService.addRoleToUser("chief","ROLE_ADMIN");
			userService.addRoleToUser("john","ROLE_SUPER_ADMIN");

		};
	}

}
