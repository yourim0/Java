import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest { //0922:array

	public static void main(String[] args) {
		//�迭 : ������ Ÿ���� ������ ������ ���� �ϴ� ��
		
	/*	int[] arr; //�迭�� ����
		arr = new int[5]; //�迭�� ����. 5���� ���� �Ŷ�� ��
		arr[0] = 10; //�ε����� Ȱ���� �� �Ҵ�
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		
	// ������	
	//	int[] arr; //�迭�� ���� ��
	//	arr = new int[5]; //�迭�� ����
		
	//	int[] arr = new int[5]; ����� ������ ���ÿ�
		
	//	int[] arr = {10,20,30,40,50};//�����, ������ ���� �ʱ�ȭ�� ���ÿ�!!!
		
		
	
		
//	//����
//	char[] cArr = new char[4];
//	//char[] cArr = {'G','o','o','d'}
//	
//	
//	cArr[0] = 'G';
//	cArr[1] = 'o';	
//	cArr[2] = 'o';
//	cArr[3] = 'd';
//	
//	//�ε��� ������ ����
//	System.out.println(cArr[3]); //3�� �ε����� d ����
	
//	//���ڿ�
//	
//	String[] strArr = {"Java","jsp","db"};
//	//�ε��� ������ ����
//	System.out.println(strArr[3]); //3�� �ε����� d ����
//	strArr[2] = "html"; //�� ���氡��
	
//	int x =10;
//	int y = x; //ġȯ
//	
//	y=x;
//	
//	
//	int[] a = {1,2,3,4,5};
//	int[] b =a; //�迭 ������ �ּҰ��̴�.
//			System.out.println(a);
//			System.out.println(b);
//	
//		
//	a[3] = 10;
//	System.out.println(a[3]);
//	System.out.println(b[3]);
	
	
	//0923--------------------------------�迭�� Ȱ��
	//�迭�� �⺻������ �ε��� 0������ ����ó���Ѵ� 
	//�ݺ����̶� ¦��
//	
//	int[] arr = new int[5];
//		//����
//	for(int i=0;i < 5;i++) {
//		arr[i] = 1;
//	}
//	
//	//�б�
//	for(int i=0;i < arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	

//		int[] arr = new int[10];
//		
//		//1-10���� ��������
//		for(int i=0; i<arr.length;i++) {
//			arr[i]=i+1;
//		}
//	
//		
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			sum += arr[i];
//		}
//		System.out.println(sum);
//		
//		//Ȧ����,¦���� ���ϱ�
//		
//		int h = 0;
//		int j = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] % 2 == 0) {
//				h += arr[i];
//			}else {
//				j += arr[i];
//			}
//		}System.out.println("¦����" + h);
//		System.out.println("Ȧ���� " + j);
		
		//���� 3-8 : �迭ũ�⸸ŭ ������ �Է¹ް� ����� ���϶�
		
//		Scanner sc = new Scanner(System.in);
//		int num =0;
//		int avg =0;
//		
//		int[] arr1 = new int[10];
//		for(int i=0; i<arr1.length;i++) {
//			num = sc.nextInt();
//			avg += num;
//		}System.out.println("����� : "+ avg/arr1.length);
//		
		
		//for(���� : �迭������){ for���� ���׷��̵� ���� 
		//���๮
		//}
		
		
		//for each �� :�迭�� ������ ���� ���ǵ� ���� ���� �Ϳ� ���
		//for(int i : arr){ 
		//System.out.println(i);
		//}
		
//		int[] arr = {1,2,3,4,5};
//		
//		int sum = 0;
//		for(int i : arr) {
//			sum += i;
//		}
//		
//		
//		String[] str = {"���","����","����"};
//		for(String f : str) {
//			System.out.println(f);
//		}
		
		
		

		
		//���� 1~100 ���̰� �߿� 10���� �迭 ������ �ʱ�ȭ �Ѵ�. 
		//�迭�� ���� ����Ѵ�.
//		int i;
//		int[] arr = new int[10];
//		for(i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random() *100)+1;
//			System.out.println(arr[i]);
//		}
//		
//	
//		//�� �������� ���� ū ���ڸ� ã�ƶ�
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int a=0;a<arr.length;a++) {		
//			if(max < arr[a]) {
//				max = arr[a];
//			}else if(min > arr[a]) {
//				min = arr[a];
//			}
//		}
//		System.out.println("max����:"+max);
//		System.out.println("min����:"+min);

	
		//�迭�� ���� ���� ��� �� �ֳ�
		//0-9������ ���� �Է�
		
//		int arr[] = new int[10];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random() *10);
//		}
//
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
//		
//		int arrCnt[] = new int[10];
//		for(int i=0;i<arr.length;i++) {		
//			for(int j=0;j<arr.length;j++) {
//				if(j == arr[i]) {
//					arrCnt[j]++;
//				}
//			}
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(i +"-"+ arrCnt[i]);
//		}
//		
//		//����
//		int arr[] = new int[10]; //�⺻�� 0���� �ʱ�ȭ
//		int arrCnt[] = new int[10]; //�⺻�� 0���� �ʱ�ȭ
//		
//		for(int i=0;i<arr.length;i++) {
//			arrCnt[arr[i]]++;
//		}
		
		
		//���鼭 ������ ���ڰ� ũ�� �� �ε����� ī��Ʈ�� �ö�
		//������ �´� ��� ���
//		int[] score = {60,70,80,90,75,85,95,50,45,30};
//		int[] rank = {1,1,1,1,1,1,1,1,1,1};
//		for(int i=0;i<score.length;i++) {//score
//			for(int j=0;j<score.length;j++) { //num(i)++
//				if(score[i]<score[j]) {
//					rank[i]++;
//			}
//
//			}
//}
//		for(int i=0;i<score.length;i++) {
//		System.out.println(score[i] + "����"+ rank[i]+"���Դϴ�.");
//		}
//		
		
		//���� ������� �����ϰ� ���� �� (������(��������) -> ū��(��������) : ����
//		int[] arr = {2,4,1,5,3};
//		
//		//���� �� �ΰ��� ����
//		for(int i=0;i<arr.length * 5;i++) {
//			int x = (int)(Math.random()*5);
//			int y = (int)(Math.random()*5);
//		
//			int tmp;
//			tmp = arr[x];
//			arr[x]=arr[y];
//			arr[y]=tmp;
//		
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+", ");
//		}
		
		
		//���� ��ȯ (swap)
//		int x = 10;
//		int y =20;
//		int tmp = 0;
//		
//		tmp =x;
//		x = y;
//		y =tmp;
		

		
		//�ް��̶� ���ؼ� ������ ������ �ڸ� �ٲ� 
//		int[] arr = {2,4,1,5,3};
//		int tmp = 0;
//		for(int i=0;i<arr.length;i++){
//			for(int j=i+1;j<arr.length;j++) {//	�񱳰� ���� ������ ��
//				if(arr[i]<arr[j]) {
//					tmp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=tmp;
//				}
//			}System.out.print(arr[i]);
//		}
		
		
		//�޴��� ���� ���� �� ������� �̸�, �޴��� ���
//		String[] name = {"ȫ�浿","�����","�迬��"};
//		int[] medal = {3,2,10};
//		
//		for(int i=0;i<medal.length;i++) {
//			for(int j=i+1;j<medal.length;j++) {
//				if(medal[i]<medal[j]) {
//					int tmp;
//					tmp = medal[i];
//					medal[i] = medal[j];
//					medal[j] = tmp;
//					
//					String tmp2;
//					tmp2 = name[i];
//					name[i] = name[j];
//					name[j] = tmp2;
//					
//				}
//			}System.out.println(name[i]+"�޴�"+medal[i]+"��"+(i+1)+"��");
//		}
		
		
		//2�����迭 - ������, ��������
		
//		int[][] score;//����
//		score = new int[5][3]; //����
		
		//����� ���ÿ� �ʱ�ȸ
		//int[][] score = new int[5][3];
		//score[4][2] = 15; //�� ����
		//System.out.println(score[0][0]);  ���
		//{}����� ���� == ���� ����, ex)[5][3] 5��,3��. 5�����, ��ϴ� 3�� ��
		
		//���
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(score[i][j]+ "  ");
//			}
//			System.out.println();
//		}
		

//		
////		int[][] arr = new int[5][3];
//		int[][] a ={
//		{1,2,3},
//		{4,5,6},
//		{3,4,3},
//		{1,3,4},
//		{6,4,3}};
//		
//		
//		
////		System.out.println(a[2][2]);
//		
//	    ArrayList<String> cars = new ArrayList<String>();
//	    cars.add("Volvo");
//	    cars.add("BMW");
//	    cars.add("Ford");
//	    cars.add("Mazda");
////	    for (String i : cars) {
////	      System.out.println(i);
////	    }
//	    System.out.println(cars.toString());
	
		//2���� �迭 4�Ⱓ ��ü ���� ���
//		double score[][] = {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
//		double sum =0;
//		double avg =0;
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				sum += score[i][j];
//			}
//		}
//		int n = score.length; //4
//		int m = score[0].length;//2
//		System.out.println(sum);
//		System.out.println(sum/n*m);
		

//		i<score.length //���� ũ��
//		j<score[0].length //���� ������Ű�� ���� ũ��
		
		
		//------------------------------------------------0926 2���� �迭
		
		
//		int[][] score = {{1,2,3},{4,5,6},{7,8,9}};
//		
//		for(int i =0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++){
//				System.out.println(score[i][j]+ " ");
//			}
//		}
//		
//			
//		
//		//2�����迭���� �迭 ��ĭ��ǥ���ߴٴ� �� ���� ��ġ���� ���ڴٴ� ��
//		for(int[] i: score) { //i�� 1���� �迭(���� �ּҰ�)
//			for(int j : i) { //���� �࿡�ִ� ������ 
//				System.out.println(j+" ");
//			}
//			
//		}
		
		

	//������ ũ�Ⱑ 10�� �迭 ����,�� �־��ֱ�
		//int num =1;
//		int[][] arr = new int[2][5];
//		
//		for(int i=0;i<arr.length;i++) {//0,1
//			for(int j=0;j<arr[i].length;j++) {//0,1,2,3,4
//				arr[i][j] = (i*5) + j+1;//num++; //678910
//			}
//		}
//	
//	
//		for(int[] i : arr) {
//			for(int j : i) {
//			System.out.print(j+" ");	
//			}
//			System.out.println();
//		}
	
		
		//�ݺ����� �̿��ؼ� 15�迭�� 1~15���� �Է��ϱ�
//		int[][] arr = new int [5][3];
//		for(int i=0; i<arr.length;i++) { //0,1,2,3,4
//			for(int j=0;j<arr[i].length;j++) { //0,1,2
//				arr[i][j] = (i*3)+j + 1;
//			}
//		}
//		
//		for(int[] i : arr) { //arr �迭���� i�� �ุŭ? 
//			for(int j : i) {    //i�� ���� ����ŭ 0,1,2,3,4
//				System.out.print(j + " ");
//			}System.out.println();
//		}
		
		/*
			* 0.0
			** 1.0 1.1
			*** 2.0 2.1 2.2
			**** 3.0 3.1 3.2 3.3
			***** 4.0 4.1 4.2 4.3
		*/
		
//		char[][] star = new char[5][5];
		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i >= j) {
//					star[i][j] = '*';	
//				}
//			}
//		}
//		
		
		//���� ���� �ִ� ���
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) {
//				if(i+j <=4) {
//					star[i][j] = '*';	
//				}
//			}
//		}
		

		
		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}System.out.println();
//		}
		
		
		//�Ϲ� for������ ����°Ŷ� ��� ����
		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) { //�ٽõ����� �� -1��
//					star[i][j] = '*';	
//			}
//		}		
		
	/*	
		    * 0.4 
		   ** 1.3 1.4
		  *** 2.2 2.3 2.4
		 **** 3.1 3.2 3.3 3.4
		***** 4.0 4.1 4.2 4.3 4.4
		
		*/
		
//		for(int i=0;i<star.length;i++) {
//		for(int j=0;j<star[i].length;j++) {
//			if(i+j >=4) {
//				star[i][j] = '*';
//			}	
//			}};
//			
//			
//				for(char[] i : star) {
//				for(char j : i) {
//					System.out.print(j + " ");
//				}System.out.println();
//			}
		
		
				
				/*	
					    * 0.4
					   *** 1.3 1.4 1-5 
					  ***** 2.2 2.3 2-4
					 ******* 3.1-7
					*********4.0-8
					
					*/
		
		
		//char[][] star = new char[5][9];
//		for(int i=0;i<star.length;i++) {
//		for(int j=0;j<star[i].length;j++) {
//			if(j-i <= 4 && j+i >= 4) {
//				star[i][j] = '*';
//			}
//		}
//				}
		

		
		//������ �̿��� �� �����
//		-----------------------------------------����Ȯ��
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� ũ�⸦ �Է��ϼ���: ");
//		int row = sc.nextInt(); //�Է��� ���� ũ��
//		int col = row * 2 -1; //�࿡ ���� ���� ũ�� 
//		
//		char[][] star = new char[row][col];
//		
//		for(int i=0;i<star.length;i++) {//0�ε� 7�� �ݺ��Ұ�
//			int starCnt = 2*i+1;  				//���� ���� ���� 1,3,5,7,9 //3
//			int starStart = star.length - (i+1); //���̵��� ������ 4,3,2,1,0([5][9]�϶� //5
//			for(int j=starStart;j<starStart + starCnt;j++) {//6+1 �� �ݺ�/7
//			star[i][j] = '*';
//			}
//	
//		}
//
//		
//		for(char[] i : star) {
//			for(char j : i) {
//				System.out.print(j + " ");
//			}System.out.println();
//		}
//
//		
//	
	
		/*	char[][] star = { //4,5
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'},
			};*/
	
	
/*	for(int i=0;i<star.length;i++) {
		for(int j=0;j<star[i].length;j++) {
			System.out.print(star[i][j]);
		}
		System.out.println();
	}*/
	
	
	
	
	//90�� ȸ���ؼ� �Է� :�ε�����ȣ�� Ǯ �� ����. �𸣰����� �׸��׷��� Ȯ��
//	****
//	****
//	**
//	**
//	**
	/*	char[][] result = new char[star[0].length][star.length]; //5.4
	

	for(int i=0;i<star.length;i++) {
		for(int j=0;j<star[i].length;j++) {
			int x=j;
			int y=3-i;
			result[x][y] = star[i][j];
		}
	}
	
	
	for(char[] i : result) {
		for(char j : i) {
			System.out.print(j);
		}System.out.println();
	}} */
	
	
	//5���л��� ������ ����
//	int[][] score= {
//			{10,10,10},
//			{20,20,20},
//			{30,30,30},
//			{40,40,40},
//			{50,50,50}
//	};
//
//	
//	System.out.println("��ȣ ���� ���� ���� ���� ���");
//	
//	
//	
//	int korTot =0;
//	int engTot=0;
//	int math=0;
//	int total=0;
//	for(int i=0; i<score.length;i++) {
//		//�ѹ��� ��µǸ� �Ǵ� ����
//		korTot += score[i][0];
//		engTot += score[i][0];
//		math += score[i][0];
//		double avg=0;
//		int sum=0;
//		for(int j=0; j<score[i].length;j++) {
//			sum += score[i][j];
//			System.out.print(" "+score[i][j]);
//		}
//		avg = sum/score[i].length;
//		System.out.print(" "+sum);
//		System.out.print(" "+avg);
//		System.out.println();
//	}
//	total = korTot+engTot+math;
//	System.out.println("�հ� :" + " "+korTot+" "+engTot+" "+math+" "+total);

	
	//������
	//��ȣ ���� ���� ���� ���� ���
	//1	 10	 10  10 30 10.0
	//2  20  20  20 60 20.0
	
	//�հ� 150 150 150 450
	
	
		//25�� ¥�� �������迭 ����
		//������� �����
		int[][] bingo = new int[5][5];
	
		//1-50������ ������ �ʱ�ȭ
		for(int i=0;i<bingo.length;i++) {
			for(int j=0; j<bingo[i].length;j++) {
				bingo[i][j] = (int)(Math.random() *50)+1;
			}
		}
	
		
		for(int i=0;i<bingo.length;i++) {
			for(int j=0; j<bingo[i].length;j++) {
				System.out.print(bingo[i][j]+" ");
			}System.out.println();
			
		}
	
	
	//���� �Է��ϰ� �迭�� ���� ���� ������ 0���� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(true) {
		System.out.println("�Է��ϼ���");
		int a = sc.nextInt();
		for(int i=0;i<bingo.length;i++) {
			for(int j=0; j<bingo[i].length;j++) {
				if(bingo[i][j] == a) {
					bingo[i][j] = 0;
					
			}
				System.out.print(bingo[i][j]+" ");
			}System.out.println();
		}	
			for(int i=0;i<bingo.length;i++) {
				for(int j=0; j<bingo[i].length;j++) {
					if(bingo[i][j] == 0) {
						flag = false;
			}
				}
		}	}
	//�迭���� ��� 0�̸� ����
	
	
//	
//		Scanner sc = new Scanner(System.in);
//		boolean flag = true;
//		int num;
//		while(flag) {
//			System.out.println("�����Է�:");
//			num = sc.nextInt();
//			
//			for(int i=0;i<bingo.length;i++) {
//				for(int j=0; j<bingo[i].length;j++) {
//					if(bingo[i][j]==num) {
//						bingo[i][j] =0;
//					}
//				System.out.println(bingo[i][j]+" ");
//			}
//				System.out.println();
//			}
//		}
//	
//		

		/*
		 * boolean flag = true;
		 * int cnt = 0;
		 * while(flag) {
		 * cnt++;
		 * System.out.println(cnt);
		 * if(cnt > 100) { 
		 * flag = false; //flase�� �ٲ�� ���� }
		 * cnt++; 
		 * System.out.println(cnt); 
		 * }
		 */
		

		
	

	
}
}