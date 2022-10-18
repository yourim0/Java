package com.package5; //1004정리연습

import com.package4.Time;

public class TimeChild extends Time {
	void printAll() {
		//System.out.println(hour); //상속이 안됐으니까 쓸 수 없음
		System.out.println(min); //protected는 상속받으면 사용가능.직접사용은 불가(TimeTest)
		//System.out.println(nanosec); //default 상속불가
		System.out.println(sec); //public이니까 다사용가능
	}
	
	
}
