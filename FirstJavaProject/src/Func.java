
public class Func { //0928-1 메소드(함수) : 재사용(필요시 언제든지 여러번 호출하여 사용 할 수있다.
	//메소드(함수) : 객체의 기능을 구현
	//형식:
	
	//리턴타입 메소드명([매개변수1, 매개변수2,......]){  //[]부분은 필요하지 않으면 생략가능
	//	실행문장
	//	[return 값]
	//}

//사칙연산 수행 계산기
	
	//리턴타입 : void, 기본자료형, 참조형
	//메소드명 : 낙타표기법
	//매개변수 : int x, double d(기본형), Tv t(참조형)
	//return: 리턴타입이 void가 아닌경우에 사용

	
	void add() { //메소드의 선언부(시그니쳐) //void경우 return값 x
		System.out.println(2+3);//메소드의 구현부 
	}
	
	void add2(int x,int y) { //매개변수 : 함수가 실행되는 시점에 값을 전달
		System.out.println(x + y);
		
	}
	
	//리턴값이 있는 경우 return 값의 타입과 동일하게 정의 해야 한다. 
	int add3(int x, int y) {
		int sum = x+y; //특정 블록 범위 안의 변수 : 지역변수. 따라서 다른메소드에서 같은 이름을 써도 된다.
		return sum; //return 뒤에 돌려받고싶은 값을 기재
	}
	
	int sub(int x, int y) {	 
		int sub = x-y;
		return sub;
	}
	
	int mul(int x, int y) {
		int mul =x*y;
		return mul;
	}
	
	double div(double x, double y) {
		double div = x/y;
		return div;
	}
	//===========================================================void 함수에서의 return은 종료
	
	void test(int x, int y) {
		if(x < y) {
			System.out.println("함수의 종료");
			return; //여기서 return은 함수의 즉시 종료를 의미. (return 값이 따로 없으니 void 함수에서도 가능.)
		}
		
	int result = x + y;
		System.out.println(result);
	}

//	오류발생 : int 형이지만 조건문 안에 있기때문에 실행이 안될 경우가 발생해 else구문까지 작성해야함.	
//	int test2(int x, int y) {
//		if(x>y) {
//			return x;
//		}
//	}
	
// return 값이 많으면 안좋아	
//	int test2(int x, int y) {
//	if(x>y) {
//		return x;
//	}else {
//		return y;
//	}
//}
	
	int test2(int x, int y) {
		
		int result;
		
		if(x > y) {
			result = x;
		}else {
			result = y;
		}return result;
	}
	
	//=================================함수간 호출
	void call1() {
		System.out.println("Call1");
		call2();
	}
	
	void call2() {
		System.out.println("Call2");
		call3();
	}
	
	void call3() {
		System.out.println("Call3");
		
	}
	
}
