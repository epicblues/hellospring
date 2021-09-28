package com.example.kmspractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.example.kmspractice", "com.example.hellospring.vo"})
@Configuration
public class NewlecAppConfig {
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
	
}
