package exceptionProject;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) { //1007��������� ����ó�� ó����� ���� -2
		

		String id;
		int password;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id �Է� : ");
		id = sc.next();
		System.out.println("password �Է� : ");
		password = sc.nextInt();		
		
		if(!id.equals("tis")) { //���ڿ� �񱳴� .equals()��� (==, != �� ���ڿ� ��ü�� ���ϴ°��� �ƴϴ�. 
			//����ó��
			//���̵� ����ġ �մϴ�.
			try {
				throw new LoginIdException("id�� ����ġ�մϴ�.");//e.getmessage���� ��� 
			} catch(LoginIdException e) {
				//e.printStackTrace();//���� ��� �˷���
				System.out.println("id �ٽ� �Է��ϼ��� ");
			}	
		
		}
		
		if(password != 1234) {
			//����ó�� 
			//����� ����ġ �մϴ�.
			try {
				throw new LoginPwException("pw�� ����ġ�մϴ�."); //e.getmessage���� ��� 
			} catch(LoginPwException e) {
			//	e.printStackTrace();
				System.out.println("pw �ٽ� �Է��ϼ��� ");
			}	
		
		}
		
		 if(id.equals("tis") && password ==1234) {
			 System.out.println("�α��� ����~!!!");
		 }
		
	}

}
