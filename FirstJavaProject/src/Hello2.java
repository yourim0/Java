
public class Hello2 {  //class명 자동 생성

	public static void main(String[] args) { //main class
		System.out.print("Hello World!!2");//print 출력함수 
		System.out.print("Hi~~~");//실행문은 항상 ;로 끝
		
		System.out.println(); //단순히 줄바꿈만 하고 싶을 때
		
		System.out.println("Hello World!!2"); //줄바꿈해서 출력하고 싶을 땐 println (line new)
		System.out.println("Hi~~~");
	
	
		//System.out.printf(format, args); //앞에 지정된 출력형식으로 뒷 값이 출력
		System.out.printf("%d\n", 10); //숫자형식
		System.out.printf("%d\n", 20);//줄바꿈 System.out.printf("%d\n", 10); 
		System.out.printf("제 나이는 %d살 입니다.\n", 20);
		//System.out.printf("%s", args); //string 문자열형식
		System.out.printf("%s", "안녕하세요");
		
		System.out.println("자동완성"); //sysout 입력 후 ctrl+space하면 자동완성
	
	}
}
