package com.example.Spring.boot.CI.CD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/welcome")
	
	public String welcome() {
		return "Welcome to Hello world!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//
//echo "# github-actions-example" >> README.md
//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/sachida1997/github-actions-example.git
//git push -u origin main