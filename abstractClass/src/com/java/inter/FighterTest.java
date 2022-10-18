package com.java.inter;//1006-3 인터페이스를 사용한 다형성

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
	//	Moveable m = new Fighter(); //업캐스팅
	//	Attackable aa = f; //자식->부모타입 업캐스팅
	//	Moveable m = new Moveable(); 	//1. 생성이 불가
		
		if(f instanceof Unit) { //unit타입이 f의 조상인지 //변수 instanceof 클래스명 or 인터페이스 
			System.out.println("Unit은 조상 클래스이다.");
		}
		if(f instanceof Fightable) {
			System.out.println("Fightable은 조상 클래스이다.");
		}
		if(f instanceof Moveable) {
			System.out.println("Moveable은 조상 클래스이다.");
		}
		
	}

}
