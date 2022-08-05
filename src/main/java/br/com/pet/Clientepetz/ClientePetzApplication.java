package br.com.pet.Clientepetz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetzApplication {

	public String getHOmeTest() {
	return "Cliente Pet - Api home";
	}
	public static void main(String[] args) {
		SpringApplication.run(ClientePetzApplication.class, args);
	}

}
