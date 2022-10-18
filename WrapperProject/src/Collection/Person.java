package Collection;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Person {

	String name;
	int age;
	
	
//	
	@Override //hashcode ����ȭ 
	public int hashCode() {
		return (this.name + this.age).hashCode();
	}
//	
	
//	
//	
//	@Override//
//	public boolean equals(Object obj) {
//		Person another = (Person)obj;
//		return this.name.equals(another.name) && this.age == another.age;
//	}
//	
//
//	
	
}
