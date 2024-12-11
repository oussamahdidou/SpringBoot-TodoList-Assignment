package com.SpringBoot_TodoList_Assignment.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(info = @Info(title = "SpringBootAPiDocs", version = "1.0.0", description = "Api Documentation", contact = @Contact(name = "Oussama Hdidou", url = "https://oussamahdidou.vercel.app/#contacts")))

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
