package com.Introtospringframeworkexample.Springframework_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springframework1Application implements CommandLineRunner {

	@Autowired
	Apple obj;
	public static void main(String[] args) {
		SpringApplication.run(Springframework1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatapple();
	}
}
