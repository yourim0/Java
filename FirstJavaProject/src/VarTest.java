
public class VarTest { // 변수개념

	public static void main(String[] args) {
		// 숫자, 문자, 문자열, 날짜, 이미지, 동영상 등 메모리에 저장해놓고 사용하는 데이터 유형
		// 변수 : 값을 저장하는 공간, 값 변경 가능
		// 변수의 선언 : 자료형 변수명;
		// 숫자 : 정수(byte, short, int, long), 실수(float, double)
		// 문자 : 문자(char), 문자열(String) 교재p65
		// 논리 : boolean : 참(true), 거짓(false)으로 표현
//		
//		byte b; //-128~127
//		b = 30; //메모리에 저장됨
//		
//		System.out.println(b);
//		
//		b = 20;
//		System.out.println(b);
//		
//		int i; //약 -21억~21억
//		i = 300;
//		
//		System.out.println(i);

//		int x;
//		int y;
//		int z;

//		int x,y,z; //타입이 같으면 나열해서 선언 가능

//		int x=10,y=20,z=30; //변수 선언과 동시에 초기화
//		x=y=z=10;
//		
//		x = 10; //변수 초기화
//		y = 20;
//		z = 30;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);

//		short s = 10; //-32768~32767
//		long l = 10L; //정수 중 젤큼. 접미사는 선택

//		char c; //0~65525 정수형 데이터 타입으로 다룸. ex. b=65 등
//		c = 'a';
//		System.out.println(c);
//		
//		char c2;
//		c2 = '가';
//		System.out.println(c2);

//		char c = 'A'; //65로 인식 
//	 	int i = c;
//		System.out.println(i);
//		System.out.printf("%d\n",i);
//		System.out.printf("%c",c);

//		'A'->65, 'a'->97, '0'-> 48  1씩증가함
//		문자는 ',문자열은 "
		// char c1,c2;
//		c1 = 'A'; //65
//		c2 = 'B'; //66 
//		System.out.println(c1+c2); //'A'+'B'

		String str = "A"; // 한글자는 문자, 문자열 모두 가능
		String str2 = "abc";

		System.out.println(str);
		System.out.println(str2);
		System.out.printf("%s\n", str);
		System.out.printf("%s\n", str2);

		float f = 3.14f; // 실수 형 반드시 접미사 필수f,F 무관
		System.out.println(f); // f는 값이 있는 부분까지만 출력
		System.out.printf("%.3f\n", f); // %f 실수 찍을 수 있음. 형식문자사용시 기본 6글자. f앞에 .숫자로 자리수 지정가능

		double d = 3.14d; // 8byte float 보다 범위 큼. 그냥 double 써도 됌. 접미사 선택, 소문자 상관 x
		System.out.println(d);
		System.out.printf("%f\n", d);

//		자료형의 기본타입 : 보통 정수는 int, 소수 double을 기본형으로 사용
//		10입력 시 int, 3.14입력 시 double로 기본 인식

		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);

		// 변수의 기본값
//		boolean -> false
//		byte,short,int -> 0
//		long -> 0L
//		
//		char ->''//칸 벌림 하면 안됨
//		
//		float -> 0.0f
//		double -> 0.0d
//		
//		String -> null, "" //칸 벌림 상관 무
		// 리터럴 = 변수에 사용되는 값
		
//		%c character.
//		%d decimal (integer) number (base 10)
//		%f floating-point number.
//		%i integer (base 10)
//		%s String.
	}

}
