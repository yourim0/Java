//1013thread 연습문제 
public class AccountHolderTest {

	public static void main(String[] args) {

		Runnable r = new AccountHolder();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.start();
		th2.start(); //하나의 통장에서 두명이 인출하게 됨
	}

}
