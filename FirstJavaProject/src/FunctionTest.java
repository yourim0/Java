
public class FunctionTest {//0928-1


	public static void main(String[] args) {

		Func f = new Func(); //���� ���� ���� ����;
		
//		f.add(); //�Լ��� ȣ�� : �Լ��� ���๮���� �����ϵ��� ��
//		f.add2(10, 20);
//		f.add2(100, 200);//�Ű������� Ÿ�԰� ���Ŀ� ���� ������� ����
//		System.out.println(f.add3(5, 8));
//		//���� ��� ���� ������ ��� ���
//		int sum = f.add3(15, 20); //return ��� ���� ����
//		System.out.println(sum);
//		
//		double div = f.div(50.5, 5.6);
//		System.out.println(div);
//		System.out.println(String.format("%.8f", div));
//		
//		int mul = f.mul(30, 6);
//		System.out.println(mul);
//		
//		int sub = f.sub(6, 2);
//		System.out.println(sub);
		
//==========================================================return ���� ������ ������ ���� �ʿ� ����
//		f.test(10,20);
//		f.test(20, 10);
		
		int result = f.test2(10, 20);
		System.out.println(result);
		
		int result2 = f.test2(20, 10);
		System.out.println(result2);
		
		
		f.call1(); //===============================�Լ��� ȣ��
		
	}

}
