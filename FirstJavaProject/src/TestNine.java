import java.util.Scanner;

public class TestNine { //0927

	public static void main(String[] args) { //---------------------------------0927

		// 25개 짜리 이차원배열 생성
		// 빙고게임 만들기
		int[][] bingo = new int[5][5];

		// 1-50사이의 난수로 초기화
		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				bingo[i][j] = (int) (Math.random() * 50) + 1;
			}
		}

		for (int i = 0; i < bingo.length; i++) {
			for (int j = 0; j < bingo[i].length; j++) {
				System.out.print(bingo[i][j] + " ");
			}
			System.out.println();

		}

		// 값을 입력하고 배열의 같은 값이 있으면 0으로 변경한다.
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int sum =0;
		
		while (flag) { //오늘의 오류 unreacheble code : 논리적으로 무한루프 등 true로 입력해서 나타남. flag로 수정 해결
			System.out.println("입력하세요");
			int a = sc.nextInt();
			
			sum = 0; //입력시점에 변화 있을 수 있으니 합산값 다시 초기화
			
			for (int i = 0; i < bingo.length; i++) {
				for (int j = 0; j < bingo[i].length; j++) {
					if (bingo[i][j] == a) {
						bingo[i][j] = 0;
					}
					
					sum += bingo[i][j];
					System.out.print(bingo[i][j] + " ");
				}
				System.out.println();
			
				}
				System.out.println("sum"+sum);
				
				if(sum == 0) {
					flag = false;
				}
			}
				System.out.println("Game Over");
		
		
		
		// 배열값이 모두 0이면 멈춤
				// 모든 수의 합이 0일때 break;

		
		
		
		
		}
		
	}
