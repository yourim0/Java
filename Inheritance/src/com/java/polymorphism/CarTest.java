package com.java.polymorphism; //1005-3 ������ //��ü�� �������� ����� ������ �Ѵ�. ĳ���� �Ұ�

public class CarTest {

	public static void main(String[] args) {
		//�Ϲ��� ��ü ���� 
//		FireEngine fe = new FireEngine();
//		Ambulance ab = new Ambulance();
		
/*		
		//�������� ������ ��ü ����
		// �������� ����ȯ:������ �� �ִ� ����� ������ ���Ѵ�.
		Car car = null; 	//�θ�Ÿ�� �������� 
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null; //������ ������ �ʱ�ȭ. �⺻���� null
		//���� ����ȯ : ��ĳ����, �ٿ�ĳ����
		//fe.water();
		car = fe; //�ڵ�����ȯ //���� �յ� ������ Ÿ����ġ x -> ������ ���Ұ�(ex) double <- int , ��ӱ��������� Ÿ���� Ŭ���� �ΰ�� �θ� - ūŸ��, �ڽ� - ����Ÿ������ �Ǵ�
		//Car = FireEngine ���� �ּҰ��� �Ѿ����, �ּҰ��� ���� Ÿ���� ����� ���� car�� CarŸ������ ����. 
		//car.water();
		car.stop();//���� carŬ������ stop�� ��� ����, feŬ������ water�޼ҵ�� ������� ���Ѵ�. 
		
		
		
		//fe2 = car; //�θ�Ÿ���� ����Ÿ���� �ڽ� Ÿ���� ���� �� ����.
		fe2 = (FireEngine)car; //  -> ���� ����ȯ���� ���
		fe2.water();//Ÿ���� car -> FireEngine Ÿ������ �ٲ���� ������. �ᱹ �� ���� �ּҰ� �ٶ󺸴°� 
	*/
		
		
		FireEngine fe = new FireEngine();
		Ambulance ab = new Ambulance();
		
		Car car = new Car();
		car.doWork(ab);
		car.doWork(fe);
	}

}
