
public class StudentTest {//---------10
	public static void main(String[] args) {
		//����: 100, ����:60, ����:76 
		//������ 
		//�̸�: ȫ�浿
		//���� : 236
		//��� : 78.7 �Ҽ��� 2��° �ڸ����� �ݿø�
		
		Student stu = new Student("������",3,17,100,60,76);
		
		int total = stu.getTotal();
		double avg = stu.getAverage();
		
		System.out.println("�̸� : "+ stu.name);
		System.out.println("���� : "+ total);
		System.out.println("��� : "+ String.format("%.1f", avg));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 //0929 ----6 ������ ���

//		Student s1 = new Student("ȫ�浿",10,3);
//		//�������� ���� 
///*		s1.name = "ȫ�浿";
// * 		s1.age = 10;
// * 		s1.grade = 3;
//	
//		
//*/		
//		Student s2 = new Student("�̼���",10,3);
//		Student s3 = new Student("������",10,3);
//		
//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.grade);
//	
//		System.out.println(s2.name);
//		System.out.println(s2.age);
//		System.out.println(s2.grade);
//		
//		System.out.println(s3.name);
//		System.out.println(s3.age);
//		System.out.println(s3.grade);
}

}
