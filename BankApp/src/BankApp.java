import java.util.Scanner;

//0930 ����---2
public class BankApp { // ������ ��ɸ� ����

	// account ���� ����
	Account[] acc = new Account[100]; // -----------��׵� �� ������ �������
	// �������� �޾Ƽ� account class�� �Ѱ��ִ� ����
	Scanner sc = new Scanner(System.in);

	// ���� ������ ���� �����ϴ� �޼ҵ�. ��� ������ ����ɶ����� �ݺ����� ����. <�ʱ� ȭ��>
	void info() {
		System.out.println("---------------------------------");
		System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
		System.out.println("---------------------------------");
		System.out.println("���� : ");
	}

	// ���� ���� �޼ҵ�
	void createAccount() {
		System.out.println("----------");
		System.out.println("���� ���� �޴�");
		System.out.println("----------");

		System.out.println("���¹�ȣ : ");
		String ano = sc.next();

		System.out.println("�����ָ� : ");
		String owner = sc.next();

		System.out.println("�ʱ��Աݾ� : ");
		int balance = sc.nextInt();

		System.out.println("������ �Է� : ");
		double rate = sc.nextDouble();
		
		//�ߺ����� Ȯ��
		if(findAccount(ano) != null) {
			System.out.println("�̹� ���°� �����մϴ�.");
			return;
		}
		
		// ���� ���� �Ϸ��ϱ�
		Account account = new Account(ano, owner, balance, rate);
		
		account.rateCal();

		// ������ ���¸� ���� //acc�� �ε����� ���� null���� Ȯ�� �� ����
		for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				acc[i] = account;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}

		}
	}

	// ���� ��� ���� �޼ҵ�
	
	void accountList() {
		System.out.println("-------------");
		System.out.println("���� ��� ���� �޴�");
		System.out.println("-------------");
		
		System.out.println("���¹�ȣ    ������    �Աݾ�    ������    ��ݰ��ɾ�(����)");

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] == null) {
				break;
			}
			System.out.println(acc[i].getAno() + "    " + acc[i].getOwner() + "    " + acc[i].getBalance()+ "    " + acc[i].getRate()+"%   "+acc[i].getAmount());
		}

	}

	// ���� ��� �޼ҵ� //****�ջ�� �ݾ��� ���� �������
	void deposit() {
		System.out.println("----------");
		System.out.println("���� ��� �޴�");
		System.out.println("----------");

		// ������ �� �������� Ȯ��
		System.out.println("���¹�ȣ : ");
		String ano = sc.next();

		System.out.println("���ݾ� : ");
		int balance = sc.nextInt();

		Account account = findAccount(ano);

		// return ������ ���� ��ȸ
		if (account == null) {
			System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
			return; // void �Լ������� return�� �Լ� ��� ���� / break�� �ݺ����� �ش�
		}


		//account.setBalance((account.getBalance() + balance)*(int)(account.getRate())); //���ڰ��ѱݾ�
		// ������ ���� �ݾ׿� �����ּ���
		account.setBalance(account.getBalance() + balance);
		System.out.println("���� ó���� ���������� �Ǿ����ϴ�.");

	}

	// ��ݱ��
	void withdraw() {
		System.out.println("----------");
		System.out.println("��� ��� �޴�");
		System.out.println("----------");

		System.out.println("���¹�ȣ :  ");
		String ano = sc.next();

		System.out.println("��ݾ� : ");
		int balance = sc.nextInt();

		Account account = findAccount(ano); // ������ �ּҸ� ���� ����

		if (account == null) {
			System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
			return;
		}

		if (account.getBalance() < balance) {
			System.out.println("���ݾ��� �����մϴ�");
			return;
		}

		account.setBalance(account.getBalance() - balance);
		System.out.println("��� ó���� ���������� �Ǿ����ϴ�.");

	}

	// ����� ��� : ������ȸ (���� �޼ҵ�� ����)

	Account findAccount(String ano) { // ��ȯ�� Ÿ���� Account �̱� ������ void x
		// �迭�� ����ִ� �ּҰ��� Ÿ���� Account��ü
		Account account = null; // ���������� �ʱ�ȭ�Ͽ� ���

		for (int i = 0; i < acc.length; i++) {
			if (acc[i] != null) { // �ݺ�Ƚ�� �ּ�ȭ
				if (acc[i].ano.equals(ano)) { // ���ڿ� �� �Լ� .equals()
					account = acc[i];
					break;
				}
			}
		}
		return account; // ���� ��ü�� �ּҰ�
	}

}
