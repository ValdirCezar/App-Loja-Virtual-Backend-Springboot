package com.valdir.mc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdir.mc.services.S3Service;

@SpringBootApplication
public class McApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3service;

	
	public static void main(String[] args) {
		SpringApplication.run(McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3service.uploadFile("C:\\Users\\valdi\\Documents\\Cursos\\Spring Projects\\pc-gamer.jpg");
	}

}
