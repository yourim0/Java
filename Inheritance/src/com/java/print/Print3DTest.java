package com.java.print;

public class Print3DTest {
	public static void main(String[] args) {
//	Print3D p3 = new Print3D(); //Print3D() -> Print() -> Object() ������ ȣ�� ������ �ݴ뱸��
//		
//	p3.x = 10;
//	p3.y =20;
//	p3.z = 30;
	
//	String point = p3.getLocation();
//	System.out.println(point);
		
	//��������� �����ڸ� ȣ��

		//Print3D p3 = new Print3D(); //Print3D �⺻�����ڸ� ���ݱ� ������ ���� �־������
		Print3D p3 = new Print3D(10,20,30);
		String point = p3.getLocation();
		System.out.println(point);
}
}