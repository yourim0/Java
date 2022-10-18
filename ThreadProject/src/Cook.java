//1013thread 연습문제 2 (notify-wait)

public class Cook implements Runnable {

	private Table table;

	public Cook(Table table) {
		super();
		this.table = table;

	}

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishName());// 0-2까지의 난수 생성
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(10); // 0.01초단위로 만든다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
