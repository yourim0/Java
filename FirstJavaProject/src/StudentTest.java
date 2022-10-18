
public class StudentTest {//---------10
	public static void main(String[] args) {
		//국어: 100, 영어:60, 수학:76 
		//실행결과 
		//이름: 홍길동
		//총점 : 236
		//평균 : 78.7 소수점 2번째 자리에서 반올림
		
		Student stu = new Student("김유림",3,17,100,60,76);
		
		int total = stu.getTotal();
		double avg = stu.getAverage();
		
		System.out.println("이름 : "+ stu.name);
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ String.format("%.1f", avg));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 //0929 ----6 생성자 사용

//		Student s1 = new Student("홍길동",10,3);
//		//생성자의 편리함 
///*		s1.name = "홍길동";
// * 		s1.age = 10;
// * 		s1.grade = 3;
//	
//		
//*/		
//		Student s2 = new Student("이순신",10,3);
//		Student s3 = new Student("강감찬",10,3);
//		
//		System.out.println(s1.name);
//		System.out.println(s1.age);
//		System.out.println(s1.grade);
//	
//		System.out.println(s2.name);
//		System.out.println(s2.age);
//		System.out.println(s2.grade);
//		
//		System.out.println(s3.name);
//		System.out.println(s3.age);
//		System.out.println(s3.grade);
}

}
