package com.java.polymorphism2;//1005-5 다형성 연습 프로그램 

//product와 포함관계:다형성 구현 위함

//일반적으로 제공자 클래스내용이 바뀌어도 사용자쪽에는 변화가 없어야 좋다. 

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) { //tv, computer, audio, smartphone
		if(money < p.price) {
			System.out.println("금액이 부족합니다.");
			return;
		}

	money -= p.price;
	bonusPoint += p.bonusPoint;
	System.out.println(p+"구매완료 "); //무슨 물건을 구매했는지
	
	}
	
	//매개변수를 활용한 타입  (생성, 매개변수 등 다양한 방식으로 사용하여 포함 관계로 만들 수 있음)
//	void buy(Product p) {
//		System.out.println(p.price); //외부에서 이미 만들어진 가격정보를 가져옴
//	}
	///부모타입으로 캐스팅되어 들어오기때문에 다운캐스팅 해주어야 함
	
	//Tv t = new Tv(); 원래가능
	//Product p = new Tv(); 
	
	//사용할 수 있는 멤버 개수는 똑같다
	//Product p = new Tv() //사용가능한거 2개
	//Tv t = new Tv() //2개
	//t.price 나 p.price 동일하다
	
	
	
	
	//다형성을 이용한 예제
	//오버로딩을 이용해 매개변수의 타입을 달리해 사용
//	void buy(Computer c) {
//	}
//	void buy(Audio a) {
//	}
	
}
