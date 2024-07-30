package com.Introtospringframeworkexample.Springframework_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class Springframework1Application implements CommandLineRunner {

	@Autowired
	Apple obj;

	@Autowired
	Apple obj2;
	public static void main(String[] args) {
		SpringApplication.run(Springframework1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatapple();
		obj2.eatapple();

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());
	}
}
