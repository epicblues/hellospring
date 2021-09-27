package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("myController") // Bean의 이름을 custom하게 설정한다. 설정 없으면 클래스이름을 camelCase화
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView hello(@RequestParam String name, String age) {
		// parameter 처리 (서블릿에서 name = getParameter("name"))
		ModelAndView mav = new ModelAndView();
		// 스프링에서 가장 기본적인 데이터 처리 객체, 이후 등록된 뷰로 데이터를 전송하는 매개체 역할을 한다.
		
		mav.addObject("message", "Hello " + name + age); 
		// jsp에서 .접근 연산자 없이 바로 message라는 변수로 작성.
		// 객체 추가 : req.addAttribute와 같은 기능.
		
		mav.setViewName("/WEB-INF/views/hello.jsp"); // request dispatcher의 forwarding 대체
		// View 파일을 연결. 
		return mav;
	}
	
	@RequestMapping("/baka")
	public ModelAndView baka(@RequestParam String gender) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("gender", gender);
		return mav;
	}
	

}
