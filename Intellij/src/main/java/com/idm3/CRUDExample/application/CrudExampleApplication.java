package com.idm3.CRUDExample.application;

import com.idm3.CRUDExample.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@SpringBootApplication
@ComponentScan({"com.idm3.CRUDExample.service", "com.idm3.CRUDExample.controllers"})
@EntityScan("com.idm3.CRUDExample.model")
@EnableJpaRepositories("com.idm3.CRUDExample.repository")
public class CrudExampleApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository prodRepository;

	private static final Logger log = LoggerFactory.getLogger(CrudExampleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CrudExampleApplication.class, args);
	}


	public void run(String... args) throws Exception {
		//fetch all products
		log.info("Products found with findAll():");
		log.info("-------------------------------");
		prodRepository.findAll().forEach(product -> {
			log.info(product.toString());
		});
		log.info("");
	}

}



