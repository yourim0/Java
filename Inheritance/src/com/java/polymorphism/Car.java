package com.java.polymorphism; //1005-3 다형성

public class Car {
	String color; // 패키지가 같으니 default 여도 사용가능.
	int door;

	void driver() {
		System.out.println("drive gogo");
	}

	void stop() {
		System.out.println("stop");
	}

	// 매개변수 Car 타입으로 정의
	// Car -> Car, FireEngine, Ambulance 다형성에 의해 받을 수 있는 타입
	void doWork(Car c) {//매개변수를 활용한 객체의 생성
		// Car 타입으로 변환되니 siren 이나 water 못씀
		// instanceof ---4 객체의 타입을 확인
		// if(참조변수 instanceof 클래스이름(알고싶은타입))
		if (c instanceof FireEngine) {
			FireEngine fe = (FireEngine) c;
			// water 사용 위해서 fireengine 타입으로 강제 형변환을 해준다. 캐스팅
			fe.water();
		} else if (c instanceof Ambulance) {
			Ambulance ab = (Ambulance) c;
			ab.siren();
		}
	}
}
