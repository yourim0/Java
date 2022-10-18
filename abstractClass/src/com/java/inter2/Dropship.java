package com.java.inter2;

public class Dropship extends AirUnit implements Repairable {
	
	//부모에서 설정한 생성자 호출-4 (dropship->airunit->unit)
	Dropship(int hp) {
		super(hp);
		hitPoint = MAX_HP; //(초기 받은 hp값을 unit에서 다시 hotpoint 값으로 받아 치료 시 이 변수 값을 수정)
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
}
