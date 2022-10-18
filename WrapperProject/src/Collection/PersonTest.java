package Collection;

import java.util.HashSet;
import java.util.Set;

public class PersonTest {
//set은 중복이 불가한데 다른객체로 인식하여 중복 입력되는 것을 막기위해 
	//hashcode, equals 오버라이딩을 필요로 한다. 
	public static void main(String[] args) {

		Set<Person> set = new HashSet();

		set.add(new Person("Hongkil", 10));
		set.add(new Person("Hongkil", 10));
		
		System.out.println(set);
	}

}

