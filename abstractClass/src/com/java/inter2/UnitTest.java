package com.java.inter2;

public class UnitTest {

	public static void main(String[] args) {
		
		//객체 생성, hp 확정 --10
		Tank t = new Tank(150);
		Dropship d = new Dropship(200);
		SCV s = new SCV(40);
		
		//테스트
		Marine m = new Marine(30);
		
		s.repair(t);
		s.repair(d);
		//s.repair(m); 캐스팅 등 논리적 불가
		//s.repair(m);----------- 확인

	
	
	}

}
