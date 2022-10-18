package com.java.polymorphism2;

public class BuyerTest {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio au = new Audio();
		SmartPhone sp = new SmartPhone();
	
		Buyer buyer = new Buyer();
		buyer.buy(tv);
		buyer.buy(com);
		buyer.buy(au);
		buyer.buy(sp);
	
		System.out.println("잔액:" + buyer.money);
		System.out.println("포인트:" + buyer.bonusPoint);
	
	}
	

}
