
public class MyMathTest { //0929-3 overloding ���

	public static void main(String[] args) {
		MyMath ma = new MyMath();
		int sum1 = ma.add(2, 3);
		System.out.println(sum1);
		
		long sum2 = ma.add(3L, 2L); //��ȯŸ�� long
		System.out.println(sum2);
		
		int[] arr = {1,2,3,4,5};
		int sum3 = ma.add(arr);
		System.out.println(sum3);
		
		
		
	}

	
	
	//���� static �޼ҵ� - static �޼ҵ常 ��� ����, ���� static ���µ� �� ����? --> ���� class�϶���?
	//main class ������ �������ϸ� ��밡���ϴ�. 
	
	
	
}
