package com.java.polymorphism2; //1006_���,�������̽� ������ ���� ���α׷�

public class Tv extends Product {
	
	//�θ������ ȣ��κ�
	Tv(){
		super(100);
	}	
	
	//source - override methods
	@Override
	public String toString() {
		return "tV";
	}

	
}
