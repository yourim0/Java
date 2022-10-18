package com.java.polymorphism2;

public class SmartPhone extends Product {

	SmartPhone() {
		super(300);
	}

	//Object.toString 메소드를 오버라이딩. 객체 출력시 적용
	@Override
	public String toString() {
		return "SmartPhone";
	}

	
	
	
}
