
public class ArrayArgTest { //0928 �迭 Ÿ��
	
	
	//�迭 ���� ��ü�� �ּҰ��� ������ �����̱⶧���� �������̴�!!!!! call-by-reference(���� ����)

	public static void main(String[] args) {
		ArrayArg ay = new ArrayArg();
		ay.x = 10; //���������� ���� �������
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;
		
		for(int i:ay.arr) {
			System.out.println(i);
		}
		
	//===========================================������
		int[] arr2 = change(ay.arr); //������ �迭�� ���� �� �ִ�
		
		for(int i : arr2) {
			System.out.println(i);
		}
		
		
		
//		change(ay.arr); //�迭�� �ּҰ��� ����
//		
//		for(int i:ay.arr) {
//			System.out.println(i);
//		}
	}
	
//	static void change(int[] arr) { //arr �迭�� �ּҰ��� ������ 
//		arr[0] = 100;
//		System.out.println("change() = " + arr[0]);
//	}

	//===========================================������
	
	static int[] change(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1) * 10;
		}
		
//		int[] arr2; //������ Ÿ��
//		arr2 = arr;
		
		return arr;
		
	}
		
}
