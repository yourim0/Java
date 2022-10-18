package com.java.tv;

import com.java.print.Print3D;

//다른패키지 사용시 출처 
//import com.java.print.*;
//import com.java.print.Print; //마지막 Print 클래스명
//import com.java.print.Print3D;
//ctrl + shift + o -> import

//1004 상속
public class Tv { //패키지가 다른경우 클래스 접근제한자가 public으로 되어있어야 함.
				//생성자앞에 public 붙혀줘야함.
//관계를 맺을 때 상속과 포함을 하나의 클래스에 적용할 수 있다
	
	//다른 패키지의 클래스 사용 //인스턴스 멤버변수, 포함관계 
	//Print print = new Print(10,30); 
	Print3D print = new Print3D(10,20,30);
	
	
	boolean power;
	int channel;

	void power() {
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}
