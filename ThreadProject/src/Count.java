//1013thread ���1
public class Count extends Thread {  //�ڹٰ� ����� ���� Thread Ŭ����
//�ڹٸ� �̿��� Thread Ŭ������ ��ӹް�
// run �޼ҵ� �ȿ� ���๮�� ������ thread Ŭ������ �ȴ�.
	
	@Override
	public void run() { //ThreadŬ������ �ݵ�� run�޼ҵ尡 �ʿ���
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1�ʿ� �ѹ��� �����ϵ��� ���� :�������� ���� 
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}

	//�������� ���� :1 sleep : �ڵ� timeout,2. wait notify()�� ���� �ٽ� ��������·� ���� �� �־�� �Ѵ�. 3. suspend() - resume(�߾��� x)
	//notify �� resume���̴� ����ȭ �����̴�
}
