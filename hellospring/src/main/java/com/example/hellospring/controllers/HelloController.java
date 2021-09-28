package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


// 메서드 단독 매핑
@Controller("myController") // Bean의 이름을 custom하게 설정한다. 설정 없으면 클래스이름을 camelCase화
public class HelloController {
	@RequestMapping({"/hello","/baka"})
	public ModelAndView hello(@RequestParam(required=false) String name) {
		// parameter 처리 (서블릿에서 name = getParameter("name"))
		ModelAndView mav = new ModelAndView();
		// 스프링에서 가장 기본적인 데이터 처리 객체, 이후 등록된 뷰로 데이터를 전송하는 매개체 역할을 한다.
		
		mav.addObject("message", "Hello " + name); 
		// jsp에서 .접근 연산자 없이 바로 message라는 변수로 작성.
		// 객체 추가 : req.addAttribute와 같은 기능.
		
		mav.setViewName("/WEB-INF/views/hello.jsp"); // request dispatcher의 forwarding 대체
		// View 파일을 연결. 
		return mav;
	}
	
	
	//문자열을 반환하면 해당 view로 forwarding을 의미한다.
	@RequestMapping("/hello2")
	public String hello2() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	// 문자열을 반환할 때 직접 응답으로 전송하고자 할 때;
	// @ResponseBody - MessageConverter를 실행하는 Annotation;
	// API를 만들고 싶을 때 객체를 JSON으로 변환하는 모듈 사용
	// return할 때 변환된 JSON을 배열을 탑재한다.
	@ResponseBody
	@RequestMapping("/hello3") 
	public String hello3() {
		return "<h1>Direct HTML fragment 한글 되나?</h1><script>alert('hello world')</script>";
		// return된 문자열을 messageConverter로 전달 및 실행
	}

}
