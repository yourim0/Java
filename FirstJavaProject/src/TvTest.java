
public class TvTest {//0927

		//int sum; //������� : Ŭ���� ���� ����
		
	public static void main(String[] args) { //��ü ������ main Ŭ�������� �Ѵ�.
		//��ϴ����� Ŭ���� �������� ����Ǵ� ���� = ����(���)���� (TvŬ������ ������� �� ����� �� ����)
		
	//	int sum =0; //�������� 
	//	sum += 10; //���� �� ������ �ʱ�ȭ�� �Ǿ��־�� ��.
		
		
//		new Tv(); //�޸𸮷� �Ҵ�Ǿ��� tv�� ���� �������, �Լ��� ù��° �ּҰ��� ����.
		
		//���������� : . 
//		new Tv().power = true; //TvŬ���� �ȿ� �ִ� ������ .�����ڸ� ���� ����
//		new Tv().channel = 10; //new ����ŭ Tv ���� �����Ǵ� ��. 
		//�̷��� �Ǹ� �� �ٸ� Tv�� ��������� ��. 

		 Tv t = new Tv(); //������� Ŭ������ Ÿ������ �����ϰ� ������ ���� : ��������(==�ּҰ�)
		//������ ��ü�� �ּҰ��� ����������
	 	t.power = true; //��������.�޼ҵ�
	 	t.channel = 10;
	 	//System.out.println(t.channel);
	 	t.ChannelDown(); //�޼ҵ� ����
		System.out.println(t.channel);
		
		Tv t2 = new Tv();//��ü�� ������ ������ ���������� ������ �ٸ� �ּҰ��� ������ ����. ���ο� ��ü
		t2.channel = 20;
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t2.ChannelDown();

		//t2 = t : t�� ���������� �ּҰ��� t2�� �ִ� ��� ���� t2�� �޸𸮸� ���� ���־���� : garbage collection
		//ġȯ�Ǵ� ���� : �� ���������� Ÿ���� ������ ��츸 ����
		t2=t; 
		System.out.println(t.channel);
		System.out.println(t2.channel);
		t.ChannelDown();
		System.out.println(t.channel);
		System.out.println(t2.channel);
		
		
		
	}

}
