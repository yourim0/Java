package com.package1;
import com.package3.E;

public class A {
	//public class A extends E {

	public int a;

	public A(int a) {
		super();
		//super(10); //EŬ���� ������ ��ü�� private, �ƿ� ������ ����  
		this.a = a;
	}

	public void printA() {
		System.out.println(a);
	}

}
