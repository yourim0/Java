package stringProject;//1007 object class

public class ObjectTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("홍길동", 10);
	
		//제네릭 컬렉션 사용시에는 hashcode도 동일시켜주어야 한다.
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		//object의 equals 사용한 것 - api 가면 주소값 비교하는 것으로 정의되어있음
		if(p1.equals(p2)) {	//오버라이딩 후  "홍길동" == "홍길동" && 10 == 10
		System.out.println("같음");
		}else {
			System.out.println("다름");
		} //equals 오버라이딩 전 -- 다름
		// 후 - 같음
	}



}
