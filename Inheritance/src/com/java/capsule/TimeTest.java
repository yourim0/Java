package com.java.capsule;//1005상속-1 private(정보은닉)

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//Time t = new Time(3) //final double PI 생성자		
		//t.hour = 59;// private으로 사용 불가하게 됨
		t.setHour(48);//시간(int) 기본값 0~23
		System.out.println(t.getHour());
	}
}
