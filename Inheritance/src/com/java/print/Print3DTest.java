package com.java.print;

public class Print3DTest {
	public static void main(String[] args) {
//	Print3D p3 = new Print3D(); //Print3D() -> Print() -> Object() 순서로 호출 생성은 반대구조
//		
//	p3.x = 10;
//	p3.y =20;
//	p3.z = 30;
	
//	String point = p3.getLocation();
//	System.out.println(point);
		
	//명시적으로 생성자를 호출

		//Print3D p3 = new Print3D(); //Print3D 기본생성자를 없앴기 때문에 값을 넣어줘야함
		Print3D p3 = new Print3D(10,20,30);
		String point = p3.getLocation();
		System.out.println(point);
}
}