package com.java.polymorphism2;//1005-5 ������ ���� ���α׷� 

//product�� ���԰���:������ ���� ����

//�Ϲ������� ������ Ŭ���������� �ٲ� ������ʿ��� ��ȭ�� ����� ����. 

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) { //tv, computer, audio, smartphone
		if(money < p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			return;
		}

	money -= p.price;
	bonusPoint += p.bonusPoint;
	System.out.println(p+"���ſϷ� "); //���� ������ �����ߴ���
	
	}
	
	//�Ű������� Ȱ���� Ÿ��  (����, �Ű����� �� �پ��� ������� ����Ͽ� ���� ����� ���� �� ����)
//	void buy(Product p) {
//		System.out.println(p.price); //�ܺο��� �̹� ������� ���������� ������
//	}
	///�θ�Ÿ������ ĳ���õǾ� �����⶧���� �ٿ�ĳ���� ���־�� ��
	
	//Tv t = new Tv(); ��������
	//Product p = new Tv(); 
	
	//����� �� �ִ� ��� ������ �Ȱ���
	//Product p = new Tv() //��밡���Ѱ� 2��
	//Tv t = new Tv() //2��
	//t.price �� p.price �����ϴ�
	
	
	
	
	//�������� �̿��� ����
	//�����ε��� �̿��� �Ű������� Ÿ���� �޸��� ���
//	void buy(Computer c) {
//	}
//	void buy(Audio a) {
//	}
	
}
