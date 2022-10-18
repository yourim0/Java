package com.java.inter2;

public class Marine extends GroundUnit implements RepairableMarine{

	Marine(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}
	//ǥ������ tostring �������̵�-4
	@Override
	public String toString() {
		return "Marine";
	}

	void repair(RepairableMarine rm) {//Repairable�� implements( scv, tank, dropship) �� ��� �ް� ��. --8
		//Ÿ��üũ --9 ������ ��� ���ϸ� �ϳ��� �� ���ؾ���. 
		if(rm instanceof Unit) { //�θ�κ��� ��ӹ��� ������ �θ� �����ϳ� �ڽ��� �����ϳ� �Ȱ���. -9 
			Unit u = (Unit)rm;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� �����Ϸ�");
		}
	}
	
	
}
