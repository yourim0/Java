//0930  연습---2
public class Account { //통장
	//통장개설 필요 내용
	String ano;
	String owner;
	int balance;
	double rate;
	//출금가능액
	int amount;
	
	
	//source-generate constructor in filed - 생성자 자동생성
	public Account(String ano, String owner, int balance, double rate) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}
	
//메소드- 변수 읽기(기존 값 호출) / 쓰기(수정)
	
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
	
	//기존 금액을 리턴받을 수 있는 함수
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
	//이자 포함 총 금액 메소드 추가----------
	void rateCal() {
		this.amount = balance + (int)(balance * getRate()/100);
	}






}
