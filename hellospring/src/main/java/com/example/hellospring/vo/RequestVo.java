package com.example.hellospring.vo;


// DTO 객체로 요청 파라미터 전달
public class RequestVo {
	private long no;
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
	
	
}
