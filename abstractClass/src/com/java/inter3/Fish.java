package com.java.inter3;

public class Fish extends GameObject {

	public Fish(int distance, int x, int y) {
		super(distance, x, y);
	}

	@Override
	protected void move() {
		int n = (int) (Math.random() * 5);// 0-4난수 생성 
		//0,1나올때만 이동 
		if (n == 0) {
			System.out.println(n);
			x += distance; //+2칸씩 이동하게 임의로 설정

		} else if (n == 1) {
			System.out.println(n);
			x -= distance; // 
			
		}

		if (x < 0) {
			x = 0;
		}
		if (x >= Game.MAX_X) { // Game클래스에서 가져온 static 변수
			x = Game.MAX_X - 1; // 인덱스 번호로 사용되는 값이기 때문
		}

		n = (int) (Math.random() * 5);
		if (n == 0)
			y -= distance;
		else if (n == 1) {
			y -= distance;
		}
		if (y < 0) {
			y = 0;
		}
		if (y >= Game.MAX_Y)
			y = Game.MAX_Y - 1;

	}

	@Override
	protected char getShape() {
		return '@';
	}

}
