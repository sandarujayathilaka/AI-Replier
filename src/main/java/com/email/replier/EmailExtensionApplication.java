package com.email.replier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.email.app")
public class EmailExtensionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailExtensionApplication.class, args);
	}

}
