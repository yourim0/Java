package com.java.polymorphism; //1005-3 ������

public class Car {
	String color; // ��Ű���� ������ default ���� ��밡��.
	int door;

	void driver() {
		System.out.println("drive gogo");
	}

	void stop() {
		System.out.println("stop");
	}

	// �Ű����� Car Ÿ������ ����
	// Car -> Car, FireEngine, Ambulance �������� ���� ���� �� �ִ� Ÿ��
	void doWork(Car c) {//�Ű������� Ȱ���� ��ü�� ����
		// Car Ÿ������ ��ȯ�Ǵ� siren �̳� water ����
		// instanceof ---4 ��ü�� Ÿ���� Ȯ��
		// if(�������� instanceof Ŭ�����̸�(�˰����Ÿ��))
		if (c instanceof FireEngine) {
			FireEngine fe = (FireEngine) c;
			// water ��� ���ؼ� fireengine Ÿ������ ���� ����ȯ�� ���ش�. ĳ����
			fe.water();
		} else if (c instanceof Ambulance) {
			Ambulance ab = (Ambulance) c;
			ab.siren();
		}
	}
}
