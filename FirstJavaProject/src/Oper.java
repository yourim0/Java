
public class Oper { // 0920
	public static void main(String[] args) {

//		int x = 5;
//		int y = 2;

//		System.out.println(x / y);
//		System.out.println(x % y);

//		final double PI = 3.14;
//		System.out.println(PI);

//		double PI = 2.14; ����� ������ �� ����

//		����ȯ(�ڷ��� or ������ Ÿ��)
//		int -> double
//		boolean �� ����
//		--> �ڵ�����ȯ
//		byte (1 byte)< short(2byte) < int(4byte)���Ǳ��� < long 8 < float 4 (���� ǥ���� �� �ִ� ������ �� Ŀ��(�Ǽ���������)long���� ���� �켱) < double 8
		// char 2 (�� ������ �񱳰��ȵ�)
//                                            ��������ȯ<----

//		byte b = 85;
//		int i = b; //�ڵ�����ȯ
//		System.out.println(i);
//		
//		int a = 83;
//		byte k =(byte)i; //��������ȯ
//
//		int l = 300;
//		byte q = (byte)l; // ��������ȯ (byte�� 300�� ���� �� ����) -> ���� �ս��� �߻��Ѵ�.  

//		double d = 3.14;
//		int i = (int)d;
//		System.out.println(i); //.14�ҽ�. ������ ��ȯ�� ������ �ҽ��� �Ͼ �� �ۿ� ����
//		
//		int i = 3;
//		double d = i;
//		System.out.println(d); // �ڵ�����ȯ �ҽ� x
//
//		// byte, char, short �� �ȵǱ� ������ ���� ����ȯ (�빮�� A�� �ƽ�Ű�ڵ�65)
//		byte b = 65;
//		char c = (char) b;
//		System.out.println(c);

		// ------------------------------------------������ ����ȯ

//		int ���� ���� �������� ����������� �ڵ����� int������ ��ȯ�ȴ�
//		byte b1 = 10;
//		byte b2 = 20;
//		byte result = b1+b2; //�Ұ� byte+byte => int + int, byte + short => int+int , char + byte => int + int
//	ĳ���� : byte result =(byte)(b1+ b2);	 // (byte)(int + int)

//		type�� �ٸ� �� �����ڸ� ������ ���� ū �ڷ����� ���󰣴�.
//		int + long -> long+ long
//		int + float -> float + float
//		float + double -> double + double 

//		int x = 5; //����� �Ҽ������� ����� ���� ��
//		int y = 2;
//		double result = x / y; //�� 2.0
//		double result = x % y; //������ 1.0 
//	
//		int x = 3;
//		int y = 5;
//		System.out.println(x / y);
//		//double a = x / y;
		// System.out.println(a);

		int q = 3;
		int r = 5;
		double result = (double)q / r;     //3.5 / 5.0 ->0.6 �� 
		System.out.println(result);
//		+ -> ��� ���� ��ȣ

		// String + anyType -> ������ String
//		String str = "java";
//		double ver = 1.8;
//		String result = str + ver; //"java" + "1.8" 
//		System.out.println(result);

		// ���� ������, �������� ��밡��
//		int x = 10;
//		++x;
//		System.out.println(x);
//		x++;
//		System.out.println(x);
//		--x;
//		System.out.println(x);
//		x--;
//		System.out.println(x);

//���� ����������
//		int x = 10;
//		int y = 0;
//		y = ++x +10; //x=11,y=21
//		System.out.println("x : "+x+" y :"+y);
//���� ����������		
//		int x = 10;
//		int y = 0;
//		y = x++ +10; //x=11,y=20
//		System.out.println("x : "+x+" y :"+y);

//���Կ�����
//		int x = 10;
//		x += 10; //x= x + 10
//		System.out.println(x);
		
//�񱳿����� ===> true / false ������ ǥ��
//	&& ��ΰ� true�϶��� true 
//	|| ��ΰ� false �϶��� false 
//  ! �ݴ�� 
//		int x = 10;
//		System.out.println(!(x == 10)); //���� true�� ���� false�� ��ȯ
		
//���ǿ�����(���׿�����)
//���ǽ�                		 ? ���1 : ���2
//(true or false)  	  true  : false
//	int x = 10;
	//int y = 20;
	//int result = (x > y) ? x : y;
	//System.out.println(result);
	
	//int age = 20;
	//String rs  = (age >= 20) ? "�����Դϴ�" : "�̼����Դϴ�";
		
	}

}
