import javax.swing.JOptionPane;

public class TreadTest { //1013thread 

	public static void main(String[] args) {
		//���α׷� -> ���μ��� (����) ->������(���� ���۵��� ���ÿ� ���ư��� �� : ��Ƽ������) -> ��Ƽ������ ���� : ��Ƽ�½�ũ
		//��� ���α׷��� �⺻������ �����尡 ���� (1�� �̻��� �����尡 �ִ�)
		//������ ����� ���
		//1.Thread Ŭ������ ���
		//2.Runnable �������̽��� ��� 
		
		
		//��������???
/*		for(int i = 0;i<10;i++) { //��������
			System.out.println(i);
		}
		
		for(int j=0;j<10;j++) {
			System.out.println(j);
		} */
	
		
		
		//��Ƽ ������ ���
		//�ٸ� ������ Ŭ������ ����
		//thread Ŭ���� ���� ��ӹ��� ��� : 
	/*	Count cnt = new Count();
		cnt.start(); //run �� �ƴ� start��� �޼ҵ带 ȣ���ؾ� ������ ������μ� ������. */
		
		// �������̽� runnable ��ӹ��� ���:
		
		//Count2 cnt2 = new Count2();
		//�θ�Ÿ������ Ÿ�� �����ص� �ȴ�.
		/*			Runnable r  = new Count2();
		Thread cnt2 = new Thread(r);//start�޼ҵ�� threadŬ��������. ThreadŬ���� �������� �Ű������� ������ 
		cnt2.start();  
		
		
	
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է�"); //���� �Է��� �������� ������ �ڵ� ������ �ȵǴ� ���.
		System.out.println("�Է°���" + input + "�Դϴ�.");
	*/
	
		
		/*Threadex5 th = new Threadex5(); //�������
		th.start();
		
		for(int i=0;i<500;i++) { //������� ���� ������ 
			System.out.print("-");
		}*/
	
	
		
		
		//Thread Ŭ���� ��� : Ŭ������ ��������
		//Runnable �������̽� ���: 
		//-2���� ������ ������ ��ģ��. 
		//-Ŭ���� ������ �ٽ��ѹ� ThreadŬ������ �����ڸ� ����ؼ� �ٽ��ѹ� �����Ѵ�. 
		//- ���߻���� �ϴ� ��� ����Ѵ�.
		
		
		//Thread�� ���� 
		//Thread.sleep(1000) ->�������� �Ͻ�����
		//wait() -> �������� �Ͻ����� / notify() -> �����带 ������
		
		
		
		
		
		Runnable r = new Thread6();
		Thread th1 = new Thread(r, "*"); //"�������� �̸�����"
		Thread th2 = new Thread(r,"**");
		Thread th3 = new Thread(r, "***"); //main��������� �� 4���� �����尡 ����. 
		
		th1.start();
		th2.start();
		th3.start(); //������� �ڵ� ������ ���� ���� ������ �������� ���� �ƴϴ�. - start�� stop ��
		//jvm�� ���� �������� ������ ��������
		
		try {
			Thread.sleep(2000); //���� �ڽ��� ȣ���� thread�� ȣ���Ѵ�. (�Ͻ�����)
			//���⼭sleep �� main�Լ����� ȣ���ϴ� ��. main thread -> main �Լ� -> sleep ������ ȣ��
			//th 123�� ������� ����.
			th1.suspend(); //������ �Ͻ����� �޼ҵ�
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();//suspend�Ǿ��ִ� Thread�� ���� �����·� ���� 
			Thread.sleep(3000);
			th2.resume();
			Thread.sleep(3000);
			th1.stop(); //th1�� �������� th2�� ���� stop������ �𸥴�. 
			th2.stop();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//main
		//th1.suspend�� 2�ʵ� ���߰� 
		//th2.suspend�� �ּ� 4�ʵ� ����
		
		
		
		
			
	}	

}
