import java.util.Scanner;

public class IfTest { // 0921 ���ǹ�
	public static void main(String[] args) {
		// ���ǹ� : ���� ������ ���������� ����
		// if, switch ~ case

//		if(���ǽ�(true or false) { //���ǽ��� ��������true or false
//			���๮

//		int age = 15;
//		if(age >= 20) { // true
//			System.out.println("�����Դϴ�.");
//		}else {
//			System.out.println("�̼��� �Դϴ�.");
//		}
//		
//		
//		int num = 10;
//		if(num % 2 == 1) {
//			System.out.println("Ȧ��");
//		}else {
//			System.out.println("¦��");
//		}

// ���������� 80�� �̻��̶�� �հ� �Ǻ��ϴ� ���α׷�
//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
//		if(score >= 80) {
//			System.out.println("�հ�");
//		}else {
//			System.out.println("���հ�");
//		}

// �Էµ� ���� ��3 ������� �Ǻ��ϴ� ���α׷�
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���ڸ� �Է����ּ��� :");
//		int num = sc.nextInt();
//		if(num % 3 == 0) {
//			System.out.println("3�� ����Դϴ�.");
//		}else {
//			System.out.println("3�� ����� �ƴմϴ�.");
//		}

		// ���� if��
//		int score = 101;
//		String score = 'A'
//		if (score >= 90 && score <= 100) {
//			System.out.println("A����");
//		} else if (score >= 80 && score <= 89) {
//			System.out.println("B����");
//		} else if (score >= 70 && score <= 79) {
//			System.out.println("C����");
//		} else if (score >= 60 && score <= 69) {
//			System.out.println("D����");
//		} else if (score >= 0 && score <= 59) {
//			System.out.println("F����");
//		} else {
//			System.out.println("���ǿ� �������� �ʽ��ϴ�");
//		}

//�Է¹��� ������ ���� ������ �ο��ϴ� ���α׷�
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է����ּ��� :");
//		int score = sc.nextInt();
//		if(score >= 90) {
//			System.out.println("A");
//		}else if(score < 80) {
//			System.out.println("B");
//		}
//		
//		sc.close();

		// ��ø if-else ����
		// �ΰ��� ���� ����

//		int x = 6;
//		if (x % 2 == 0) {
//			if (x % 3 == 0) { //=if(x%2 ==0 && x%3==0)
//				System.out.println("x�� 2�� 3�� �����");
//			}
//		}

		/*
		 * ����, �г� �Է¹޾� 60�̻� �հ�, �̸� ���հ�. 4�г��� 70�� �̻� �հ� Scanner sc = new
		 * Scanner(System.in); System.out.println("���� �Է��ϼ���"); int score = sc.nextInt();
		 * System.out.println("�г� �Է��ϼ���"); int grade = sc.nextInt();
		 * 
		 * if (grade >= 1 && grade < 4) { // 1~3�г� if (score >= 60 && score <= 100) {
		 * System.out.println("�հ�"); } else if (score < 60 && score >= 0) {
		 * System.out.println("���հ�"); } else { System.out.println("�߸� �� ���̴�"); } } else
		 * if (grade == 4) { if (score >= 70 && score <= 100) {
		 * System.out.println("�հ�"); } else if (score < 70 && score >= 0) {
		 * System.out.println("���հ�"); } } else { System.out.println("�߸� �� �Է°��Դϴ�."); }
		 */

		// switch�� : �����(==) 1:1��, ���� ���� �� x
//		
//		switch(�񱳰� ) {
//		case ��1 : ���๮;
//		break;
//		case ��2 : ���๮;
//		break;
//		case ��3 : ���๮;
//		break;
//		default;
//		}
//
//		int sel = 8;
//		switch(sel) { 
//		case 1 : System.out.println("1�� ����");
//		break;
//		case 2 : System.out.println("2�� ����");
//		break;
//		case 3 : System.out.println("3�� ����");
//		break;
//		default : System.out.println("���ǿ� �������� �ʽ��ϴ�");
//		}

		// switch ~ case ������ ����(��Ģ����) �����

//		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° ���ڸ� �Է����ּ���");
//		int num1 = sc.nextInt();
//		System.out.println("�ι�° ���ڸ� �Է����ּ���");
//		int num2 = sc.nextInt();
//		
//		sc.nextLine(); //buffer �����ִ� line
//		
//		
//		System.out.println("�����ڸ� �Է��ϼ��� : (+ , -, *, /)");
//		String op = sc.nextLine();
//		
//		
//		switch(op) { 
//		case "+" : System.out.println(num1+num2);
//		break;
//		case "-" : System.out.println(num1-num2);
//		break;
//		case "*" : System.out.println(num1*num2);
//		break;
//		case "/" : System.out.println(num1/num2);
//		break;
//		default : System.out.println("����Ұ�");
//		}

		/*
		 * �Է¹��� ������ ���� ���� �ο� switch - case ��� ����
		 * 2-14************************************* 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("������ �Է����ּ���"); 
		 * int num1 = sc.nextInt(); String grade;
		 * 
		 * switch (num1/10){
		 *  case 10 : 
		 *  case 9 : 
		 *  grade = "a"; 
		 *  System.out.println("a");
		 *  break;
		 *  case 8 :
		 *  case 7 : 
		 *  grade = "b"; 
		 *  break; 
		 *  case 6 : 
		 *  case 5 : 
		 *  grade = "c";
		 *  break;
		 *  default: 
		 *  grade = "f";
		 *   } System.out.println("���� : " + grade);
		 */

		// Ŀ�Ǹ޴� ���� �˷��ִ� ���α׷� ���� 2-15
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ŀ�Ǹ� �Է����ּ���");
//		String coffee = sc.next();
//
//		switch (coffee) {
//		case "����������":
//		case "īǪġ��":
//		case "ī���":
//			System.out.println("3500�� �Դϴ�.");
//			break;
//		case "�Ƹ޸�ī��":
//			System.out.println("2000�Դϴ�. ");
//			break;
//		default:
//			System.out.println("�����.");
//		}
		

	}

}