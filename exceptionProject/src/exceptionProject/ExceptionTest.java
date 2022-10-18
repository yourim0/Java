package exceptionProject; //1007 예외처리 정의

public class ExceptionTest {

	public static void main(String[] args) {
		// 코드상에서 개발자가 인지하고 실행시 문제점을 해결하는 것

		/*
		 * try {
		 *  //예외를 발생시키는 구문 샐행문장 
		 *  }catch(예외타입) {
		 *   예외처리 구문 //어떻게 처리할지 
		 *   }
		 */

		// 자바가 만들어 놓은 예외처리
		// 예외처리 클래스 중 가장 상위 클래스
		// Exception

		/*
		 * for(int i=0;i<100;i++) {
		 *  try {
		 *  int r = (int)(Math.random()*10); //0-9
		 * System.out.println(r);
		 *  int result = 10 /r; //문제가 되는 구문 //정수를 0으로 나눌 수 없게 되어있다. 난수r이 0이 나올경우 연산 불가 -> (arithmeticException)예외발생
		 * }catch(ArithmeticException e) { //매개변수의 타입은 오류 명으로 정의
		 * System.out.println("0으로 나누어서 예외를 강제로 처리했습니다.");
		 *  
		 *  }}
		 */

		int[] arr = new int[5]; // 0~4

		
		
		
		/*
		 * try {
		 *  arr[5] = 10; 
		 *  }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Index number 오류"); }
		 */

		
		
		
		/*
		 * try { 
		 * arr[5] = 10; 
		 * }catch(Exception e) { //오류타입 모르면 무조건 Exception입력. 가장 상위오류
		 * System.out.println("Index number 오류"); }
		 */

		// try문은 한개만 작성 가능하지만 catch문은 여러개 작성할 수 있다

		/*
		 * try { arr[5] = 10;
		 *  }catch(ArithmeticException e) {
		 * System.out.println("0으로 나누어서 예외를 강제로 처리했습니다."); //첫번째 오류 처리되면 아래로 안내려간다.
		 * }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Index number 오류"); 
		 * }catch(Exception e) 
		 * { //오류타입 모르면 무조건 Exception입력. 가장 상위오류 
		 * System.out.println("모든예외 처리"); 
		 * }finally { //예외발생 유무와
		 * 상관없이 무조건 한번 실행 System.out.println("예외발생 유무와 상관없이 실행"); }
		 */

		// 강제로 예외를 발생시키는 경우
		// throw new Exception("고의로 예외발생"); 동작자체가 안되고 멈춤

		/*
		 * try { 
		 * throw new Exception("고의로 예외발생"); //발생되었으면 하는 아무 예외
		 *  }catch(Exception e){
		 *  System.out.println(e.getMessage());//예외 변수.getMessage 메소드를 이용 //오류 발생시키는
		 * 원인을 호출한다. e.printStackTrace(); }
		 */

		/*
		 * arr[3] = 10; System.out.println(arr[3]);
		 * 
		 */

		add();

		//catch문 타입
		//throw에서 강제 예외
		//throws에서 예외 선언 
		
		
		
		// throw 메소드 직접 사
		try {
			sub();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	// main() end
	// 함수내에 함수 void add(); 등 오류 발생한다.

	static void add() {
		try {
			throw new Exception("add() 예외발생");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // add() end

	// 예외처리가 안되면 문제가 생긴다. -> 예외선언
	static void sub() throws ArithmeticException { // 예외 선언하기 :알아서 감안해서 써라, 난알려줬으니까 너가 해결해. 사용할main이 예외처리 해야한다.
		throw new ArithmeticException("sub() 예외발생");

	}

}
