package com.package1;
import com.package3.E;

public class A {
	//public class A extends E {

	public int a;

	public A(int a) {
		super();
		//super(10); //E클래스 생성자 자체도 private, 아예 보이지 않음  
		this.a = a;
	}

	public void printA() {
		System.out.println(a);
	}

}
