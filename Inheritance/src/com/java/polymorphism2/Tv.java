package com.java.polymorphism2; //1006_상속,인터페이스 다형성 연습 프로그램

public class Tv extends Product {
	
	//부모생성자 호출부분
	Tv(){
		super(100);
	}	
	
	//source - override methods
	@Override
	public String toString() {
		return "tV";
	}

	
}
