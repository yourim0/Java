//0930  ����---2
public class Account { //����
	//���尳�� �ʿ� ����
	String ano;
	String owner;
	int balance;
	double rate;
	//��ݰ��ɾ�
	int amount;
	
	
	//source-generate constructor in filed - ������ �ڵ�����
	public Account(String ano, String owner, int balance, double rate) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}
	
//�޼ҵ�- ���� �б�(���� �� ȣ��) / ����(����)
	
	String getAno() {
		return ano;
	}
	
	void setAno(String ano) {
		this.ano = ano;
	}
	
	String getOwner() {
		return owner;
	}
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	
	//���� �ݾ��� ���Ϲ��� �� �ִ� �Լ�
	int getBalance() {
		return balance;
	}
	
	void setBalance(int balance) {
		this.balance = balance;
	}
	
	double getRate() {
		return rate;
	}
	
	void setRate(double rate) {
		this.rate = rate;
	}
	

	int getAmount() {
		return amount;
	}
	
	void setAmount(int amount) {
		this.amount = amount;
	}
	//���� ���� �� �ݾ� �޼ҵ� �߰�----------
	void rateCal() {
		this.amount = balance + (int)(balance * getRate()/100);
	}






}
