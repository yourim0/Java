package com.java.capsule; //1005_상속(private_정보은닉)

public class Time {
	private int hour;
	private int minute; // 0~59 논리적오류
	private int second;
	
	//1005상속-2 (상수)final의미, 초기화
	//final double PI = 3.14; // 1005 2 - 상수(생성자를 통한 초기화 가능.)
	//final double PI;
	
//	public Time(double pi) {
//		super();
//		PI = pi;
//	}

	// 정보은닉 / 캡슐화 구현 (getter, setter)
	// getter / setter 메소드를 직접적으로 노출시기진 않지만 간접적으로 사용할 수 있도록 하는 것 -반드시 public, 쌍으로
	// 이루어져야 함
	// get 뒤 변수 첫글자를 대문자로 한다는게 규칙, public이여야 하며, 변수와 같은 타입으로 작성

	// source - generate getters and setters 자동생성
	public int getHour() {
		return hour;
	}

	// 유효성 검증
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) { // 원하지 않는 값이 넘어왔을 경우 넣지 않기위함
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (hour < 0 || hour > 59) { // 원하지 않는 값이 넘어왔을 경우 넣지 않기위함
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (hour < 0 || hour > 59) { // 원하지 않는 값이 넘어왔을 경우 넣지 않기위함
			System.out.println("유효하지 않은 값입니다.");
			return;
		}
		this.second = second;
	}

}
