package exceptionProject; //1007 ����ó�� ����

public class ExceptionTest {

	public static void main(String[] args) {
		// �ڵ�󿡼� �����ڰ� �����ϰ� ����� �������� �ذ��ϴ� ��

		/*
		 * try {
		 *  //���ܸ� �߻���Ű�� ���� ���๮�� 
		 *  }catch(����Ÿ��) {
		 *   ����ó�� ���� //��� ó������ 
		 *   }
		 */

		// �ڹٰ� ����� ���� ����ó��
		// ����ó�� Ŭ���� �� ���� ���� Ŭ����
		// Exception

		/*
		 * for(int i=0;i<100;i++) {
		 *  try {
		 *  int r = (int)(Math.random()*10); //0-9
		 * System.out.println(r);
		 *  int result = 10 /r; //������ �Ǵ� ���� //������ 0���� ���� �� ���� �Ǿ��ִ�. ����r�� 0�� ���ð�� ���� �Ұ� -> (arithmeticException)���ܹ߻�
		 * }catch(ArithmeticException e) { //�Ű������� Ÿ���� ���� ������ ����
		 * System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�.");
		 *  
		 *  }}
		 */

		int[] arr = new int[5]; // 0~4

		
		
		
		/*
		 * try {
		 *  arr[5] = 10; 
		 *  }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Index number ����"); }
		 */

		
		
		
		/*
		 * try { 
		 * arr[5] = 10; 
		 * }catch(Exception e) { //����Ÿ�� �𸣸� ������ Exception�Է�. ���� ��������
		 * System.out.println("Index number ����"); }
		 */

		// try���� �Ѱ��� �ۼ� ���������� catch���� ������ �ۼ��� �� �ִ�

		/*
		 * try { arr[5] = 10;
		 *  }catch(ArithmeticException e) {
		 * System.out.println("0���� ����� ���ܸ� ������ ó���߽��ϴ�."); //ù��° ���� ó���Ǹ� �Ʒ��� �ȳ�������.
		 * }catch(ArrayIndexOutOfBoundsException e) {
		 * System.out.println("Index number ����"); 
		 * }catch(Exception e) 
		 * { //����Ÿ�� �𸣸� ������ Exception�Է�. ���� �������� 
		 * System.out.println("��翹�� ó��"); 
		 * }finally { //���ܹ߻� ������
		 * ������� ������ �ѹ� ���� System.out.println("���ܹ߻� ������ ������� ����"); }
		 */

		// ������ ���ܸ� �߻���Ű�� ���
		// throw new Exception("���Ƿ� ���ܹ߻�"); ������ü�� �ȵǰ� ����

		/*
		 * try { 
		 * throw new Exception("���Ƿ� ���ܹ߻�"); //�߻��Ǿ����� �ϴ� �ƹ� ����
		 *  }catch(Exception e){
		 *  System.out.println(e.getMessage());//���� ����.getMessage �޼ҵ带 �̿� //���� �߻���Ű��
		 * ������ ȣ���Ѵ�. e.printStackTrace(); }
		 */

		/*
		 * arr[3] = 10; System.out.println(arr[3]);
		 * 
		 */

		add();

		//catch�� Ÿ��
		//throw���� ���� ����
		//throws���� ���� ���� 
		
		
		
		// throw �޼ҵ� ���� ��
		try {
			sub();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	// main() end
	// �Լ����� �Լ� void add(); �� ���� �߻��Ѵ�.

	static void add() {
		try {
			throw new Exception("add() ���ܹ߻�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // add() end

	// ����ó���� �ȵǸ� ������ �����. -> ���ܼ���
	static void sub() throws ArithmeticException { // ���� �����ϱ� :�˾Ƽ� �����ؼ� ���, ���˷������ϱ� �ʰ� �ذ���. �����main�� ����ó�� �ؾ��Ѵ�.
		throw new ArithmeticException("sub() ���ܹ߻�");

	}

}
