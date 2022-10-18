package com.java.inter2;

public class Marine extends GroundUnit implements RepairableMarine{

	Marine(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	//표시위한 tostring 오버라이딩-4
	@Override
	public String toString() {
		return "Marine";
	}

	void repair(RepairableMarine rm) {//Repairable을 implements( scv, tank, dropship) 한 대상만 받게 됨. --8
		//타입체크 --9 다형성 사용 안하면 하나씩 다 비교해야함. 
		if(rm instanceof Unit) { //부모로부터 상속받은 변수는 부모가 접근하나 자식이 접근하나 똑같음. -9 
			Unit u = (Unit)rm;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리완료");
		}
	}
	
	
}
