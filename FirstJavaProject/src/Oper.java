
public class Oper { // 0920
	public static void main(String[] args) {

//		int x = 5;
//		int y = 2;

//		System.out.println(x / y);
//		System.out.println(x % y);

//		final double PI = 3.14;
//		System.out.println(PI);

//		double PI = 2.14; 상수는 변경할 수 없음

//		형변환(자료형 or 데이터 타입)
//		int -> double
//		boolean 은 제외
//		--> 자동형변환
//		byte (1 byte)< short(2byte) < int(4byte)값의기준 < long 8 < float 4 (값을 표현할 수 있는 범위가 더 커서(실수까지가능)long정수 보다 우선) < double 8
		// char 2 (이 세개는 비교가안됨)
//                                            강제형변환<----

//		byte b = 85;
//		int i = b; //자동형변환
//		System.out.println(i);
//		
//		int a = 83;
//		byte k =(byte)i; //강제형변환
//
//		int l = 300;
//		byte q = (byte)l; // 강제형변환 (byte는 300을 담을 수 없음) -> 값의 손실이 발생한다.  

//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i); //.14소실. 강제형 변환은 데이터 소실이 일어날 수 밖에 없음
//		
//		int i = 3;
//		double d = i;
//		System.out.println(d); // 자동형변환 소실 x
//
//		// byte, char, short 비교 안되기 때문에 강제 형변환 (대문자 A의 아스키코드65)
//		byte b = 65;
//		char c = (char) b;
//		System.out.println(c);

		// ------------------------------------------연산의 형변환

//		int 보다 작은 정수형은 연산과정에서 자동으로 int형으로 변환된다
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = b1+b2; //불가 byte+byte => int + int, byte + short => int+int , char + byte => int + int
//	캐스팅 : byte result =(byte)(b1+ b2);	 // (byte)(int + int)

//		type이 다른 두 연산자를 연산할 때는 큰 자료형을 따라간다.
//		int + long -> long+ long
//		int + float -> float + float
//		float + double -> double + double 

//		int x = 5; //결과를 소수점으로 만들고 싶을 때
//		int y = 2;
//		double result = x / y; //몫 2.0
//		double result = x % y; //나머지 1.0 
//	
//		int x = 3;
//		int y = 5;
//		System.out.println(x / y);
//		//double a = x / y;
		// System.out.println(a);

		int q = 3;
		int r = 5;
		double result = (double)q / r;     //3.5 / 5.0 ->0.6 식 
		System.out.println(result);
//		+ -> 산술 연결 부호

		// String + anyType -> 무조건 String
//		String str = "java";
//		double ver = 1.8;
//		String result = str + ver; //"java" + "1.8" 
//		System.out.println(result);

		// 증감 연산자, 변수에만 사용가능
//		int x = 10;
//		++x;
//		System.out.println(x);
//		x++;
//		System.out.println(x);
//		--x;
//		System.out.println(x);
//		x--;
//		System.out.println(x);

//증감 전위연산자
//		int x = 10;
//		int y = 0;
//		y = ++x +10; //x=11,y=21
//		System.out.println("x : "+x+" y :"+y);
//증감 후위연산자		
//		int x = 10;
//		int y = 0;
//		y = x++ +10; //x=11,y=20
//		System.out.println("x : "+x+" y :"+y);

//대입연산자
//		int x = 10;
//		x += 10; //x= x + 10
//		System.out.println(x);
		
//비교연산자 ===> true / false 값으로 표현
//	&& 모두가 true일때만 true 
//	|| 모두가 false 일때만 false 
//  ! 반대로 
//		int x = 10;
//		System.out.println(!(x == 10)); //원래 true인 값을 false로 변환
		
//조건연산자(삼항연산자)
//조건식                		 ? 결과1 : 결과2
//(true or false)  	  true  : false
//	int x = 10;
	//int y = 20;
	//int result = (x > y) ? x : y;
	//System.out.println(result);
	
	//int age = 20;
	//String rs  = (age >= 20) ? "성인입니다" : "미성년입니다";
		
	}

}
