package com.java.inter2;

public class Dropship extends AirUnit implements Repairable {
	
	//�θ𿡼� ������ ������ ȣ��-4 (dropship->airunit->unit)
	Dropship(int hp) {
		super(hp);
		hitPoint = MAX_HP; //(�ʱ� ���� hp���� unit���� �ٽ� hotpoint ������ �޾� ġ�� �� �� ���� ���� ����)
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}
}
