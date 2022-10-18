package com.package3;
//c는 default 니까 d 에서 사용가능, 
public class D {
	C c = new C(10);
	//E e = new E(20); // error : 같은 패키지지만 생성자의 private 이기 때문에 
	F f = new F(30);

	
	void printD() {
		System.out.println(c.c);
		f.printF(); //D,F는 같은 패키지니까 생성만해서 사용할 수 있음
		f.f = 30;
	}
}
