
public class VarTest { // ��������

	public static void main(String[] args) {
		// ����, ����, ���ڿ�, ��¥, �̹���, ������ �� �޸𸮿� �����س��� ����ϴ� ������ ����
		// ���� : ���� �����ϴ� ����, �� ���� ����
		// ������ ���� : �ڷ��� ������;
		// ���� : ����(byte, short, int, long), �Ǽ�(float, double)
		// ���� : ����(char), ���ڿ�(String) ����p65
		// �� : boolean : ��(true), ����(false)���� ǥ��
//		
//		byte b; //-128~127
//		b = 30; //�޸𸮿� �����
//		
//		System.out.println(b);
//		
//		b = 20;
//		System.out.println(b);
//		
//		int i; //�� -21��~21��
//		i = 300;
//		
//		System.out.println(i);

//		int x;
//		int y;
//		int z;

//		int x,y,z; //Ÿ���� ������ �����ؼ� ���� ����

//		int x=10,y=20,z=30; //���� ����� ���ÿ� �ʱ�ȭ
//		x=y=z=10;
//		
//		x = 10; //���� �ʱ�ȭ
//		y = 20;
//		z = 30;
//		
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);

//		short s = 10; //-32768~32767
//		long l = 10L; //���� �� ��ŭ. ���̻�� ����

//		char c; //0~65525 ������ ������ Ÿ������ �ٷ�. ex. b=65 ��
//		c = 'a';
//		System.out.println(c);
//		
//		char c2;
//		c2 = '��';
//		System.out.println(c2);

//		char c = 'A'; //65�� �ν� 
//	 	int i = c;
//		System.out.println(i);
//		System.out.printf("%d\n",i);
//		System.out.printf("%c",c);

//		'A'->65, 'a'->97, '0'-> 48  1��������
//		���ڴ� ',���ڿ��� "
		// char c1,c2;
//		c1 = 'A'; //65
//		c2 = 'B'; //66 
//		System.out.println(c1+c2); //'A'+'B'

		String str = "A"; // �ѱ��ڴ� ����, ���ڿ� ��� ����
		String str2 = "abc";

		System.out.println(str);
		System.out.println(str2);
		System.out.printf("%s\n", str);
		System.out.printf("%s\n", str2);

		float f = 3.14f; // �Ǽ� �� �ݵ�� ���̻� �ʼ�f,F ����
		System.out.println(f); // f�� ���� �ִ� �κб����� ���
		System.out.printf("%.3f\n", f); // %f �Ǽ� ���� �� ����. ���Ĺ��ڻ��� �⺻ 6����. f�տ� .���ڷ� �ڸ��� ��������

		double d = 3.14d; // 8byte float ���� ���� ŭ. �׳� double �ᵵ ��. ���̻� ����, �ҹ��� ��� x
		System.out.println(d);
		System.out.printf("%f\n", d);

//		�ڷ����� �⺻Ÿ�� : ���� ������ int, �Ҽ� double�� �⺻������ ���
//		10�Է� �� int, 3.14�Է� �� double�� �⺻ �ν�

		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);

		// ������ �⺻��
//		boolean -> false
//		byte,short,int -> 0
//		long -> 0L
//		
//		char ->''//ĭ ���� �ϸ� �ȵ�
//		
//		float -> 0.0f
//		double -> 0.0d
//		
//		String -> null, "" //ĭ ���� ��� ��
		// ���ͷ� = ������ ���Ǵ� ��
		
//		%c character.
//		%d decimal (integer) number (base 10)
//		%f floating-point number.
//		%i integer (base 10)
//		%s String.
	}

}
