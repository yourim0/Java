package com.java.inter3;

public class Game {

	public static final int MAX_X = 20; // ��
	public static final int MAX_Y = 10; // ��
	int state; // 0:������, 1:���ӳ�

	private char[][] map = new char[MAX_Y][MAX_X]; // map ����� �� �ε���: 0-9, ��: 0-19

	// GameObject go = new GameObject(); //���հ���
	private GameObject[] m = new GameObject[2]; // ��������� �ֱ� ���� ������2��.
	// ��ӱ����� �ִ� �ڽ��� ��ü�� ����

	// mapǥ�� : �ʱ�ȭ �����
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

	// map��� : ������ Ȱ��
	public Game() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = '-';
			}
		}
		// 1007 ���۽� ��, ����� �����ġ
		// gameobject Ÿ���� bear, fish�� �θ�Ÿ���̱� ������ �迭[2]�� �� �� �ִ�.
		m[0] = new Bear(1, 0, 0); //�Ǿ� distance�� ���� ���� -- fish distancer�� Ȯ�� ----!!!!!!!!!!!!!!!!!!!
		m[1] = new Fish(2, 5, 5);
		state = 0;
		// draw(); //test
	}

	public void run() { // draw() �����ϰ� �ϴ� �޼ҵ�
		System.out.println("** Bear�� Fish �Ա� ������ �����մϴ�. **");
		update(); // �𸣰ھ�
		draw();
		
		while(!doesEnd()) { //�浹�϶����� �ݺ�
			//�ٲ� ��ǥ�� ��� �׷��ְ�
			//pdate(); // �迭�� 'B'�� '@'�� x,y�� �̿��ؼ� �־��ִ� ����
			//draw(); //�迭�� ���� ���
			clear();
			
			for(int i=0; i<m.length;i++){
				m[i].move();
			}		
			update(); // �𸣰ھ�
			draw();
		}
		System.out.println("==================");
		System.out.println("====GAMEOVER=====");
		System.out.println("==================");
	}

	// bear �� fish�� �ʱ�ȭ �� ��ǥ�� ���(��� �׸��� �׷��� �޼ҵ�) //x,y ��ǥ �ٽ� ���
	private void update() {
		for (int i = m.length - 1; i >= 0; i--) { //�� i>=0? =0�ȵ�?
			map[m[i].getY()][m[i].getX()] = m[i].getShape(); // 1->0  y���� ��
		}
		// map[0][0] = m[0].getShape();
		// map[5][5] = m[1].getShape();
		// 1. map[m[0].getX()][m[0].getY()] = m[0].getShape();
		// 2. map[m[1].getX()][m[1].getY()] = m[1].getShape();
		// ->for���� �Ⱦ����� ����� �켱 ��� ���ؼ� 2 ->1 ������ �Ǿ����
	}

	private void clear() {
		for(int i=0; i<m.length;i++) {
			map[m[i].getY()][m[i].getX()] = '-';
		}
	}
	
	private void draw() {// private ���� Ŭ���� ���� ����
		System.out.println(); // ĭ����
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	

	// �浹���� �Ǵ� �޼ҵ�
	private boolean doesEnd() {
		if (m[0].collide(m[1])) { // 0��° - �� .m[1]fish => ���� this, ����Ⱑ getx���̵ȴ�. 
			return true;
		} else {
			return false;
		}
	}
}
