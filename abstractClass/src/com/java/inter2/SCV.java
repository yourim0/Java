package com.java.inter2;

public class SCV extends GroundUnit implements Repairable {

	SCV(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}

	//// scv,탱크,dropship 치료기능(hp올리는개념) -5
//	void repair(Tank t) {// 누군지 확인 위한 받을 매개변수 -6 치료 대상 많아지면 비효율적
//	}
//	void repair(Dropship d) {// 누군지 확인 위한 받을 매개변수 -6
//	}
	
	//최상위 부모인 unit을 매개변수의 다형성을 이용하여 받는다 -7
	//마린은 받으면 안되는문제 --인터페이스로 처리 
	void repair(Repairable r) {//Repairable을 implements( scv, tank, dropship) 한 대상만 받게 됨. --8
		//타입체크 --9 다형성 사용 안하면 하나씩 다 비교해야함. 
		if(r instanceof Unit) { //부모로부터 상속받은 변수는 부모가 접근하나 자식이 접근하나 똑같음. -9 
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리완료");
		}
	}



	@Override
	public String toString() {
		return "SCV";
	}
}
