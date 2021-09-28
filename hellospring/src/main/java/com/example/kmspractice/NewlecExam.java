package com.example.kmspractice;

import org.springframework.stereotype.Component;

@Component(value = "newlec")
public class NewlecExam implements Exam {

	public NewlecExam() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void print() {
		System.out.println("Hello");
	}

}
