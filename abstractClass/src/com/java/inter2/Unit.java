package com.java.inter2; //모두가 가져야 하는 공통속성(모두의 조상)

public class Unit {
	int hitPoint;
	final int MAX_HP; //상수이기 때문에 선언과 동시에 초기화 해야함. //상속받는 클래스에서 이용할 변수.-1
	
	//생성자를 통한 초기화 (각 다른 에너지 설정이 필요해서)-2
	Unit(int hp) {
		super();
		MAX_HP = hp;
	}
	
	
	
	
	
}
