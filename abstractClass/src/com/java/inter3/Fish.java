package com.java.inter3;

public class Fish extends GameObject {

	public Fish(int distance, int x, int y) {
		super(distance, x, y);
	}

	@Override
	protected void move() {
		int n = (int) (Math.random() * 5);// 0-4���� ���� 
		//0,1���ö��� �̵� 
		if (n == 0) {
			System.out.println(n);
			x += distance; //+2ĭ�� �̵��ϰ� ���Ƿ� ����

		} else if (n == 1) {
			System.out.println(n);
			x -= distance; // 
			
		}

		if (x < 0) {
			x = 0;
		}
		if (x >= Game.MAX_X) { // GameŬ�������� ������ static ����
			x = Game.MAX_X - 1; // �ε��� ��ȣ�� ���Ǵ� ���̱� ����
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
