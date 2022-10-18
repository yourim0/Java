import java.util.Scanner;

public class BingoTest { //0927

	public static void main(String[] args) {

		//1.이중배열에 난수 1-50 들어가게 생성

	
		
		int[][] arr = new int[5][5];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random() * 50) +1;
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}			
		
		//출력
//		for(int[] i : arr) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		
		//2.값입력하여 같은 값 있으면 0으로 변경하도록 무한 반복
		
		
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int sum;
		
		while(flag) {
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		sum = 0; //입력한 값이 0이 아닐 수 도 있으니까 여기서 초기화
		
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
		System.out.println("sum : "+ sum); //for문 다 빠져나오면 출력 
	}System.out.println("겜오버");
		
		
		//3.계속 반복하다가 전체 0되면 종료

		
		
		
		
		
		
	}

}
