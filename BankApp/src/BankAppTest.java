import java.util.Scanner;

public class BankAppTest { //0930 ����---2

	public static void main(String[] args) {

		// ����ڿ��� ������ ����̿� => ����
		BankApp ba = new BankApp();
		Scanner sc = new Scanner(System.in);

		// ��Ʈ�� ȭ��
		System.out.println("=========================");
		System.out.println("=     ���� ���� ���� �ý���     =");
		System.out.println("=========================");
	
		// ���� ���� �� �� while
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
		System.out.println("������ �����մϴ�.");
	}

}
