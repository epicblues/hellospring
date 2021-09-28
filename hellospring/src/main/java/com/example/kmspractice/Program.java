package com.example.kmspractice;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.hellospring.vo.RequestVo;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/example/kmspractice/test.xml");
		ApplicationContext context2 = new AnnotationConfigApplicationContext(NewlecAppConfig.class);
		
		Exam exam = (Exam)context.getBean("newlec");
		RequestVo vo = context.getBean(RequestVo.class);
		exam.print();
		System.out.println(vo);
		
	}

}
