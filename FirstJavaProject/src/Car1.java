
public class Car1 {//0929-4 ������
	//�Ӽ�
	String color;
	String gearType;
	int door;
	
	
	//������ : �������(�ν��Ͻ�)�� �ʱ�ȭ �Ѵ�.
	//		Ŭ������ �̸��� �����ϰ� �ۼ�.
	//		��ü�� �����ϴ� ������ �ѹ��� ȣ��Ǿ�����
	//		�⺻ �����ڴ� ���� ���� (�ٸ������ڰ� �������� ������)
	//		������ �����ε�
	//		��� Ŭ������ �����ڸ� �����Ѵ�. (�Ⱥ��̸� �⺻������)
	//		this / this() 
	

//	Car1(){ //�⺻������
//	}
	
	Car1(){ //�ٸ� �����ڰ� �ִ� ��� �⺻�����ڸ� ���� �ۼ��ؾ��� Ȥ�� c1,c2�� ������?
		
	}
	
//	//�ν��Ͻ��� �ʱ�ȭ ���2
//	Car1(){
//		color ="blue";
//		gearType = "st";
//		door = 3;
//	}
	
	
	//������ �����ε�
//	Car1(String c){ //�Ű����� c�� ���� ���� color�� �ʱ�ȭ
//		color = c;
//	}
	
	//this ----------5 ��������� �Ű������� �������� ���� �� (this �� Ŭ������ü�� ����.)
//	Car1(String color){
//		this.color = color; //this.������� = �Ű������� �޾ƿ� ���� ���� �̸� 
//	}
//	

	//�� �����ڷ� ���� color�� �ٸ� �������� gearType�� ��� �ش� �����ڸ� ȣ��
	Car1(String color){
		//this.color = color;
		this(color,"Auto"); //-----------------------0929-7 �����ڰ� ȣ��  
	}
		
	Car1(String color,String gearType){
//		this.color = color;
//		this.gearType = gearType;
		this(color,gearType,6);
	}
	
	Car1(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
