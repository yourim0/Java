package com.java.tv;
//1004 상속
//tv, vcr 다 되는 제품 
public class TVCR extends Tv{ //상속

	VCR vcr = new VCR(); //포함
	//어떤 클래스도 상속받지 않은 클래스는 항상 extends Object가 생략되어있다. 
	
}
