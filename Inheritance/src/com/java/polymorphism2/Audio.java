package com.java.polymorphism2; //1005-5 다형성 연습 프로그램

public class Audio extends Product {
	
	Audio(){
		super(150);
	}

	@Override
	public String toString() {
		return "Audio";
	}
	
	
}
