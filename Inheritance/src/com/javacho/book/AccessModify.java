package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModify {
	public static void main(String[] args) {
		//1004 ���_���������� 
		//private < default < protected < public
		//public : ��� ��Ű�� ��ο� ��밡��
		//protected :���� ��Ű�� �Ǵ� ��ӹ޴� ����(�ڽ�)�� �ִ� �ٸ� ��Ű������ ��밡�� ( B-F Ŭ���� )
		//���� �� �������� ��� ��ü�� �ȵȴ�. 
		//default : ���� ��Ű������ ��� ����
		//private : Ŭ���� �������� ��밡��  (��Ű�� ���� �ܺδ� ���� ���� �Ұ�)
		
		//Ŭ���� : public, default
		//����  : public, protected, default, private
		//������  : public, protected, default, private
		//�޼ҵ�  : public, protected, default, private
		//�� ���������� ��� �Ұ�
		
		//public�� ��쿡�� ��Ű���� ������� ������ ����� �����ϴ�.
//		�� protected�� ��ӿ� ���� �ٸ� ��Ű������ ����� �����ϴ�.
		
		B b = new B(20);
	//	C c = new C(30); error : �������� ���������ڰ� default �̱� ������ 
	//	E e = new E(30); error : �������� private �̱� ������ 
	//	F f = new F(50); error : �������� protected �̱� ������ 
	}

}