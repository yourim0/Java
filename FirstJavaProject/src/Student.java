
public class Student {//---------10
//Ŭ������ �⺻ ���� : ����,������,�޼ҵ�
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	Student(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() { //����
		return kor + eng + math;
	}
	
	

	
	double getAverage() { //���
		return (double)(getTotal())/3;
	}
	
	
	
	
	
	
//	double getAverage() { //���
//	int total = getTotal();
//	double avg = (double)total / 3;	//���� �� double������ ��������
//	
//	return avg;
//}
	
//	double getAverage() { //���
//		return (int)(getTotal() / 3.0 * 10 +0.5) / 10.0;//���� �� 3�� double������ ��������
//		
//	}	
	
	
	
	
	
	
	
	
	 //0929 ----6 ������ ���
	//	String name;
//	int age;
//	int grade;
//
//	//������
//	Student(String name,int age,int grade){
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
//	
//	



}



