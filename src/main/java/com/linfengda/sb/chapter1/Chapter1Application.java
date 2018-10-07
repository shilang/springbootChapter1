package com.linfengda.sb.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.linfengda.sb.chapter1","com.linfengda.sb.common","com.linfengda.sb.support"})
@SpringBootApplication
public class Chapter1Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter1Application.class, args);
	}
}
