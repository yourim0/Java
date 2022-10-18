import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 가위바위보 scanner, if-else //숫자로하는법 경우수9개
//		Scanner sc = new Scanner(System.in);
//		System.out.println("가위바위보 중 하나를 입력하세요");
//		System.out.print("철수 >>");
//		String C = sc.next();
//		System.out.print("영희 >>");
//		String Y = sc.next();
//		
//		if(C.equals("가위") && Y.equals("보")) {
//			System.out.println("철수가 이김");
//		}else if(C.equals("가위") && Y.equals("주먹")){
//			System.out.println("영희가 이김");
//		}else if(C.equals("보") && Y.equals("주먹")) {
//			System.out.println("철수이김");
//		}else if(C.equals("보") && Y.equals("가위")) {
//			System.out.println("영희이김");
//		}else if(C.equals("주먹") && Y.equals("보")) {
//			System.out.println("영희이김");
//		}else if(C.equals("주먹") && Y.equals("가위")) {
//			System.out.println("철수이김");	
//		}else if(C.equals(Y)){
//			System.out.println("비김");
//	
//		}
//		

//		System.out.println("금액입력:");
//		int kor = sc.nextInt();
//		int doller = 1100;
//		double rsl = kor / doller;
//		
//		System.out.println("원화는  $:"+rsl);
//		

//		System.out.println("2자리 정수 입력: (10-99)");
//		int kor = sc.nextInt();
//		if((kor/10) == (kor%10)) {
//			System.out.println("동일");
//		}else {
//			System.out.println("틀림");
//		}
//	
		// if문
//		System.out.println("금액");
//		int kor = sc.nextInt();//77000
//	
//		int a = kor/50000;//1
//		//kor = kor-a*50000;
//		System.out.println("오만원:"+a);
//		

//		int num=sc.nextInt(); if???????????????
//		
//		System.out.println("50000won"+num/50000+"mae");
//		//num%=50000;
//		
//		System.out.println("10000won"+num/10000+"mae");
//		//num%=10000;
//		
//		System.out.println("1000won"+num/1000+"mae");
//		//num%=1000;
//		
//		System.out.println("100won"+num/100+"mae");
//		//num%=100;
//		
//		System.out.println("50won"+num/50+"mae");
//		//num%=50;
//		
//		System.out.println("10won"+num/10+"mae");
//		//num%=10;
//		
//		System.out.println("1won"+num/1+"mae");
//		

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("금액을 입력하세요>>");
//		System.out.println("오만원권"+num/50000+"매");
//		num-=50000*(num/50000);
//		System.out.println(num);
//		System.out.println("만원권"+num/10000+"매");
//		num-=10000*(num/10000);
//		System.out.println(num);
//		System.out.println("천원권"+num/1000+"매");
//		num-=1000*(num/1000);
//		System.out.println(num);

		// 중간값구하기
//	int a = sc.nextInt(); //20
//	int b = sc.nextInt(); //100
//	int c = sc.nextInt(); //33
//	
//	if(b>a && b<c ) {
//		System.out.println("중간값은 b"); //=((a < b && b < c) || (c < b && b < a)) 
//	}else if(b<a && b>c) {
//		System.out.println("중간값은 b");
//	}else if(c>b && c<a) {
//		System.out.println("중간값은 c");
//	}else if(c<b && c>a) {
//		System.out.println("중간값은 c");
//	}else if(a<b && a>c) {
//		System.out.println("중간값은 a");
//	}else if(a>b && a<c) {
//		System.out.println("중간값은 a");
//	}else {
//		System.out.println("ㅋㅋ");
//	}

//		int a = sc.nextInt(); 
//		int b = sc.nextInt(); 
//		int c = sc.nextInt();
//		
//		if((a+b)>c || (a+c)>b || (b+c)>a) {
//			System.out.println("됩니다");			
//		}else {
//			System.out.println("안됩니다");
//		}
//	

		/// 3,6,9짝 -
//		System.out.println("1-99");		//97
//		int a = sc.nextInt(); 
//		if(a >= 1 && a <=10) { //1-10
//			if(a%3==0) {
//				System.out.println("짝");
//			}
//		}else if(a >10) {
//			if((a/10)%3==0 && (a%10)%3 == 0) {
//				System.out.println("짝짝");
//			}else if((a/10)%3==0 || (a%10)%3 == 0){
//				System.out.println("짝");
//			}else {
//				System.out.println("뗑");		
//			}
//		}
//		
//
//		int a;
//		int result = 0;
//		int cnt = 0;
//		
//		while(true) {
//			System.out.println("입력하세요");
//			a = sc.nextInt(); 
//			if(a == -1)
//				break;
//			result = result+a;
//			System.out.println("result:"+result);
//			cnt++;
//			System.out.println("cnt:"+cnt);
//			if(a == -1)
//				break;
//		}System.out.println("정수의 개수는 "+cnt+"개이며, 평균은"+result/cnt+"입니다");

		// double a = sc.nextDouble();
		// double b = sc.nextDouble();

//		boolean flag = true; //끝나는 시적을 정해서 만들 수 있음
//		int cnt = 0;
//		while (flag) {
//			cnt++;
//			System.out.println(cnt);
//			if (cnt > 5) {  // 종료되는 시점}
//				flag = false; 
//				 // System.out.println(cnt); }
//
//			}
//		}
		
//		System.out.println("숫자입력");
//		int a = sc.nextInt(); 
//		if(a >= 3 && a<=5) {
//			System.out.println("봄");
//		}else if (a >= 6 && a<=8) {
//			System.out.println("여름");
//		}else if(a >= 9 && a<=11) {
//			System.out.println("가을");
//		}else if (a ==1 || a==2 || a==12) {
//			System.out.println("겨울");
//		}else {
//			System.out.println("잘못입력");
//		}
		
		//switch문
//		System.out.println("숫자입력");
//		int a = sc.nextInt(); 
//		switch (a) {		
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("봄");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("여름");
//			break;
//		case 9:
//		case 10:
//		case 11:
//			System.out.println("가을");
//			break;
//		case 12:
//		case 1:
//		case 2:
//			System.out.println("겨울");
//			break;
//		default:
//			System.out.println("잘못입력");
//		}
		//
		

		
/*		System.out.println("sum"+sum + ", i:"+i);
		
		//짝수만 음수 //홀수만 더했을 때 - 짝수만 더했을때 = 100
		int x = 0; //홀수의 합
		int y =0;//짝수의 합
		int cnt =0;
		
		for(int a=1;true;a++) {
			if(a%2==0) {
				x+=a;
				cnt ++;
				System.out.println("x"+x);
			}else {
				y+=a;
				System.out.println("y"+y);
				cnt ++;
				}
			if((y-x)>100)
				break;
			}System.out.println(x+","+y);
			System.out.println("sum"+(y-x));
			System.out.println("cnt"+cnt);
		*/
		
		
		/*exports.list = function(req, res){	// ToDo 목록 가져올 모듈. app.js에서 require
			fs.exists('./todo_list.json', function (exists) {	// ToDo 목록 존재 확인
				if(exists) {
					fs.readFile('./todo_list.json', {
						'encoding': 'utf8'
					}, function (err, list) {	// todo_list.json 파일 읽기
						res.json(list);
					});
				} else {
					var list = {	// 기본 ToDo 목록 형식
						'list': []
					};*/
						
		
		
		
		
		
		
		
		
	}
}
