package com.java.inter2;

public class UnitTest {

	public static void main(String[] args) {
		
		//��ü ����, hp Ȯ�� --10
		Tank t = new Tank(150);
		Dropship d = new Dropship(200);
		SCV s = new SCV(40);
		
		//�׽�Ʈ
		Marine m = new Marine(30);
		
		s.repair(t);
		s.repair(d);
		//s.repair(m); ĳ���� �� ���� �Ұ�
		//s.repair(m);----------- Ȯ��

	
	
	}

}
