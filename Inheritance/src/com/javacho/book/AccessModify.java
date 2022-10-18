package com.javacho.book;

import com.package2.B;
import com.package3.E;

public class AccessModify {
	public static void main(String[] args) {
		//1004 상속_접근제어자 
		//private < default < protected < public
		//public : 모든 패키지 경로에 사용가능
		//protected :같은 패키지 또는 상속받는 관계(자식)에 있는 다른 패키지에서 사용가능 ( B-F 클래스 )
		//제외 한 나머지는 상속 자체가 안된다. 
		//default : 같은 패키지에서 사용 가능
		//private : 클래스 내에서만 사용가능  (패키지 포함 외부는 전부 접근 불가)
		
		//클래스 : public, default
		//변수  : public, protected, default, private
		//생성자  : public, protected, default, private
		//메소드  : public, protected, default, private
		//단 지역변수는 사용 불가
		
		//public한 경우에만 패키지와 상관없이 생성과 상속이 가능하다.
//		단 protected는 상속에 의해 다른 패키지에서 사용이 가능하다.
		
		B b = new B(20);
	//	C c = new C(30); error : 생성자의 접근제어자가 default 이기 때문에 
	//	E e = new E(30); error : 생성자의 private 이기 때문에 
	//	F f = new F(50); error : 생성자의 protected 이기 때문에 
	}

}