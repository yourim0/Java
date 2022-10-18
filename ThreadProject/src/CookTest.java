//1013thread 연습문제 2 (notify-wait : 반드시 동기화가 정의 된 메소드에서만 쓸 수 있다. )
public class CookTest {

	public static void main(String[] args) {
		Table table = new Table();
		
		new Thread(new Cook(table),"Cook1").start();
		new Thread(new Customer(table,"donut"),"Cus1").start();
		new Thread(new Customer(table,"burger"),"Cus2").start();
		
		try {
			Thread.sleep(2000); //2초동안만 동작되도록 설정
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}

}
