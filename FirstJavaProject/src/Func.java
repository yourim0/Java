
public class Func { //0928-1 �޼ҵ�(�Լ�) : ����(�ʿ�� �������� ������ ȣ���Ͽ� ��� �� ���ִ�.
	//�޼ҵ�(�Լ�) : ��ü�� ����� ����
	//����:
	
	//����Ÿ�� �޼ҵ��([�Ű�����1, �Ű�����2,......]){  //[]�κ��� �ʿ����� ������ ��������
	//	���๮��
	//	[return ��]
	//}

//��Ģ���� ���� ����
	
	//����Ÿ�� : void, �⺻�ڷ���, ������
	//�޼ҵ�� : ��Ÿǥ���
	//�Ű����� : int x, double d(�⺻��), Tv t(������)
	//return: ����Ÿ���� void�� �ƴѰ�쿡 ���

	
	void add() { //�޼ҵ��� �����(�ñ״���) //void��� return�� x
		System.out.println(2+3);//�޼ҵ��� ������ 
	}
	
	void add2(int x,int y) { //�Ű����� : �Լ��� ����Ǵ� ������ ���� ����
		System.out.println(x + y);
		
	}
	
	//���ϰ��� �ִ� ��� return ���� Ÿ�԰� �����ϰ� ���� �ؾ� �Ѵ�. 
	int add3(int x, int y) {
		int sum = x+y; //Ư�� ��� ���� ���� ���� : ��������. ���� �ٸ��޼ҵ忡�� ���� �̸��� �ᵵ �ȴ�.
		return sum; //return �ڿ� �����ް���� ���� ����
	}
	
	int sub(int x, int y) {	 
		int sub = x-y;
		return sub;
	}
	
	int mul(int x, int y) {
		int mul =x*y;
		return mul;
	}
	
	double div(double x, double y) {
		double div = x/y;
		return div;
	}
	//===========================================================void �Լ������� return�� ����
	
	void test(int x, int y) {
		if(x < y) {
			System.out.println("�Լ��� ����");
			return; //���⼭ return�� �Լ��� ��� ���Ḧ �ǹ�. (return ���� ���� ������ void �Լ������� ����.)
		}
		
	int result = x + y;
		System.out.println(result);
	}

//	�����߻� : int �������� ���ǹ� �ȿ� �ֱ⶧���� ������ �ȵ� ��찡 �߻��� else�������� �ۼ��ؾ���.	
//	int test2(int x, int y) {
//		if(x>y) {
//			return x;
//		}
//	}
	
// return ���� ������ ������	
//	int test2(int x, int y) {
//	if(x>y) {
//		return x;
//	}else {
//		return y;
//	}
//}
	
	int test2(int x, int y) {
		
		int result;
		
		if(x > y) {
			result = x;
		}else {
			result = y;
		}return result;
	}
	
	//=================================�Լ��� ȣ��
	void call1() {
		System.out.println("Call1");
		call2();
	}
	
	void call2() {
		System.out.println("Call2");
		call3();
	}
	
	void call3() {
		System.out.println("Call3");
		
	}
	
}
