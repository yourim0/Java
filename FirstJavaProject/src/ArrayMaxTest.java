
public class ArrayMaxTest {//0928 

	public static void main(String[] args) {
		//1. ArrayMax ��ü ����
		ArrayMax max = new ArrayMax();

		
		//2. ������ ��ü�� �迭�� 1~100���� ���� �����ϰ� ����
		for(int i=0; i<max.arr.length;i++) {
			max.arr[i] = (int)(Math.random()*100) + 1;
		}

		
		for(int i : max.arr) {
			System.out.println(i);
		}
		
		
		//4. ��ȯ�� �ִ밪�� ���
		//Max(max.arr);
		
		
//		int[] maxNum = Max(max.arr);
//		int finalNum = Max(max);
//		System.out.println("�ִ밪 : "+finalNum);
//		System.out.println(max.arr[0]);
		
		
	}
//	
//	//3. �޼ҵ带 ����(�迭�� �ִ밪�� ���ؼ� ��ȯ)
//	
//	static void Max (int[] max) {
//		int numMax=0;
//		for(int i=1; i<max.length; i++) {
//			if(max[i] >= max[0]) {
//				numMax = max[i];
//			}
//		}System.out.println("numMax"+numMax);
//		
//	}
	
//	static int[] Max (int[] max) {
//		int numMax=0;
//		for(int i=1; i<max.length; i++) {
//			if(max[i] >= max[0]) {
//				numMax = max[i];
//			}
//		}return numMax;
//		
//	}	
//	
	
	
}
