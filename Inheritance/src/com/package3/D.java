package com.package3;
//c�� default �ϱ� d ���� ��밡��, 
public class D {
	C c = new C(10);
	//E e = new E(20); // error : ���� ��Ű������ �������� private �̱� ������ 
	F f = new F(30);

	
	void printD() {
		System.out.println(c.c);
		f.printF(); //D,F�� ���� ��Ű���ϱ� �������ؼ� ����� �� ����
		f.f = 30;
	}
}
