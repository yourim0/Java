package com.package2;
import com.package3.F;

//public class B {
public class B extends F{ // ��Ű���� �ٸ� ��� ����� �� ������ ��ӹ��� ���������� ����� �� �ִ�.

	public int b;

	public B(int b) {
		//super(); // Object ���
		super(10);
		this.b = b;
	}

	public void printB() {
		System.out.println(b);
		System.out.println(f);
		printF();
	}

}
