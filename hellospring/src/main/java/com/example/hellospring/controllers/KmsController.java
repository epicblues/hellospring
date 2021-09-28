package com.example.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.hellospring.vo.RequestVo;

@RequestMapping("/kms")
@Controller
public class KmsController {
	
	@ResponseBody
	@RequestMapping("")
	public String home(@ModelAttribute RequestVo reqVo) {
		
		String responseTemplate = String.format("<meta charset=\"UTF-8\"/><h2>%s is stupid asshole</h2>", reqVo.getName());
		
		return responseTemplate;
	}
	
	@RequestMapping("/join")
	public String join(@ModelAttribute RequestVo reqVo, Model model) {
		
		model.addAttribute("message", reqVo.getName());
		return "/WEB-INF/views/hello.jsp";
	}
}
