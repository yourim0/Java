import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���������� scanner, if-else //���ڷ��ϴ¹� ����9��
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���������� �� �ϳ��� �Է��ϼ���");
//		System.out.print("ö�� >>");
//		String C = sc.next();
//		System.out.print("���� >>");
//		String Y = sc.next();
//		
//		if(C.equals("����") && Y.equals("��")) {
//			System.out.println("ö���� �̱�");
//		}else if(C.equals("����") && Y.equals("�ָ�")){
//			System.out.println("���� �̱�");
//		}else if(C.equals("��") && Y.equals("�ָ�")) {
//			System.out.println("ö���̱�");
//		}else if(C.equals("��") && Y.equals("����")) {
//			System.out.println("�����̱�");
//		}else if(C.equals("�ָ�") && Y.equals("��")) {
//			System.out.println("�����̱�");
//		}else if(C.equals("�ָ�") && Y.equals("����")) {
//			System.out.println("ö���̱�");	
//		}else if(C.equals(Y)){
//			System.out.println("���");
//	
//		}
//		

//		System.out.println("�ݾ��Է�:");
//		int kor = sc.nextInt();
//		int doller = 1100;
//		double rsl = kor / doller;
//		
//		System.out.println("��ȭ��  $:"+rsl);
//		

//		System.out.println("2�ڸ� ���� �Է�: (10-99)");
//		int kor = sc.nextInt();
//		if((kor/10) == (kor%10)) {
//			System.out.println("����");
//		}else {
//			System.out.println("Ʋ��");
//		}
//	
		// if��
//		System.out.println("�ݾ�");
//		int kor = sc.nextInt();//77000
//	
//		int a = kor/50000;//1
//		//kor = kor-a*50000;
//		System.out.println("������:"+a);
//		

//		int num=sc.nextInt(); if???????????????
//		
//		System.out.println("50000won"+num/50000+"mae");
//		//num%=50000;
//		
//		System.out.println("10000won"+num/10000+"mae");
//		//num%=10000;
//		
//		System.out.println("1000won"+num/1000+"mae");
//		//num%=1000;
//		
//		System.out.println("100won"+num/100+"mae");
//		//num%=100;
//		
//		System.out.println("50won"+num/50+"mae");
//		//num%=50;
//		
//		System.out.println("10won"+num/10+"mae");
//		//num%=10;
//		
//		System.out.println("1won"+num/1+"mae");
//		

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("�ݾ��� �Է��ϼ���>>");
//		System.out.println("��������"+num/50000+"��");
//		num-=50000*(num/50000);
//		System.out.println(num);
//		System.out.println("������"+num/10000+"��");
//		num-=10000*(num/10000);
//		System.out.println(num);
//		System.out.println("õ����"+num/1000+"��");
//		num-=1000*(num/1000);
//		System.out.println(num);

		// �߰������ϱ�
//	int a = sc.nextInt(); //20
//	int b = sc.nextInt(); //100
//	int c = sc.nextInt(); //33
//	
//	if(b>a && b<c ) {
//		System.out.println("�߰����� b"); //=((a < b && b < c) || (c < b && b < a)) 
//	}else if(b<a && b>c) {
//		System.out.println("�߰����� b");
//	}else if(c>b && c<a) {
//		System.out.println("�߰����� c");
//	}else if(c<b && c>a) {
//		System.out.println("�߰����� c");
//	}else if(a<b && a>c) {
//		System.out.println("�߰����� a");
//	}else if(a>b && a<c) {
//		System.out.println("�߰����� a");
//	}else {
//		System.out.println("����");
//	}

//		int a = sc.nextInt(); 
//		int b = sc.nextInt(); 
//		int c = sc.nextInt();
//		
//		if((a+b)>c || (a+c)>b || (b+c)>a) {
//			System.out.println("�˴ϴ�");			
//		}else {
//			System.out.println("�ȵ˴ϴ�");
//		}
//	

		/// 3,6,9¦ -
//		System.out.println("1-99");		//97
//		int a = sc.nextInt(); 
//		if(a >= 1 && a <=10) { //1-10
//			if(a%3==0) {
//				System.out.println("¦");
//			}
//		}else if(a >10) {
//			if((a/10)%3==0 && (a%10)%3 == 0) {
//				System.out.println("¦¦");
//			}else if((a/10)%3==0 || (a%10)%3 == 0){
//				System.out.println("¦");
//			}else {
//				System.out.println("��");		
//			}
//		}
//		
//
//		int a;
//		int result = 0;
//		int cnt = 0;
//		
//		while(true) {
//			System.out.println("�Է��ϼ���");
//			a = sc.nextInt(); 
//			if(a == -1)
//				break;
//			result = result+a;
//			System.out.println("result:"+result);
//			cnt++;
//			System.out.println("cnt:"+cnt);
//			if(a == -1)
//				break;
//		}System.out.println("������ ������ "+cnt+"���̸�, �����"+result/cnt+"�Դϴ�");

		// double a = sc.nextDouble();
		// double b = sc.nextDouble();

//		boolean flag = true; //������ ������ ���ؼ� ���� �� ����
//		int cnt = 0;
//		while (flag) {
//			cnt++;
//			System.out.println(cnt);
//			if (cnt > 5) {  // ����Ǵ� ����}
//				flag = false; 
//				 // System.out.println(cnt); }
//
//			}
//		}
		
//		System.out.println("�����Է�");
//		int a = sc.nextInt(); 
//		if(a >= 3 && a<=5) {
//			System.out.println("��");
//		}else if (a >= 6 && a<=8) {
//			System.out.println("����");
//		}else if(a >= 9 && a<=11) {
//			System.out.println("����");
//		}else if (a ==1 || a==2 || a==12) {
//			System.out.println("�ܿ�");
//		}else {
//			System.out.println("�߸��Է�");
//		}
		
		//switch��
//		System.out.println("�����Է�");
//		int a = sc.nextInt(); 
//		switch (a) {		
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("��");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("����");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("����");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("�ܿ�");
//			break;
//		default:
//			System.out.println("�߸��Է�");
//		}
		//
		

		
/*		System.out.println("sum"+sum + ", i:"+i);
		
		//¦���� ���� //Ȧ���� ������ �� - ¦���� �������� = 100
		int x = 0; //Ȧ���� ��
		int y =0;//¦���� ��
		int cnt =0;
		
		for(int a=1;true;a++) {
			if(a%2==0) {
				x+=a;
				cnt ++;
				System.out.println("x"+x);
			}else {
				y+=a;
				System.out.println("y"+y);
				cnt ++;
				}
			if((y-x)>100)
				break;
			}System.out.println(x+","+y);
			System.out.println("sum"+(y-x));
			System.out.println("cnt"+cnt);
		*/
		
		
		/*exports.list = function(req, res){	// ToDo ��� ������ ���. app.js���� require
			fs.exists('./todo_list.json', function (exists) {	// ToDo ��� ���� Ȯ��
				if(exists) {
					fs.readFile('./todo_list.json', {
						'encoding': 'utf8'
					}, function (err, list) {	// todo_list.json ���� �б�
						res.json(list);
					});
				} else {
					var list = {	// �⺻ ToDo ��� ����
						'list': []
					};*/
						
		
		
		
		
		
		
		
		
	}
}
