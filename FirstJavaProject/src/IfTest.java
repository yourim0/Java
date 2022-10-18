import java.util.Scanner;

public class IfTest { // 0921 조건문
	public static void main(String[] args) {
		// 조건문 : 실행 문장을 선택적으로 실행
		// if, switch ~ case

//		if(조건식(true or false) { //조건식은 논리값으로true or false
//			실행문

//		int age = 15;
//		if(age >= 20) { // true
//			System.out.println("성인입니다.");
//		}else {
//			System.out.println("미성년 입니다.");
//		}
//		
//		
//		int num = 10;
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}

// 시험점수가 80점 이상이라면 합격 판별하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		int score = sc.nextInt();
//		if(score >= 80) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}

// 입력된 수가 의3 배수인지 판별하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요 :");
//		int num = sc.nextInt();
//		if(num % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}else {
//			System.out.println("3의 배수가 아닙니다.");
//		}

		// 다중 if문
//		int score = 101;
//		String score = 'A'
//		if (score >= 90 && score <= 100) {
//			System.out.println("A학점");
//		} else if (score >= 80 && score <= 89) {
//			System.out.println("B학점");
//		} else if (score >= 70 && score <= 79) {
//			System.out.println("C학점");
//		} else if (score >= 60 && score <= 69) {
//			System.out.println("D학점");
//		} else if (score >= 0 && score <= 59) {
//			System.out.println("F학점");
//		} else {
//			System.out.println("조건에 부합하지 않습니다");
//		}

//입력받은 성적에 대해 학점을 부여하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.println("학점을 입력해주세요 :");
//		int score = sc.nextInt();
//		if(score >= 90) {
//			System.out.println("A");
//		}else if(score < 80) {
//			System.out.println("B");
//		}
//		
//		sc.close();

		// 중첩 if-else 구문
		// 두가지 조건 만족

//		int x = 6;
//		if (x % 2 == 0) {
//			if (x % 3 == 0) { //=if(x%2 ==0 && x%3==0)
//				System.out.println("x는 2와 3의 공배수");
//			}
//		}

		/*
		 * 점수, 학년 입력받아 60이상 합격, 미만 불합격. 4학년은 70점 이상 합격 Scanner sc = new
		 * Scanner(System.in); System.out.println("점수 입력하세요"); int score = sc.nextInt();
		 * System.out.println("학년 입력하세요"); int grade = sc.nextInt();
		 * 
		 * if (grade >= 1 && grade < 4) { // 1~3학년 if (score >= 60 && score <= 100) {
		 * System.out.println("합격"); } else if (score < 60 && score >= 0) {
		 * System.out.println("불합격"); } else { System.out.println("잘못 된 값이다"); } } else
		 * if (grade == 4) { if (score >= 70 && score <= 100) {
		 * System.out.println("합격"); } else if (score < 70 && score >= 0) {
		 * System.out.println("불합격"); } } else { System.out.println("잘못 된 입력값입니다."); }
		 */

		// switch문 : 등가연산(==) 1:1비교, 범위 조건 비교 x
//		
//		switch(비교값 ) {
//		case 값1 : 실행문;
//		break;
//		case 값2 : 실행문;
//		break;
//		case 값3 : 실행문;
//		break;
//		default;
//		}
//
//		int sel = 8;
//		switch(sel) { 
//		case 1 : System.out.println("1번 선택");
//		break;
//		case 2 : System.out.println("2번 선택");
//		break;
//		case 3 : System.out.println("3번 선택");
//		break;
//		default : System.out.println("조건에 부합하지 않습니다");
//		}

		// switch ~ case 문으로 계산기(사칙연산) 만들기

//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자를 입력해주세요");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 숫자를 입력해주세요");
//		int num2 = sc.nextInt();
//		
//		sc.nextLine(); //buffer 지워주는 line
//		
//		
//		System.out.println("연산자를 입력하세요 : (+ , -, *, /)");
//		String op = sc.nextLine();
//		
//		
//		switch(op) { 
//		case "+" : System.out.println(num1+num2);
//		break;
//		case "-" : System.out.println(num1-num2);
//		break;
//		case "*" : System.out.println(num1*num2);
//		break;
//		case "/" : System.out.println(num1/num2);
//		break;
//		default : System.out.println("연산불가");
//		}

		/*
		 * 입력받은 성적에 대한 성적 부여 switch - case 사용 예제
		 * 2-14************************************* 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("성적을 입력해주세요"); 
		 * int num1 = sc.nextInt(); String grade;
		 * 
		 * switch (num1/10){
		 *  case 10 : 
		 *  case 9 : 
		 *  grade = "a"; 
		 *  System.out.println("a");
		 *  break;
		 *  case 8 :
		 *  case 7 : 
		 *  grade = "b"; 
		 *  break; 
		 *  case 6 : 
		 *  case 5 : 
		 *  grade = "c";
		 *  break;
		 *  default: 
		 *  grade = "f";
		 *   } System.out.println("학점 : " + grade);
		 */

		// 커피메뉴 가격 알려주는 프로그램 예제 2-15
//		Scanner sc = new Scanner(System.in);
//		System.out.println("커피명 입력해주세요");
//		String coffee = sc.next();
//
//		switch (coffee) {
//		case "에스프레소":
//		case "카푸치노":
//		case "카페라떼":
//			System.out.println("3500원 입니다.");
//			break;
//		case "아메리카노":
//			System.out.println("2000입니다. ");
//			break;
//		default:
//			System.out.println("없어요.");
//		}
		

	}

}