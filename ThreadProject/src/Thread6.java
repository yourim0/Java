
public class Thread6 implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()); //�������� �̸��� ����Ѵ�
			try {
				Thread.sleep(1000); //���ʰ������� ����(1�ʵ� ��������°� ���� �Ǳ⶧���� ��Ȯ�� 1�ʴ� �ƴҼ�����)
			}catch(InterruptedException e) { //sleep �޼ҵ忡 ���ܼ���Ǿ�����
				e.printStackTrace();
			}
		
		}
	}

}
