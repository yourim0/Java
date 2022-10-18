import java.util.Scanner;

public class ScannerEx { // 0920

	public static void main(String[] args) {
//		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
//		Scanner sc = new Scanner(System.in);

//		String name = sc.next();
//		System.out.println("이름은 "+name+",");
//		
//		String city = sc.next();
//		System.out.println("도시는 "+city+",");
//		
//		int age = sc.nextInt();
//		System.out.println("나이는 "+age+",");
//		
//		Double weight = sc.nextDouble();
//		System.out.println("체중은 "+weight+",");
//		
//		boolean marry = sc.nextBoolean();
//		System.out.println("독신 여부는 "+marry+"입니다");
//		
//		sc.close();

//		String name = sc.next();
//		String city = sc.next();
//		int age = sc.nextInt();
//		Double weight = sc.nextDouble();
//		boolean marry = sc.nextBoolean();
//		
//		
//		System.out.println("이름은 "+name+","+"도시는 "+city+","+"나이는 "+age+","+"몸무게는 "+weight+","+"결혼여부는 "+marry+"입니다");

		// 초ㅈ단위 정수 입력받고 시간, 분, 초로 출력하라
//		Scanner sc = new Scanner(System.in);
//		int time = sc.nextInt();
//		int second = time % 60;
//		int minute = (time / 60) % 60;
//		int time2 = (time / 60)/60;
//		System.out.println(time+" 초는:"+second+"초,"+minute+"분,"+time2+"시 입니다.");

		// 연습 문제 : 467->400, 590->500 형식출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("백의 자리 수를 입력하세요");
//		int num = sc.nextInt();
//		System.out.println("입력받은 값 :" + num);
//		
//		int result = (num / 100) * 100;
//		System.out.println("연산되어진 결과 : "+ result);

		// 333->331, 778->771

//		Scanner sc = new Scanner(System.in);
//		System.out.println("백의자리 수를 입력하세요");
//		int num = sc.nextInt();
//		System.out.println("입력받은 값 : " + num);
//		
//		int result = ((num / 10) * 10) + 1;
//		System.out.println("연산되어진 결과 : "+ result);
//		

		// 나보다 큰 가장 가까운 10의 배수를 구하세요
		// 19 -> 20, 81 -> 90
//		Scanner sc = new Scanner(System.in);
//		System.out.println("두자리 수를 입력하세요");
//		int num = sc.nextInt();
//		System.out.println("입력받은 값 : " + num);

//		int result = (num / 10 + 1) * 10; //num *10 +10
//		System.out.println("연산되어진 결과 : " + result);

		// 입력한 값과 배수의 차이값
//		int result = (num / 10 + 1) * 10 - num;
//		int result = 10 - (num % 10);
//		System.out.println("연산되어진 결과 : " + result);

//		Scanner sc = new Scanner(System.in);
//		System.out.println("사과 수를 입력하세요");
//		int appleNum = sc.nextInt();
//		int result = (appleNum / 10) + (appleNum % 10 > 0 ? 1 : 0);
//		System.out.println("총 사과의 수  : " + appleNum + "개 이며, 바구니는 "+ result + "개가 필요합니다.");

		
		Scanner sc = new Scanner(System.in);
		System.out.println("사과 수를 입력하세요");
		int apple = sc.nextInt();
		int result = (apple / 10) + (apple % 10 > 0 ? 1 : 0);
		System.out.println("필요한 바구니 개수는 : " + result);
				
				
				
				
//		int x = -3;
//		System.out.println(x >= 0 && x <= 10);
//		System.out.println(!(x >= 0 && x <= 10));
//		System.out.println(x <= 0 || x >= 10);
	}

}
