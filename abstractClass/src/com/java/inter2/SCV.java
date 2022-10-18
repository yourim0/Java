package com.java.inter2;

public class SCV extends GroundUnit implements Repairable {

	SCV(int hp) {
		super(hp);
		hitPoint = MAX_HP;
	}

	//// scv,��ũ,dropship ġ����(hp�ø��°���) -5
//	void repair(Tank t) {// ������ Ȯ�� ���� ���� �Ű����� -6 ġ�� ��� �������� ��ȿ����
//	}
//	void repair(Dropship d) {// ������ Ȯ�� ���� ���� �Ű����� -6
//	}
	
	//�ֻ��� �θ��� unit�� �Ű������� �������� �̿��Ͽ� �޴´� -7
	//������ ������ �ȵǴ¹��� --�������̽��� ó�� 
	void repair(Repairable r) {//Repairable�� implements( scv, tank, dropship) �� ��� �ް� ��. --8
		//Ÿ��üũ --9 ������ ��� ���ϸ� �ϳ��� �� ���ؾ���. 
		if(r instanceof Unit) { //�θ�κ��� ��ӹ��� ������ �θ� �����ϳ� �ڽ��� �����ϳ� �Ȱ���. -9 
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "�� �����Ϸ�");
		}
	}



	@Override
	public String toString() {
		return "SCV";
	}
}
