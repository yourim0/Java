
public class Tv { //0927
	//1004 ���
	//�θ�Ŭ���� : ���� �ڽ�Ŭ������ ���´�
	//		  : ���� ��Ӹ� �����ϴ�
	
	
	
	//�Ӽ�(����) : ũ��, ������ư, ä��, ���� , ����, ��, ������, �����⵵  ��
	//���(�޼ҵ�) : on/off, ä�� up/down, ���� up/down
	//class�� ��������� �⺻������ �ʱ�ȭ�� �Ǿ��ִ�. ���� �ʱ�ȭ ���� ��� �����ϴ�.
	
	
	
	boolean power; //������ư  0
	int channel; //ä��           0
	int volumn;//����              0
	String color; //����         null
	String model; //��
	int year;  //�����⵵
	String company; //������
	
	
	//on/off, ä�� up/down, ���� up/down ����
	//�޼ҵ� ����
	void Power() { //���� on/off
		power = !power; //true->false, false->true; �ݴ���·� �ٲ�� ������
	}
	
	void ChannelUp() { //ä�� up��ư
		channel++;
	}
	
	void ChannelDown() { //ä�� down��ư
		channel--;
	}
	
	void volumnUp() {//ä�� Up��ư
		volumn++;
	}
	
	void volumnDown() {//ä�� down��ư
		volumn--;
	}

	//tv�� �Ұ��ϴ� �޼ҵ�
	
	void showInfo() {
		System.out.println(model);
		System.out.println(year);
		System.out.println(company);
	}
	
}
