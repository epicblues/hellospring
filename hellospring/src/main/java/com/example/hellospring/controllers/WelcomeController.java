package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/welcome")
@Controller
public class WelcomeController {
	// 파라미터 받아오기
	@RequestMapping("")
	public ModelAndView home(@RequestParam(value="name", required=false, defaultValue = "Anonymous") String name) {
		// 팔미터의 기본값을 설정할 수 있다.
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "hello " + name);
		mav.setViewName("/WEB-INF/views/welcome.jsp");
		return mav;
	}
}
