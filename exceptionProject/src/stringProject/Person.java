package stringProject;//1007_object class

public class Person {
	String name;
	int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override //object�� ����Ѱ� 
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override //���⼭ �������̵� �ؼ� ȫ�浿�� ȫ�浿 �̸��� ���� �� �ֵ��� �� 
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person another = (Person)obj;
			return this.name.equals(another.name) && this.age == another.age;
		}
		return false;
	}
	
	@Override//���׸� �÷��� ���ÿ��� hashcode�� ���Ͻ����־�� �Ѵ�.
	public int hashCode() {
		return (this.name + age).hashCode(); //"ȫ�浿10".hashCodeȭ (�չ��ڿ��� �����ϸ� ������ ���� hashcode�� ���Եȴ�.
		}
	
}
