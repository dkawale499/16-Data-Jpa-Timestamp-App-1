package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sts.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	= SpringApplication.run(Application.class, args);
	
	ProductService bean = context.getBean(ProductService.class);
	bean.saveProduct();
	
	}

}
