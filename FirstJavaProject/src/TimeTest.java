
public class TimeTest { //0927

	public static void main(String[] args) {
		Time t1, t2, t3; //���� ����
//		Time t1 = new Time
		

//		t1 = new Time(); //������ �۾� �ϴµ� �ɸ��ð�
//		t1.hour = 10;
//		t1.minute = 29;
//		t1.second = 33;
//		
//		t2 = new Time();
//		t2.hour = 3;
//		t2.minute = 45;
//		t2.second = 11;
//		
//		t3 = new Time();
//		t3.hour = 5;
//		t3.minute = 15; 
//		t3.second = 53;
		
		
		Time[] time = new Time[3]; //������ ������ ����Ͽ� �迭����
		
		for(int i=0;i<time.length;i++) { //��ü �ѹ��� ����
			time[i] = new Time();
		}
		
		//time[0] = new Time(); //�ε��� 0��°�� ��ü ����
		time[0].hour = 10;
		time[0].minute =29;
		time[0].second =33;
		
		//time[1] = new Time();//�ε��� 1��°�� ��ü ����
		time[1].hour = 3;
		time[1].minute = 45;
		time[1].second = 11;
	
		//time[2] = new Time();//�ε��� 2��°�� ��ü ����
		time[2].hour = 5;
		time[2].minute = 15;
		time[2].second = 53;
	
	
		// x��x��x�ʷ� ���
		//1
		for(int i=0;i<time.length;i++) {
			System.out.println(time[i].hour + "��" + time[i].minute+"��"+time[i].second+"��");
			
		}System.out.println();
	
		//2
		for(Time t : time) { //�迭 time�� ���̸�ŭ �ݺ� (Time Ŭ�����ڷ���)
			System.out.println(t.hour + "��" + t.minute+"��"+t.second+"��");
		}
	
	}

}
