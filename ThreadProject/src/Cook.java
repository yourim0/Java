//1013thread �������� 2 (notify-wait)

public class Cook implements Runnable {

	private Table table;

	public Cook(Table table) {
		super();
		this.table = table;

	}

	@Override
	public void run() {
		while (true) {
			int idx = (int) (Math.random() * table.dishName());// 0-2������ ���� ����
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(10); // 0.01�ʴ����� �����.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
