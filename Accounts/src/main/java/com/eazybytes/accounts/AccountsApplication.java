package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservices REST API documentation",
				version = "V1",
				contact = @Contact(
						name = "Omkar P",
						email = "omkar@gmail.com",
						url = "https://localhost/omkar.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "example.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Accounts Microservices REST API documentation",
				url = "http://localhost:8080/swagger-ui/index.html#/"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
