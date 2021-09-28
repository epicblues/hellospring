package com.example.hellospring.vo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// DTO 객체로 요청 파라미터 전달
@Component
public class RequestVo {
	
	@Value("20")
	private long no;
	@Value("kms")
	private String name;
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "RequestVo [no=" + no + ", name=" + name + "]";
	}
	
	
}
