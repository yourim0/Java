import java.util.Scanner;

public class ScannerEx { // 0920

	public static void main(String[] args) {
//		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
//		Scanner sc = new Scanner(System.in);

//		String name = sc.next();
//		System.out.println("�̸��� "+name+",");
//		
//		String city = sc.next();
//		System.out.println("���ô� "+city+",");
//		
//		int age = sc.nextInt();
//		System.out.println("���̴� "+age+",");
//		
//		Double weight = sc.nextDouble();
//		System.out.println("ü���� "+weight+",");
//		
//		boolean marry = sc.nextBoolean();
//		System.out.println("���� ���δ� "+marry+"�Դϴ�");
//		
//		sc.close();

//		String name = sc.next();
//		String city = sc.next();
//		int age = sc.nextInt();
//		Double weight = sc.nextDouble();
//		boolean marry = sc.nextBoolean();
//		
//		
//		System.out.println("�̸��� "+name+","+"���ô� "+city+","+"���̴� "+age+","+"�����Դ� "+weight+","+"��ȥ���δ� "+marry+"�Դϴ�");

		// �ʤ����� ���� �Է¹ް� �ð�, ��, �ʷ� ����϶�
//		Scanner sc = new Scanner(System.in);
//		int time = sc.nextInt();
//		int second = time % 60;
//		int minute = (time / 60) % 60;
//		int time2 = (time / 60)/60;
//		System.out.println(time+" �ʴ�:"+second+"��,"+minute+"��,"+time2+"�� �Դϴ�.");

		// ���� ���� : 467->400, 590->500 �������
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �ڸ� ���� �Է��ϼ���");
//		int num = sc.nextInt();
//		System.out.println("�Է¹��� �� :" + num);
//		
//		int result = (num / 100) * 100;
//		System.out.println("����Ǿ��� ��� : "+ result);

		// 333->331, 778->771

//		Scanner sc = new Scanner(System.in);
//		System.out.println("�����ڸ� ���� �Է��ϼ���");
//		int num = sc.nextInt();
//		System.out.println("�Է¹��� �� : " + num);
//		
//		int result = ((num / 10) * 10) + 1;
//		System.out.println("����Ǿ��� ��� : "+ result);
//		

		// ������ ū ���� ����� 10�� ����� ���ϼ���
		// 19 -> 20, 81 -> 90
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� ���� �Է��ϼ���");
//		int num = sc.nextInt();
//		System.out.println("�Է¹��� �� : " + num);

//		int result = (num / 10 + 1) * 10; //num *10 +10
//		System.out.println("����Ǿ��� ��� : " + result);

		// �Է��� ���� ����� ���̰�
//		int result = (num / 10 + 1) * 10 - num;
//		int result = 10 - (num % 10);
//		System.out.println("����Ǿ��� ��� : " + result);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("��� ���� �Է��ϼ���");
//		int appleNum = sc.nextInt();
//		int result = (appleNum / 10) + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.println("�� ����� ��  : " + appleNum + "�� �̸�, �ٱ��ϴ� "+ result + "���� �ʿ��մϴ�.");

		
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ���� �Է��ϼ���");
		int apple = sc.nextInt();
		int result = (apple / 10) + (apple % 10 > 0 ? 1 : 0);
		System.out.println("�ʿ��� �ٱ��� ������ : " + result);
				
				
				
				
//		int x = -3;
//		System.out.println(x >= 0 && x <= 10);
//		System.out.println(!(x >= 0 && x <= 10));
//		System.out.println(x <= 0 || x >= 10);
	}

}
