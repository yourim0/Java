import java.util.Scanner;

public class TestNine { //0927

	public static void main(String[] args) { //---------------------------------0927

		// 25�� ¥�� �������迭 ����
		// ������� �����
		int[][] bingo = new int[5][5];

		// 1-50������ ������ �ʱ�ȭ
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

		// ���� �Է��ϰ� �迭�� ���� ���� ������ 0���� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int sum =0;
		
		while (flag) { //������ ���� unreacheble code : �������� ���ѷ��� �� true�� �Է��ؼ� ��Ÿ��. flag�� ���� �ذ�
			System.out.println("�Է��ϼ���");
			int a = sc.nextInt();
			
			sum = 0; //�Է½����� ��ȭ ���� �� ������ �ջ갪 �ٽ� �ʱ�ȭ
			
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
		
		
		
		// �迭���� ��� 0�̸� ����
				// ��� ���� ���� 0�϶� break;

		
		
		
		
		}
		
	}
