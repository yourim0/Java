
public class FunctionTest {//0928-1


	public static void main(String[] args) {

		Func f = new Func(); //참조 변수 선언 생성;
		
//		f.add(); //함수의 호출 : 함수의 실행문장을 실행하도록 함
//		f.add2(10, 20);
//		f.add2(100, 200);//매개변수의 타입과 형식에 맞춰 순서대로 대입
//		System.out.println(f.add3(5, 8));
//		//보통 결과 값을 변수에 담아 사용
//		int sum = f.add3(15, 20); //return 결과 값을 가짐
//		System.out.println(sum);
//		
//		double div = f.div(50.5, 5.6);
//		System.out.println(div);
//		System.out.println(String.format("%.8f", div));
//		
//		int mul = f.mul(30, 6);
//		System.out.println(mul);
//		
//		int sub = f.sub(6, 2);
//		System.out.println(sub);
		
//==========================================================return 값이 없으니 변수에 넣을 필요 없다
//		f.test(10,20);
//		f.test(20, 10);
		
		int result = f.test2(10, 20);
		System.out.println(result);
		
		int result2 = f.test2(20, 10);
		System.out.println(result2);
		
		
		f.call1(); //===============================함수간 호출
		
	}

}
