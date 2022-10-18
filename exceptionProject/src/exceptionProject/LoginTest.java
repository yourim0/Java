package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) { //1007사용자정의 예외처리 처리방식 연습 -2
		

		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id 입력 : ");
		id = sc.next();
		System.out.println("password 입력 : ");
		password = sc.nextInt();		
		
		if(!id.equals("tis")) { //문자열 비교는 .equals()사용 (==, != 는 문자열 자체를 비교하는것이 아니다. 
			//예외처리
			//아이디가 불일치 합니다.
			try {
				throw new LoginIdException("id가 불일치합니다.");//e.getmessage사용시 출력 
			} catch(LoginIdException e) {
				//e.printStackTrace();//오류 경로 알려줌
				System.out.println("id 다시 입력하세요 ");
			}	
		
		}
		
		if(password != 1234) {
			//예외처리 
			//비번이 불일치 합니다.
			try {
				throw new LoginPwException("pw가 불일치합니다."); //e.getmessage사용시 출력 
			} catch(LoginPwException e) {
			//	e.printStackTrace();
				System.out.println("pw 다시 입력하세요 ");
			}	
		
		}
		
		 if(id.equals("tis") && password ==1234) {
			 System.out.println("로그인 성공~!!!");
		 }
		
	}

}
