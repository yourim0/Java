package com.java.inter3;

public class Game {

	public static final int MAX_X = 20; // 열
	public static final int MAX_Y = 10; // 행
	int state; // 0:게임중, 1:게임끝

	private char[][] map = new char[MAX_Y][MAX_X]; // map 만들기 행 인덱스: 0-9, 열: 0-19

	// GameObject go = new GameObject(); //집합관계
	private GameObject[] m = new GameObject[2]; // 곰과물고기 넣기 위해 사이즈2로.
	// 상속구조에 있는 자식의 객체를 보관

	// map표현 : 초기화 블럭사용
//	{
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[i].length; j++) {
//				map[i][j] = '-';
//			}
//		}
//
//	}

	{
		System.out.println("==================");
		System.out.println("====GAMESTART=====");
		System.out.println("==================");
	}

	// map출력 : 생성자 활용
	public Game() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = '-';
			}
		}
		// 1007 시작시 곰, 물고기 출력위치
		// gameobject 타입은 bear, fish의 부모타입이기 때문에 배열[2]에 들어갈 수 있다.
		m[0] = new Bear(1, 0, 0); //맨앞 distance값 쓰지 않음 -- fish distancer값 확인 ----!!!!!!!!!!!!!!!!!!!
		m[1] = new Fish(2, 5, 5);
		state = 0;
		// draw(); //test
	}

	public void run() { // draw() 동작하게 하는 메소드
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
		update(); // 모르겠어
		draw();
		
		while(!doesEnd()) { //충돌일때까지 반복
			//바뀐 좌표로 계속 그려주게
			//pdate(); // 배열에 'B'와 '@'를 x,y를 이용해서 넣어주는 역할
			//draw(); //배열의 값을 출력
			clear();
			
			for(int i=0; i<m.length;i++){
				m[i].move();
			}		
			update(); // 모르겠어
			draw();
		}
		System.out.println("==================");
		System.out.println("====GAMEOVER=====");
		System.out.println("==================");
	}

	// bear 와 fish의 초기화 된 좌표를 출력(계속 그림을 그려줄 메소드) //x,y 좌표 다시 출력
	private void update() {
		for (int i = m.length - 1; i >= 0; i--) { //왜 i>=0? =0안돼?
			map[m[i].getY()][m[i].getX()] = m[i].getShape(); // 1->0  y값이 행
		}
		// map[0][0] = m[0].getShape();
		// map[5][5] = m[1].getShape();
		// 1. map[m[0].getX()][m[0].getY()] = m[0].getShape();
		// 2. map[m[1].getX()][m[1].getY()] = m[1].getShape();
		// ->for문을 안쓰더라도 물고기 우선 출력 위해서 2 ->1 순으로 되어야함
	}

	private void clear() {
		for(int i=0; i<m.length;i++) {
			map[m[i].getY()][m[i].getX()] = '-';
		}
	}
	
	private void draw() {// private 같은 클래스 접근 가능
		System.out.println(); // 칸띄우기
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	

	// 충돌여부 판단 메소드
	private boolean doesEnd() {
		if (m[0].collide(m[1])) { // 0번째 - 곰 .m[1]fish => 곰이 this, 물고기가 getx값이된다. 
			return true;
		} else {
			return false;
		}
	}
}
