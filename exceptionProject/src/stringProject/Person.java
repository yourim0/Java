package stringProject;//1007_object class

public class Person {
	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override //object가 상속한것 
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override //여기서 오버라이딩 해서 홍길동과 홍길동 이름을 비교할 수 있도록 함 
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person another = (Person)obj;
			return this.name.equals(another.name) && this.age == another.age;
		}
		return false;
	}
	
	@Override//제네릭 컬렉션 사용시에는 hashcode도 동일시켜주어야 한다.
	public int hashCode() {
		return (this.name + age).hashCode(); //"홍길동10".hashCode화 (앞문자열이 동일하면 무조건 같은 hashcode를 갖게된다.
		}
	
}
