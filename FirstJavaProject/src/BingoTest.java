import java.util.Scanner;

public class BingoTest { //0927

	public static void main(String[] args) {

		//1.���߹迭�� ���� 1-50 ���� ����

	
		
		int[][] arr = new int[5][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random() * 50) +1;
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}			
		
		//���
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
		//2.���Է��Ͽ� ���� �� ������ 0���� �����ϵ��� ���� �ݺ�
		
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int sum;
		
		while(flag) {
		System.out.println("���ڸ� �Է��ϼ���");
		int num = sc.nextInt();
		sum = 0; //�Է��� ���� 0�� �ƴ� �� �� �����ϱ� ���⼭ �ʱ�ȭ
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				
				if(arr[i][j] == num) {
					arr[i][j] = 0;					
				}
				sum += arr[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 
		if(sum == 0) {
			flag = false;
		}
		System.out.println("sum : "+ sum); //for�� �� ���������� ��� 
	}System.out.println("�׿���");
		
		
		//3.��� �ݺ��ϴٰ� ��ü 0�Ǹ� ����

		
		
		
		
		
		
	}

}
