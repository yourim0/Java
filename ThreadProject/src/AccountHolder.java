//1013_thread �������� 1
public class AccountHolder implements Runnable {

	//���� ����
	Account acc = new Account();
		
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) { //�ܾ��� 0���� �� ������
			int money = (int)(Math.random()* 3 + 1)*100; //100~300�� ���� ã�´�.
			acc.withdraw(money); //�ݺ������� ����
			System.out.println("balance : "+ acc.getBalance()); //�ܰ� ���
		}
	}

}
