package com.codegym;

import com.codegym.service.SuppliersService;
import com.codegym.service.impl.SuppliersServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class FashionProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(FashionProjectApplication.class, args);
	}

}
