import java.util.Scanner;

public class BankAppTest { //0930 연습---2

	public static void main(String[] args) {

		// 사용자에서 공급자 기능이용 => 생성
		BankApp ba = new BankApp();
		Scanner sc = new Scanner(System.in);

		// 인트로 화면
		System.out.println("=========================");
		System.out.println("=     은행 업무 관리 시스템     =");
		System.out.println("=========================");
	
		// 종료 시점 모를 땐 while
		while (true) {
			ba.info();
			int choice = sc.nextInt();

			if (choice == 1) {
				ba.createAccount();
			} else if (choice == 2) {
				ba.accountList();
			}else if (choice == 3) {
				ba.deposit();
			}else if(choice == 4) {
				ba.withdraw();
			}else if(choice == 5) {
				break;
			}
		}
		System.out.println("업무를 종료합니다.");
	}

}
