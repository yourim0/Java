//1013thread �������� 2 (notify-wait)

public class Customer implements Runnable {

	private Table table;
	private String food;

	// lombok �ٲٱ�
	public Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}

	@Override // �Դ¿���
	public void run() {
		while(true) {
			try {
				Thread.sleep(100); // 0.1�ʴ����� �����.

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName(); //�ϱ�
			table.remove(food);
			System.out.println(name +" ate" + food);
			
		}
	}

}
