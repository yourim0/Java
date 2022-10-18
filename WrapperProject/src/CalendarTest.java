import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {// 1011 Calendar

	public static void main(String[] args) {
		/*
		 * Calendar c = Calendar.getInstance();//사용 방법 c.get(Calendar.YEAR);
		 * //static변수year - 반환값 int System.out.println(c.get(Calendar.YEAR));
		 * System.out.println(c.get(Calendar.MONTH)+1); //0-11 숫자값 0이 1월달
		 * System.out.println(c.get(Calendar.DATE));
		 * System.out.println(c.get(Calendar.HOUR));
		 * System.out.println(c.get(Calendar.MINUTE));
		 * System.out.println(c.get(Calendar.SECOND));
		 * System.out.println(c.get(Calendar.DAY_OF_WEEK)); //1.일요일
		 */

		// 달력출력

		Scanner sc = new Scanner(System.in);
		System.out.println("년 입력 : ");
		int year = sc.nextInt(); // 2022
		System.out.println("월 입력 : ");
		int month = sc.nextInt(); // 10

		int START_DAY_OF_WEEK = 0; // 시작하는 요일의 날짜를 알기 위해서
		int END_DAY = 0;

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		sDay.set(year, month - 1, 1); // 시작하는 달의 1일 날짜로 초기화 202291
		eDay.set(year, month, 1); // 다음달 1일로 날짜 초기화2022101

		eDay.add(Calendar.DATE, -1); // 전 달의 마지막을 구함9월마지막날31일

		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // 7:토요일 //1일이 무슨요일인지
		END_DAY = eDay.get(Calendar.DATE);// 31

		System.out.println("     " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA ");

		for (int i = 1; i < START_DAY_OF_WEEK; i++) { //1일 전까지 공백으로 채우기
			System.out.print("   ");
		}

		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10 ? "  " + i : " " + i)); //한자리수 두자리수 칸 맞추기 
			if(n % 7 == 0) { //7의 배수마다 줄바꿈 
				System.out.println();
			}

	}

	}}
