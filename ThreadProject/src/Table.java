import java.util.ArrayList;

//1013thread �������� 2 (notify-wait : �ݵ�� ����ȭ�� ���� �� �޼ҵ忡���� �� �� �ִ�. )
public class Table {
	String[] dishNames = { "donut", "donut", "burger" }; // �丮�簡 �� ���
	final int MAX_FOOD = 6; // ���̻� ������ ���ϰ� ����� ����?

	private ArrayList<String> dishes = new ArrayList<String>(); // ���ÿ���

	// ���ÿ� ���������� ��� ���ÿ� �߰� �ϴ� �޼���
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) { //true���� �ݺ�
			String name = Thread.currentThread().getName();
			System.out.println(name + "waiting");
			//6���� �� ����� wait
			
			try {
				wait();//�丮�� run �޼ҵ� ������ϰ�. ���ܼ��� �Ǿ��ֱ� ������ try catch �آa���Ѵ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dishes.add(dish);
		notify();//****�� ������ٰ� �ٽ� ������ �˷���  
		System.out.println("Dished : " + dishes.toString()); //���������� ���̳���
	}//while�� ���� 

	// ���� noti�� ���־�� ������ ���·� �� �� �ִ�.
	// ������ �ٸ����� ���� �޼ҵ�
	public synchronized void remove(String dishName) {
		String name = Thread.currentThread().getName();
		
		//������ ä���� ���� �� �н�
		while(dishes.size() == 0) { //�丮�翡�� ���ĸ�������� ����.
			System.out.println(name + " is wating");
		
			try {
				wait();//���ܼ��� �Ǿ��ֱ� ������ try catch �آa���Ѵ�
				Thread.sleep(500); //0.5�ʰ� ������ ������ �ִ� (�丮�� ���� �ð��� �ִ� ��)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//������ ä���� ���� �� ���� 
		while(true) {
			for(int i=0;i<dishes.size();i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i); //���� �� �ִ°� ������ �Ծ� 
					notify(); //���� 6���� �� �Ա���� ��ٸ��� ���� �ƴ�. �Ծ��ٰ� ä���� �丮������ ���ض�**** 
					return; //cooker�� wait���¸� �˷��ٰŰ�, �ƴϸ� ���ô��� �� 
				}
			}
			
			try { //�����µ� ���� ���� �� ����. ���Ӹ� 6���̰ų� ���� ���� �� �ִ°� ������??
				System.out.println(name + "is waiting");
				wait();
				Thread.sleep(500); //0.5�ʰ� ������ ������ �ִ� (�丮�� ���� �ð��� �ִ� ��)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	// ���� �迭�� ũ�� ��ȯ�޼���(����� ����)
	public int dishName() {
		return dishNames.length;
	}

}
