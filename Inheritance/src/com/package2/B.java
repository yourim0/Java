package com.package2;
import com.package3.F;

//public class B {
public class B extends F{ // 패키지가 다른 경우 사용할 수 없지만 상속받은 구조에서는 사용할 수 있다.

	public int b;

	public B(int b) {
		//super(); // Object 상속
		super(10);
		this.b = b;
	}

	public void printB() {
		System.out.println(b);
		System.out.println(f);
		printF();
	}

}
