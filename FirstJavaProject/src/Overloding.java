
public class Overloding { //0929-2 overloding : 다형성
	//오버로딩 : 메소드는 정의시 사용하는 방법
	//특징 : 1. 메소드의 이름을 동일하게 사용한다. 
	//		2. 단 매개변수의 타입 또는 갯수는 달라야한다.
	//		3. 리턴타입과는 무관함
	//		4. 객체의 다형성을 구현한 형식
	
	
	void add(){		
	}
		
	void add(int x){ //매개변수의 유무
	}
	
	void add(long l){ //타입의 차이	
	}	
	
	void add(int x, int y){ //갯수의 차이
	}
	
	void add(int x, long i){
	}
	
	void add(long x, int y){ //위치의 차이
	}	
	
//	int add() { //리턴타입이 void, int로 다르지만 오버로딩 불가능. 
//	}
	
	//오버로딩 대표적 함수 : print함수. 매번 다른 타입을 출력하려면 각 다른 이름의 print 함수가 있어야하는데, 그럼 함수 이름 기억하기도 어려움
	
	
	
	
	
}
