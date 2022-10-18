package com.java.capsule; //1005_���(private_��������)

public class Time {
	private int hour;
	private int minute; // 0~59 ��������
	private int second;
	
	//1005���-2 (���)final�ǹ�, �ʱ�ȭ
	//final double PI = 3.14; // 1005 2 - ���(�����ڸ� ���� �ʱ�ȭ ����.)
	//final double PI;
	
//	public Time(double pi) {
//		super();
//		PI = pi;
//	}

	// �������� / ĸ��ȭ ���� (getter, setter)
	// getter / setter �޼ҵ带 ���������� ����ñ��� ������ ���������� ����� �� �ֵ��� �ϴ� �� -�ݵ�� public, ������
	// �̷������ ��
	// get �� ���� ù���ڸ� �빮�ڷ� �Ѵٴ°� ��Ģ, public�̿��� �ϸ�, ������ ���� Ÿ������ �ۼ�

	// source - generate getters and setters �ڵ�����
	public int getHour() {
		return hour;
	}

	// ��ȿ�� ����
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) { // ������ �ʴ� ���� �Ѿ���� ��� ���� �ʱ�����
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (hour < 0 || hour > 59) { // ������ �ʴ� ���� �Ѿ���� ��� ���� �ʱ�����
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (hour < 0 || hour > 59) { // ������ �ʴ� ���� �Ѿ���� ��� ���� �ʱ�����
			System.out.println("��ȿ���� ���� ���Դϴ�.");
			return;
		}
		this.second = second;
	}

}
