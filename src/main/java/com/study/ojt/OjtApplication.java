package com.study.ojt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.study.*"})
public class OjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(OjtApplication.class, args);
	}

}
