package com.java.inter3;

import java.util.Scanner;

public class Bear extends GameObject {
	
	private Scanner sc;
	
	public Bear(int distance, int x, int y) {
		super(distance, x, y);
		sc = new Scanner(System.in);
		}
	
	
	//�߻�޼ҵ� �������̵�
	@Override 
	public void move() {
		System.out.println("����(a), �Ʒ�(s), ��(d), ������(f) >>") ;
		char c;
		c = sc.next().charAt(0); // �ϳ��� ���ڸ� �޴� �Լ�
		if(c == 'a') {
			x--; //������ x ����
			if(x < 0) { //ȭ�� ������ ������.
				x = 0; //���ڸ�
			}
		}else if((c == 'f')) {
			x++;
			if(x >= Game.MAX_X) {//��� ���� ���� 
				x = Game.MAX_X -1; 
			}
		}else if ((c == 'd')) {
			y--;
			if(y < 0) {
				y = 0; //���̻� �̵��� �߻����� �ʵ���
			}
		}else if((c == 's')) {
			y++;
			if(y >= Game.MAX_Y) { //0-9
				y = Game.MAX_Y -1;
			}
		}
	}

	@Override //���������� ������ ���ų�Ŀ����
	public char getShape() { //�� ��簡���� ��
		return 'B';
	}
	
	

}
