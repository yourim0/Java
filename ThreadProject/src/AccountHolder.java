//1013_thread 연습문제 1
public class AccountHolder implements Runnable {

	//통장 관리
	Account acc = new Account();
		
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) { //잔액이 0원이 될 때까지
			int money = (int)(Math.random()* 3 + 1)*100; //100~300원 까지 찾는다.
			acc.withdraw(money); //반복적으로 인출
			System.out.println("balance : "+ acc.getBalance()); //잔고 출력
		}
	}

}
