package com.java.print;
//1004 ���1-�������̵�2
public class Print {
	public int x; //�ܺ� ��Ű������ ����� �� �� public ���¿�����.
	public int y;
	

//���� �⺻�����ڿ��� super�� ���ԵǾ��־� ���� Ŭ����(Object ũ����)�� �����ڸ� ȣ���Ѵ�. 	
	//Print(){
	// super();
	// }
	
	public Print(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public String getLocation() {
		return "x : " + x + " y : " + y;
	}
}
