package com.java.print;
//1004 상속1-오버라이딩2
public class Print {
	public int x; //외부 패키지에서 사용할 땐 다 public 상태여야함.
	public int y;
	

//원래 기본생성자에는 super가 포함되어있어 상위 클래스(Object 크래스)의 생성자를 호출한다. 	
	//Print(){
	// super();
	// }
	
	public Print(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public String getLocation() {
		return "x : " + x + " y : " + y;
	}
}
