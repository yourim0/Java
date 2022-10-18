
public class MemberInit {  //0929 ----8 초기화 블럭
	//멤버변수 초기화
	//자동초기화(변수 타입에 맞는 초깃값으로 자동 초기화) - 명시적초기화(=선언과 동시에 초기화) - 생성자에 의한 초기화  - 초기화 방법
	//초기화 블록이란 클래스 필드의 초기화만을 담당하는 중괄호({})로 둘러싸인 블록을 의미합니다.
	//1. 클래스 변수 : 기본값 → 명시적 초기화 → 클래스 초기화 블록
//2. 인스턴스 변수 : 기본값 → 명시적 초기화 → 인스턴스 초기화 블록 → 생성자
	
	
	int x;
	int y;
	static int cv = 100;
	static int count = 10;
	
	{ //인스턴스 초기화 블럭 : 객체가 생성될 때마다 호출 
		x = 10;
		y = 20;
		System.out.println("인스턴스 초기화 블럭"+x+","+y);
	}
	

	
	static { //static 초기화 블럭 : 객체 생성시 딱 한번만 호출
		count = 1000;
		System.out.println("static 초기화 블럭"+cv+","+count);
	}
	
	
	
	
	MemberInit(int x, int y){ //static 변수 안돼? 대상이아니야?

		this.x = x;
		this.y = y;
		System.out.println("생성자의 호출"+x+","+y);
		
	}
	
}
