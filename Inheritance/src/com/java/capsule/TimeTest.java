package com.java.capsule;//1005���-1 private(��������)

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//Time t = new Time(3) //final double PI ������		
		//t.hour = 59;// private���� ��� �Ұ��ϰ� ��
		t.setHour(48);//�ð�(int) �⺻�� 0~23
		System.out.println(t.getHour());
	}
}
