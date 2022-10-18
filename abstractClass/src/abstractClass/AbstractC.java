package abstractClass; //1006-1 abstract

public abstract class AbstractC {
	//추상클래스 
	//1. abstract 제한자를 붙여서 클래스를 선언
	//2. 일반 클래스와 동일하게 멤버를 정의
	//3. 추상 메소드를 정의 (선언부만 존재)
	//4. 생성이 불가
	//5. 반드시 자식 클래스에 상속해야 된다 (상속을 위한 클래스)	
	//6. 자식클래스는 반드시 추상메소드를 오버라이딩 해야한다(=메소드의 구현부를 직접 작성해라)
	//(오버라이딩 강제구현 => 자식입장에서 필수기능이기 때문에 추상메소드를 구현하는 것.)

	int x; //멤버변수
	
	AbstractC(){
		
	}
	
	void method() {
		
	}
	
	abstract void abstractMethod(); //추상메소드 - 선언부가 없음

}
