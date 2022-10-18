package com.java.polymorphism2; //1005-5 다형성 연습 프로그램

public class Computer extends Product {
	//부모클래스의 생성자 호출
	 Computer(){
		super(100);
	 }

	@Override
	public String toString() {
		return "Computer";
	}
	 
	 
}
