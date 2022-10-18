package com.package5; //1004정리연습
import com.package4.Time; //c+s+o

public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		// t.hour = 10; //private
		// t.min = 10; //protected
		// t.nanosec = 10; //default
		t.sec = 10; //public 
	}

}
