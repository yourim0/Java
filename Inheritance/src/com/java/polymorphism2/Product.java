package com.java.polymorphism2; //1005-5 ������ ���� ���α׷�

public class Product { // �ڽ� Ŭ���� ��ΰ� �ʿ��� ���� �Ӽ�
	int price;
	int bonusPoint;

	// �ڽĿ��� �� �� �ִ� �޼ҵ� or �������̵�

	// ������
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); //10%�� ����Ʈ�� ó�� 
	}

}
