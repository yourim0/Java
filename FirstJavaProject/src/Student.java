
public class Student {//---------10
//클래스의 기본 구성 : 변수,생성자,메소드
	String name; //학생이름
	int ban; //반
	int no; //번호
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	
	Student(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() { //총점
		return kor + eng + math;
	}
	
	

	
	double getAverage() { //평균
		return (double)(getTotal())/3;
	}
	
	
	
	
	
	
//	double getAverage() { //평균
//	int total = getTotal();
//	double avg = (double)total / 3;	//나눌 값 double형으로 나눠야함
//	
//	return avg;
//}
	
//	double getAverage() { //평균
//		return (int)(getTotal() / 3.0 * 10 +0.5) / 10.0;//나눌 값 3도 double형으로 나눠야함
//		
//	}	
	
	
	
	
	
	
	
	
	 //0929 ----6 생성자 사용
	//	String name;
//	int age;
//	int grade;
//
//	//생성자
//	Student(String name,int age,int grade){
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//	}
//	
//	



}



