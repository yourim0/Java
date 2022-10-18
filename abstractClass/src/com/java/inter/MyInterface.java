package com.java.inter;//1006-2 인터페이스

public interface MyInterface { //차이 1. 생성시 class아닌 interface 클릭

	//인터페이스
	//1. 생성이 불가
	//2. 클래스처럼 멤버를 정의할 수 없다.
	//3. 두가지 형식의 멤버만 정의 할 수 있다. (추상메소드, final 상수)
	// -- 멤버의 제한자는 생략 가능
	//4. 반드시 클래스에 상속해야 한다. 
	//5. 자식클래스는 추상메소드를 오버라이딩 해아한다.(필수)
	//6. 인터페이스간 상속도 가능하다.
	//7. 다중 상속이 가능하다.
	//8. 클래스와 동일하게 다형성을 적용할 수 있다 .(제일핵심)
	
	
	//3.인터페이스 구현 가능 형태 
	//public static final int MAX = 100; //1. final 상수
	//ublic abstract void method(); //2. 추상메소드(제한자 public abstract)

	//--제한자 생략 가능 형태
	int MAX = 100; //(제한자 public static final)
	void method(); //(제한자 public abstract)
}
