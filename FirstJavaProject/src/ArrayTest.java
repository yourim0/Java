import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest { //0922:array

	public static void main(String[] args) {
		//배열 : 동일한 타입의 변수를 여러개 정의 하는 것
		
	/*	int[] arr; //배열의 선언
		arr = new int[5]; //배열의 생성. 5개를 담을 거라는 뜻
		arr[0] = 10; //인덱스를 활용한 값 할당
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
		
		
	// 숫자형	
	//	int[] arr; //배열의 선언 후
	//	arr = new int[5]; //배열을 생성
		
	//	int[] arr = new int[5]; 선언과 생성을 동시에
		
	//	int[] arr = {10,20,30,40,50};//선언과, 생성과 값의 초기화를 동시에!!!
		
		
	
		
//	//문자
//	char[] cArr = new char[4];
//	//char[] cArr = {'G','o','o','d'}
//	
//	
//	cArr[0] = 'G';
//	cArr[1] = 'o';	
//	cArr[2] = 'o';
//	cArr[3] = 'd';
//	
//	//인덱스 값으로 접근
//	System.out.println(cArr[3]); //3번 인덱스의 d 추출
	
//	//문자열
//	
//	String[] strArr = {"Java","jsp","db"};
//	//인덱스 값으로 접근
//	System.out.println(strArr[3]); //3번 인덱스의 d 추출
//	strArr[2] = "html"; //값 변경가능
	
//	int x =10;
//	int y = x; //치환
//	
//	y=x;
//	
//	
//	int[] a = {1,2,3,4,5};
//	int[] b =a; //배열 변수는 주소값이다.
//			System.out.println(a);
//			System.out.println(b);
//	
//		
//	a[3] = 10;
//	System.out.println(a[3]);
//	System.out.println(b[3]);
	
	
	//0923--------------------------------배열의 활용
	//배열은 기본적으로 인덱스 0번부터 순차처리한다 
	//반복문이랑 짝꿍
//	
//	int[] arr = new int[5];
//		//쓰기
//	for(int i=0;i < 5;i++) {
//		arr[i] = 1;
//	}
//	
//	//읽기
//	for(int i=0;i < arr.length;i++) {
//		System.out.println(arr[i]);
//	}
	

//		int[] arr = new int[10];
//		
//		//1-10까지 넣으세요
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
//		//홀수합,짝수합 구하기
//		
//		int h = 0;
//		int j = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] % 2 == 0) {
//				h += arr[i];
//			}else {
//				j += arr[i];
//			}
//		}System.out.println("짝수합" + h);
//		System.out.println("홀수합 " + j);
		
		//예제 3-8 : 배열크기만큼 정수를 입력받고 평균을 구하라
		
//		Scanner sc = new Scanner(System.in);
//		int num =0;
//		int avg =0;
//		
//		int[] arr1 = new int[10];
//		for(int i=0; i<arr1.length;i++) {
//			num = sc.nextInt();
//			avg += num;
//		}System.out.println("평균은 : "+ avg/arr1.length);
//		
		
		//for(변수 : 배열변수명){ for문의 업그레이드 버전 
		//실행문
		//}
		
		
		//for each 문 :배열의 구조를 가진 정의된 값을 가진 것에 사용
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
//		String[] str = {"사과","딸기","포도"};
//		for(String f : str) {
//			System.out.println(f);
//		}
		
		
		

		
		//난수 1~100 사이값 중에 10개를 배열 값으로 초기화 한다. 
		//배열의 값을 출력한다.
//		int i;
//		int[] arr = new int[10];
//		for(i=0;i<arr.length;i++) {
//			arr[i] = (int)(Math.random() *100)+1;
//			System.out.println(arr[i]);
//		}
//		
//	
//		//이 데이터중 가장 큰 숫자를 찾아라
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
//		System.out.println("max값은:"+max);
//		System.out.println("min값은:"+min);

	
		//배열에 같은 수가 몇번 들어가 있나
		//0-9까지의 난수 입력
		
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
//		//최종
//		int arr[] = new int[10]; //기본값 0으로 초기화
//		int arrCnt[] = new int[10]; //기본값 0으로 초기화
//		
//		for(int i=0;i<arr.length;i++) {
//			arrCnt[arr[i]]++;
//		}
		
		
		//돌면서 나보다 숫자가 크면 내 인덱스의 카운트는 올라감
		//점수에 맞는 등수 출력
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
//		System.out.println(score[i] + "점은"+ rank[i]+"등입니다.");
//		}
//		
		
		//값을 순서대로 나열하고 싶을 때 (작은값(오름차순) -> 큰값(내림차순) : 정렬
//		int[] arr = {2,4,1,5,3};
//		
//		//랜덤 값 두개로 섞기
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
		
		
		//값의 교환 (swap)
//		int x = 10;
//		int y =20;
//		int tmp = 0;
//		
//		tmp =x;
//		x = y;
//		y =tmp;
		

		
		//뒷값이랑 비교해서 나보다 작으면 자리 바꿈 
//		int[] arr = {2,4,1,5,3};
//		int tmp = 0;
//		for(int i=0;i<arr.length;i++){
//			for(int j=i+1;j<arr.length;j++) {//	비교값 다음 값부터 비교
//				if(arr[i]<arr[j]) {
//					tmp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=tmp;
//				}
//			}System.out.print(arr[i]);
//		}
		
		
		//메달을 가장 많이 딴 사람부터 이름, 메달을 출력
//		String[] name = {"홍길동","손흥민","김연아"};
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
//			}System.out.println(name[i]+"메달"+medal[i]+"개"+(i+1)+"등");
//		}
		
		
		//2차원배열 - 정방형, 비정방형
		
//		int[][] score;//선언
//		score = new int[5][3]; //생성
		
		//선언과 동시에 초기회
		//int[][] score = new int[5][3];
		//score[4][2] = 15; //값 선언
		//System.out.println(score[0][0]);  출력
		//{}블록의 개수 == 행의 개수, ex)[5][3] 5행,3열. 5개블록, 블록당 3개 값
		
		//출력
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
	
		//2차원 배열 4년간 전체 평점 평균
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
		

//		i<score.length //행의 크기
//		j<score[0].length //행이 가리기키는 열의 크기
		
		
		//------------------------------------------------0926 2차원 배열
		
		
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
//		//2차원배열에서 배열 한칸만표현했다는 건 행의 위치값을 쓰겠다는 것
//		for(int[] i: score) { //i는 1차원 배열(행의 주소값)
//			for(int j : i) { //실제 행에있는 데이터 
//				System.out.println(j+" ");
//			}
//			
//		}
		
		

	//공간의 크기가 10인 배열 생성,값 넣어주기
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
	
		
		//반복문을 이용해서 15배열에 1~15까지 입력하기
//		int[][] arr = new int [5][3];
//		for(int i=0; i<arr.length;i++) { //0,1,2,3,4
//			for(int j=0;j<arr[i].length;j++) { //0,1,2
//				arr[i][j] = (i*3)+j + 1;
//			}
//		}
//		
//		for(int[] i : arr) { //arr 배열에서 i의 행만큼? 
//			for(int j : i) {    //i의 각행 열만큼 0,1,2,3,4
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
		
		//별을 열에 넣는 방법
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
		
		
		//일반 for문으로 별찍는거랑 비슷 연습
		
//		for(int i=0;i<star.length;i++) {
//			for(int j=0;j<star[i].length;j++) { //다시들어왔을 때 -1씩
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
		

		
		//공차를 이용한 식 만들기
//		-----------------------------------------공식확인
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("행의 크기를 입력하세요: ");
//		int row = sc.nextInt(); //입력한 행의 크기
//		int col = row * 2 -1; //행에 따른 열의 크기 
//		
//		char[][] star = new char[row][col];
//		
//		for(int i=0;i<star.length;i++) {//0인데 7번 반복할거
//			int starCnt = 2*i+1;  				//별이 들어가는 개수 1,3,5,7,9 //3
//			int starStart = star.length - (i+1); //별이들어가는 시작점 4,3,2,1,0([5][9]일때 //5
//			for(int j=starStart;j<starStart + starCnt;j++) {//6+1 번 반복/7
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
	
	
	
	
	//90도 회전해서 입력 :인덱스번호로 풀 수 있음. 모르겠으면 그림그려서 확인
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
	
	
	//5명학생의 국영수 점수
//	int[][] score= {
//			{10,10,10},
//			{20,20,20},
//			{30,30,30},
//			{40,40,40},
//			{50,50,50}
//	};
//
//	
//	System.out.println("번호 국어 영어 수학 총점 평균");
//	
//	
//	
//	int korTot =0;
//	int engTot=0;
//	int math=0;
//	int total=0;
//	for(int i=0; i<score.length;i++) {
//		//한번만 출력되면 되는 숫자
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
//	System.out.println("합계 :" + " "+korTot+" "+engTot+" "+math+" "+total);

	
	//실행결과
	//번호 국어 영어 수학 총점 평균
	//1	 10	 10  10 30 10.0
	//2  20  20  20 60 20.0
	
	//합계 150 150 150 450
	
	
		//25개 짜리 이차원배열 생성
		//빙고게임 만들기
		int[][] bingo = new int[5][5];
	
		//1-50사이의 난수로 초기화
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
	
	
	//값을 입력하고 배열의 같은 값이 있으면 0으로 변경한다.
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(true) {
		System.out.println("입력하세요");
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
	//배열값이 모두 0이면 멈춤
	
	
//	
//		Scanner sc = new Scanner(System.in);
//		boolean flag = true;
//		int num;
//		while(flag) {
//			System.out.println("숫자입력:");
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
		 * flag = false; //flase로 바뀌면 멈춤 }
		 * cnt++; 
		 * System.out.println(cnt); 
		 * }
		 */
		

		
	

	
}
}