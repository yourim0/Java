import java.util.Random;
import java.util.Scanner;

public class LoopTest { // 0921 반복문

	public static void main(String[] args) {
		// 반복문 : 실행문을 여러번 동작하게 한다.
		// for, while, do-while(보통 잘 안씀)

//		for(초기문; 조건식; 증감식) {
//			실행문
//		}

//		for(int i=0; i<10; i++) {
//			System.out.println(i + "Hello");
//		}
//		System.out.println();

//		for(int i =0; i<10; i+=2) { //0,2,4,6,8 다섯번만 동작
//			System.out.println(i + " : hello");
//		}

//		for(int i=10;i>0;i--) {
//			System.out.println(i + " : hello");
//		}

//		for(;true;) { // 조건이 항상 true이기 때문에 무한 반복
//			System.out.println("hello");
//		}

//		int k = 1;
//		for(int i=1; i<=10;i++) {
//			System.out.println(k++);
//		}

		// 1부터 10사이의 정수값중 짝수만 출력

//		for(int i=1; i<=10;i++) {
//			if(i%2 == 0) {
//			System.out.println(i);
//			}
//		}

		/*
		 * int k = 0; for(int a=1;a<=10;a++) { k = k+a; System.out.println(k); }
		 */

		// 1~10 까지의 정수중 홀수에 합과 짝수합을 구해서 출력
		// 반복문 하나

		/*
		 * int a=0; int b=0;
		 * 
		 * for(int i=1;i<=10;i++) { if(i%2==0) { a += i; }else { b += i; } }
		 * System.out.println("홀수합:"+a+"짝수합:"+b);
		 */

		/*
		 * i가 6의 배수인경우 6의배수 출력, 홀수경우 홀수 출력, 그외 출력 x int i = 12;
		 * 
		 * if (i % 2 == 0) { if (i % 3 == 0) { System.out.println("6의배수"); } else {
		 * System.out.println(""); } } else { System.out.println("홀수"); }/*
		 * 
		 * // while문
		 * 
		 * /* int j = 1; while(j<=10) { System.out.println(j); j++; }
		 * 
		 * 
		 * int o = 10; while(o > 0){ System.out.println(o); o--; }
		 * 
		 * int sum = 0; int p =1; while(i <= 10) { sum += p; System.out.println(sum); }
		 */

		// while문의 무한 루프
		// while(true){
		// System.out.println("hello");
		// }

		/*
		 * boolean flag = true; int cnt = 0; while(flag) { //cnt++;
		 * //System.out.println(cnt); if(cnt > 100) { flag = false; //flase로 바뀌면 멈춤 }
		 * //cnt++; //System.out.println(cnt); }
		 */

		// 중첩 for문 i*j번반복
		/*
		 * int k =1;
		 *  for (int i = 0; i < 5; i++) {
		 *   for (int j = 0; j < 5; j++) {
		 * System.out.println(i+","+j);
		 *  } 
		 * }
		 */

		// 구구단 출력하기

//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "x" + j + "=" + (i * j));
//			}
//		}
		
		// 단의 값이 나중에 변함
//		for (int l = 1; l < 10; l++) {
//			for (int f = 2; f < 10; f++) {
//				System.out.print(f + "x" + l + "=" + (f * l) + " ");
//			}
//			System.out.println();
//		}

		//while문의 중첩5*5
//		int i =0;
////		int j =0; //while문 안에서 초기화 해야함
//		int b=1;
//		
//		while(i<5) { //j변수 while문 밖에 선언,초기화하면 바깥 while문 다 돌고나서 j값 초기화되지 않아서 끝나버림
//			int j =0; 
//			while(j<5) {
//				System.out.println(b++);
//				j++;
//			}
////			System.out.println(i);
//			i++;
//		}
		//System.out.println(i+","+j);
		
		
		
		
		//구구단, 옆으로구구단 출력
//		int i =2;
//		//int j =1;
//		
//		while(i<10) {
//			int j =1; 
//			while(j<10) {
//				System.out.println(i+"*"+j+"="+(i*j));
//				j++;
//			}
//			i++;
//		}

		
//		//옆으로구구단 출력
//		
//		int i =1; 
//		
//		while(i<10) { //단
//			int j =2; 
//			while(j<10) { //곱값
//				System.out.print(j+"*"+i+"="+(j*i)+" ");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
	//사용 예제1
		//	for(int i=0, j=10; i<10; i++, j--) {
	//		System.out.println("i:"+i+"  j:"+j);
	//	}
		
		//사용 예제2 ---		반복문에서 선언된 변수는 블록 밖에서 존재할 수 없음 : 지역변수. 밖에서 쓰고 싶으면 int i;식으로 선언만 해놓으면 사용 할 수 있다
//		int s = 0;
//		int i; //반복문에서 선언된 변수는 블록 밖에서 존재할 수 없음 : 지역변수. 밖에서 쓰고 싶으면 int i;식으로 선언만 해놓으면 사용 할 수 있다
//		
//		for(i=0; i<10;i++,s++) { //초기화만 for문 안에서.(int i-0->i=0;)
//			System.out.println("i : "+i+"  s : "+s);
//		}
//		System.out.println(i);
		
		
		//do while문
		
//		int i =11;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);
//	

		//연습 1+(1+2)+(1+2+3)---------(1+2+3+----+10)출력
		
//		int a=0;
//		int b=0;
//		int c=0;
//		
//		for(int i=1;i<11;i++) {			
//			a = a+i; //1,2,3,4,5....
//			b = b+a;//1,1+2,
//			}
//		System.out.println(b);
//		
		
		//2
		
//		int sum = 0;
//		int tot = 0;
//		for(int x=1;x<=10;x++) {
//			sum += x; //(0+1)(0+1+2)(0+1+2+3)(0+1+2+3+4)
//			tot += sum;
//		} 
//		System.out.println(sum);//55
//		System.out.println(tot);//220	
		
		
		
		
		
	//do while문 중첩구조 잘안씀
//		do {
//			do {
//				
//			}while();
//		}while();
		
	
		//반복문의 제어 : break(반복문을 강제종료), continue
		//조건문 내에서 사용. 
		
//		for(int i=1;i<=10;i++) {
//			if(i > 5) {
//				break;
//			}
//			System.out.println(i);
//		}
		
//		int k=1;
//		for(int i =0;i<5;i++) {
//			System.out.println("i= "+i);
//			for(int j=0;j<5;j++) {
//				System.out.println("k=:"+k++);
//				if(k % 3 == 0){
//					break;
//				}
//
//			}
//		}
		
		//반복문의 제어 : continue -----------------------------------------0922
//		for(int i=1;i<=10;i++) {
//			if(i%2 ==1) {
//				continue;
//			}
//			System.out.println(i); //문장에 대한 출력을 제어
//		}
		
		//12345 -> 1+2+3+4+5 -> 15
		
		//몇번 반복해야할지 모르니까 while문 추천
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int sum = 0;
//		
//		while(num > 0) {
//			sum += num % 10;
//			num = num / 10;
//		}
//		System.out.println(sum);
		
		//%, /를 반복
		//12345 % 10 => 5
		//12345/ 10 => 1234
		//1234%10 -> 4
		//1234%10 -> 123
		
		//num>0 될때까지
		
		
		
		//앞부터 추출
		
		
		//방적식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
		//0<=x<=10, 0<=y<=10 이다. 
		//실행결과 :
		//x=1, y=2
		//x=3, y=1
		//x=5, y=0
		
//		
//		for(int i=0;i<=10;i++) {
//			for(int j = 0; j<=10;j++) {
//				if((2*i) + (4*j) == 10) {
//					System.out.println("i="+i+"j="+j);
//
//						}
//			}
//		}
		
		
		//1+(-2)+3+(-4)+...과 같은 식으로 더햇을 때 몇까지 더해야 총합이 100이상(넘어가는 첫번재 시점)이 되는지 출력하세요.
		
		
	//if((a-b)>=100) {
	//System.out.println("100넘음");
		
		//짝수만 음수 //홀수만 더했을 때 - 짝수만 더했을때 = 100
//		int sum =0;
//		int s =1;
//		int num = 0;
//		int i;
//		for(i =1;true;i++,s=-s) { //반복후작업문
//			num = s * i;
//			System.out.println("num"+num);
//			sum += num;
//			System.out.println("sum"+sum);
//			if(sum >=100) {
//				break;
//			}
//		}
//		
		//무한반복에서 빠져나오기
	/*	Scanner sc = new Scanner(System.in);
		int sel;
		while(true) {
			System.out.println("번호를 선택하세요");
			System.out.println("1.빨간색 2. 녹색 3.파란색 4.종료");
			sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.println("빨간색선택");
			}else if(sel ==2) {
				System.out.println("녹색선택");
			}else if(sel == 3) {
				System.out.println("파란색선택");
			}else if(sel == 4) {
				break;
			}
	
	}*/
		
		
		//내가 이길 때 까지 하는 가위바위보 
		//난수 (랜덤): math.random() 0.0 <= r <1.0 (0.0~0.999~)
		
		//System.out.println(Math.random());
		//Math.random () * 10 -> 0.0 -> 9.9999
		//(int)Math.random () * 10 -> 0-9
		//(int)Math.random () * 10 + 1 -> 1-10
		
		//System.out.println((int)(Math.random()*10) +1);
		//(int)(Math.randon()*난수의개수(난수의 최대값 -난수의 최소값)) + 난수의 최소값
		//(int)(Math.randon()*3)+1 
	
		//기회 3번, 3번내에 1번이라도 맞추면 종료
/*		int com;
		int me;	
		int random =(int)(Math.random()*3)+1 ;
		int wincnt = 0; //이긴수
		int challenges = 0; //전체도전횟수
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			if(challenges == 3) {
				System.out.println("3번기회 모두 사용하셨습니다.");
				break;
			}
			
			com = random;
			System.out.println("1.가위 2.바위 3.보 : ");
			me = sc.nextInt();
			
			int result = com - me;
			
			if(result == -1 || result ==2) {
				wincnt++;
				System.out.println("you win");
				if(wincnt == 2) {
					break; 
				}
				break;
			}else if(result == 0){
				challenges++;
				System.out.println("tie break");
			}else {
				challenges++;
				System.out.println("you lose");
			}
				
		}*/
		

		
		//Random random = new Random();
		//System.out.println(random.nextInt(3)+1);
		
		
		
		/*	System.out.println("com : "+ com + " me: "+me);
			if(com == me) {
				System.out.println("동점.");
				}else if((com == 1 && me == 2) || (com == 2 && me ==3) || (com == 3 && me ==1)){
					System.out.println("내가 win");
					break;
				}else if((com == 1 && me == 3) || (com == 2 && me ==1)|| (com == 3 && me ==2)){
				System.out.println("내가 lose");
				}else {
					
				} */
		

		for(int i=4;i>1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}System.out.println("");
		}

		
		
			
		}

}


