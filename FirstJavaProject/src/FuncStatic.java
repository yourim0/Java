
public class FuncStatic { //0929-1 static method (��ϳ� ����,�޼ҵ� : ���)
	int iv;
	static int cv;
	
	
	//��� �޼ҵ�: 1) �ν��Ͻ� �޼ҵ� 
	//			- �ν��Ͻ� ����, Ŭ���� ���� ��� ��� ���� 
	//			- �ν��Ͻ� �޼ҵ�, Ŭ���� �޼ҵ� ��� ��� ����
	//			2) Ŭ����(static) �޼ҵ� :��ü ���� ���� ��밡��(static ������ ����)
	//			- Ŭ���� ����, Ŭ���� �޼ҵ常 ��밡��
	
	
	void instanceMethod() { //�޼ҵ� �޸� �Ҵ� �������� static ������ cv ������ �� ���� 
							//�ν��Ͻ� ������ �����ؾ� �޸� �Ҵ��� ��. 
		System.out.println("instanceMethod() call");
		iv = 10; //������ ���ÿ� �Ҵ�
		cv = 20; //�޼ҵ� �Ҵ� �� �̹� �Ǿ�����
		//�ڽ��� Ŭ������ ���� �� ������ �ʿ信 ���� ������ �� �� ����
	
		System.out.println("iv = "+ iv);
		System.out.println("cv = "+ cv);
		
		//�Լ� ȣ��: instance �޼ҵ尡 �޸� �Ҵ�Ǳ� �� static �޼ҵ�� �̹� �Ǿ��ֱ� ������ ȣ�� ��� �����ϴ�.
		staticMethod();
	
	}
	
	
	//*************static method���� instance ���� ����� �� ����
	static void staticMethod() { //�պκп� static �����ָ� ��
		System.out.println("staticMethod() call");


		
		//iv = 30; //
		cv = 40;//��ü ���� �� �޸� �Ҵ�
		
		System.out.println("cv = "+cv);
		
		//�Լ� ȣ��: instance �޼ҵ��� �޸� �Ҵ� ������ �ٸ��� ������ ȣ�� ��� �Ұ���
		//instanceMethod();
		
	//******************* �����°� �ƴ϶� �����ڰ� ��� �ȵǴ°�. ���� class���� �̷������� �Ⱦ��� ������.
//		FuncStatic st = new FuncStatic();
//		st.instanceMethod();
	}
	

	
	//�������� �޼ҵ���� �ν��Ͻ��żҵ�
	//main �޼ҵ��static. DataTest.java�� copy �޼ҵ嵵 static �̿��߸� ȣ��, ����� ����. 
}
