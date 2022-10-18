package stringProject; //1007 string class 차이 

public class StringTest {
	public static void main(String[] args) {
		
		//charAt()
		//subString()
		//indexOf()
		//equals()
		//valueOf()
		
		
		
	
	//	1.String str1 = "abc"; //String은 같은 문자열을 받으면 다른 주소값이 아닌 동일한 주소값을 저장한다. 
		String str2 = "abc";
		
		//원래 사용 방식
		String str3 = new String("abc"); //다른 값을 받아야 할때엔 이렇게 생성하나, 잘 쓰지 않는다.
		String str4 = new String("abc");
		
		//문자열 비교
	//	str3 == str4 ==> 문자값이 아닌 주소값을 비교하는 것. 
		if(str3 == str4) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		} //다르다 출력
		
		// 실제 문자열 비교 
		if(str3.equals(str4)) { //"abc".equals("abc") 문자 직접비교도 가능하다.
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		} //같다 출력
	
		
				
				/*
		System.out.println(str1.hashCode());
		
	
		String str1 = "abc"; 
		String str2 = "def";
		
		str1 = str1 + str2; //"abcdef" --> 주소값이 수정된 내용의 str1을 가리키는것이 아니라 새로운 메모리에 할당되어 주소값이 변한다. 
		*/
		
		
		
		/*		String fileName = "Hello.java";//문자마다 인덱스 번호가 존재함. 
		
		//길이와 상관없이 추출하고 싶을 때
		//특정 문자를 포함하는 위치를 반환(인덱스) : .indexOf()
		int index = fileName.indexOf('.');
		System.out.println(fileName.substring(0,index));
		System.out.println(fileName.substring(index + 1));*/
		
	
		
						
		//문자열 자르기 : charAt()
/*		char a = fileName.charAt(2);
		System.out.println(a);
		//전체 문자 한 글자씩 출력
		for(int i=0;i<fileName.length();i++) {
			System.out.println(fileName.charAt(i));
			}
			*/
		
		//원하는 부분에서 문자열 자르기  : substring
		/*		String str = fileName.substring(0,5); //시작인덱스, 끝인덱스
		System.out.println(str); //Hello
		String str2 = fileName.substring(6,10); 
		System.out.println(str2);
		String str3 = fileName.substring(3); //끝까지 출력하고 싶으면 시작 인덱스만 쓰면된다. 
		System.out.println(str3); */
		
		//숫자를 문자로 변환시켜준다. : valueOf
		int x = 10;	
		String str = String.valueOf(x); 
			
			
		
		//String buffer클래스 - string클래스와 거의 비슷하다
	//새로운 메모리 할당이 아닌 기존메모리에 저장해서 메모리 퍼포먼스가 훨씬 좋다
		
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb);
		sb.append("def");
		System.out.println(sb);
		
		
		
		
	}
}
