package com.java.tv;

import com.java.print.Print3D;

//�ٸ���Ű�� ���� ��ó 
//import com.java.print.*;
//import com.java.print.Print; //������ Print Ŭ������
//import com.java.print.Print3D;
//ctrl + shift + o -> import

//1004 ���
public class Tv { //��Ű���� �ٸ���� Ŭ���� ���������ڰ� public���� �Ǿ��־�� ��.
				//�����ھտ� public ���������.
//���踦 ���� �� ��Ӱ� ������ �ϳ��� Ŭ������ ������ �� �ִ�
	
	//�ٸ� ��Ű���� Ŭ���� ��� //�ν��Ͻ� �������, ���԰��� 
	//Print print = new Print(10,30); 
	Print3D print = new Print3D(10,20,30);
	
	
	boolean power;
	int channel;

	void power() {
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}
