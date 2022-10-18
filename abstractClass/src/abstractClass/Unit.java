package abstractClass; //1006-1 abstract

abstract public class Unit { //공통기능 부모 class (=자식입장에서 필수기능이기 때문에 추상메소드를 구현하는 것.)
	int x, y;
	abstract void move(int x, int y); //추상메소드

	void stop() { //일반메소드

	};

}
