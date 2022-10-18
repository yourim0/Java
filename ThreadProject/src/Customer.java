//1013thread 연습문제 2 (notify-wait)

public class Customer implements Runnable {

	private Table table;
	private String food;

	// lombok 바꾸기
	public Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}

	@Override // 먹는역할
	public void run() {
		while(true) {
			try {
				Thread.sleep(100); // 0.1초단위로 만든다.

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName(); //암기
			table.remove(food);
			System.out.println(name +" ate" + food);
			
		}
	}

}
