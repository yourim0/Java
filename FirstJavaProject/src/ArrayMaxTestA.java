
public class ArrayMaxTestA {//0928 

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
				int biggest = arrayMax(max.arr);
				System.out.println("max: "+biggest);
	}
	
	
	//3. �޼ҵ带 ����(�迭�� �ִ밪�� ���ؼ� ��ȯ)
	static int arrayMax(int[] max) { //return����� �ϴϱ� void x. return ���� ������ Ÿ�� int �� ����

		int biggest = max[0];
		
		for(int i=0; i<max.length; i++) {
			if(max[i] > biggest) {
				biggest = max[i];
			}
		}return biggest;
		
	}

}
