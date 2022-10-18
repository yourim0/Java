import lombok.Getter;
import lombok.Setter;

//1013thread �������� 1

@Getter
@Setter
public class Account {
	private int balance=1000;
	
	//����ȭ ó�� ��
	//��ݱ��
	/*	public void withdraw(int money) {
	/*	if(balance >= money) { //����ȭ : ������ ���Ѽ� ����ϰ� �Ѵ�.  
			//������� ���θ� ��ٷ����� ����. ���� ������
			//1���� �����ΰ� ���� ���������� ������ �ǵ��� ���� 
			//ThreadŬ������ �ƴϱ� ������ �ڽ��� �ƴ� ȣ���ϴ� �ʿ��� �ɸ� ��
			try {
				Thread.sleep(1000); //th1�� if�� ����ǰ� ����� 1�� ����ϴ� ���� th2�� ���͹����� -�� �߻��Ѵ�. //-> ����ȭ ó���� �ذ����ش�. 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;
		} */
		
	
	
	
	//����ȭ ó�� ��
		public/* synchronized*/ void withdraw(int money) { //1. Ÿ�Ծտ�synchronized �߰� = ��� : Ư�� �޼ҵ带 ������� ���ϰ� �ϴ� �� 
		
			synchronized(this) { //2. 1������ ������ �д�. class��ü�� ����� ��ü�� ���� �ɸ���.
			if(balance >= money) { //����ȭ : ������ ���Ѽ� ����ϰ� �Ѵ�.  
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			balance -= money;
		} // -> Ǯ���ִ� ��ġ
	}
		}
	
}
