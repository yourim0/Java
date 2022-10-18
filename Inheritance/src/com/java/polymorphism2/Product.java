package com.java.polymorphism2; //1005-5 다형성 연습 프로그램

public class Product { // 자식 클래스 모두가 필요한 공통 속성
	int price;
	int bonusPoint;

	// 자식에서 쓸 수 있는 메소드 or 오버라이딩

	// 생성자
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //10%를 포인트로 처리 
	}

}
