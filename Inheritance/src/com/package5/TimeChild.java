package com.package5; //1004��������

import com.package4.Time;

public class TimeChild extends Time {
	void printAll() {
		//System.out.println(hour); //����� �ȵ����ϱ� �� �� ����
		System.out.println(min); //protected�� ��ӹ����� ��밡��.��������� �Ұ�(TimeTest)
		//System.out.println(nanosec); //default ��ӺҰ�
		System.out.println(sec); //public�̴ϱ� �ٻ�밡��
	}
	
	
}
