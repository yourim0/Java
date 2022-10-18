package com.java.inter3;

import java.util.Scanner;

public class Bear extends GameObject {
	
	private Scanner sc;
	
	public Bear(int distance, int x, int y) {
		super(distance, x, y);
		sc = new Scanner(System.in);
		}
	
	
	//추상메소드 오버라이딩
	@Override 
	public void move() {
		System.out.println("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >>") ;
		char c;
		c = sc.next().charAt(0); // 하나의 문자만 받는 함수
		if(c == 'a') {
			x--; //왼쪽은 x 감소
			if(x < 0) { //화면 밖으로 나간다.
				x = 0; //제자리
			}
		}else if((c == 'f')) {
			x++;
			if(x >= Game.MAX_X) {//상수 선언 예정 
				x = Game.MAX_X -1; 
			}
		}else if ((c == 'd')) {
			y--;
			if(y < 0) {
				y = 0; //더이상 이동이 발생하지 않도록
			}
		}else if((c == 's')) {
			y++;
			if(y >= Game.MAX_Y) { //0-9
				y = Game.MAX_Y -1;
			}
		}
	}

	@Override //접근제어자 수정은 같거나커야함
	public char getShape() { //곰 모양가져올 것
		return 'B';
	}
	
	

}
