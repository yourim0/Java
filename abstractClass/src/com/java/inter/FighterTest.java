package com.java.inter;//1006-3 �������̽��� ����� ������

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
	//	Moveable m = new Fighter(); //��ĳ����
	//	Attackable aa = f; //�ڽ�->�θ�Ÿ�� ��ĳ����
	//	Moveable m = new Moveable(); 	//1. ������ �Ұ�
		
		if(f instanceof Unit) { //unitŸ���� f�� �������� //���� instanceof Ŭ������ or �������̽� 
			System.out.println("Unit�� ���� Ŭ�����̴�.");
		}
		if(f instanceof Fightable) {
			System.out.println("Fightable�� ���� Ŭ�����̴�.");
		}
		if(f instanceof Moveable) {
			System.out.println("Moveable�� ���� Ŭ�����̴�.");
		}
		
	}

}
