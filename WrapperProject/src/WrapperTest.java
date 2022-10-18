import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import Collection.Student;


public class WrapperTest { //1011Wrapper Class

	public static void main(String[] args) {
		//Wrapper Class: 기본형과 참조형간 형변환(박싱, 언박싱) 오토박싱
		//박싱 : 기본형 -> 참조형
		//언박싱 : 참조형 -> 기본형 
	
		/*
		
		int i = 10; //기본형을 참조형으로 변환
		Integer intg = i; //박싱 (Integer)i; new Integer(i)
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; //주소값을 int형에 추가한다 =>언박싱
		
		System.out.println(intg + i2);
		
		
		Object obj = (Object)i; //기본형을 박싱할 수 있다.
		//int i3 = obj; //언박싱은 불가하다
		
		String str = "50"; //"a50"일때 a를 처리할 수 없어  numberformatexception 예외 발생
		//문자열을 숫자로 바꿈
		int i4 = Integer.parseInt(str); //integer.parseint 자주쓰는 클래스 
		System.out.println(i4); */
	
	/*	
		// list의 구현체이면서 vector 클래스를 상속
		//stack 구조를 활용 : LIFO 1-2-3
		Stack st = new Stack();
		st.push("1");
		st.push("2");
		st.push("3");
	
		//데이터를 읽어오는 메소드 3-2-1 마지막에 들어간 데이터를 먼저출력 
		try {
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());
		System.out.println((String)st.pop());//java.util.EmptyStackException stack에 값이 없을 때 발생하는 오류 
		}catch(EmptyStackException e) {
			System.out.println("Stack이 비어있습니다."); 
		} */
	
//		while(!st.empty()) {
//			System.out.println((String)st.pop());
//		}
	
		
		/*
		ArrayList list = new ArrayList();
		
		list.add("1"); //String -> Object 형변환
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//iterator(반복자 패턴 - 인터페이스)
	
	
		Iterator it = list.iterator();
		
		while(it.hasNext()){ //데이터 존재 유무 확인
			String str = (String)it.next(); //값을 가지고 오는 역할
			System.out.println(str); */
		
	
		
	/*
		//제네릭(타입한정) :데이터를 받을 때의 타입을 미리 정해놓는다 
		//컬렉션 객체의 데이터 타입을 한정한다. 
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Integer> list = new ArrayList<Integer>();
		list.add("1"); //String -> Object 형변환
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		// list.add(1); integer안됨 
	
		list.get(0); //string타입으로 읽어옴
		
		//Iterator it = list.iterator();
		
		Iterator<String> it = list.iterator(); //타입 동일하게 설정  컬렉션에 제네릭을 적용하는것 
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		}*/
		
		
		
		//hash특징과 set특징이 합쳐짐 
		//Set : 데이터 들어가는 순서가 랜덤, 중복되는 값 입력 불가
		
/*		
		//HashSet set = new HashSet();
		//제네릭 적용
		HashSet<String> set = new HashSet<String>();
		
		//타입이 다르면 다른 데이터로 인식
		set.add("1");
		set.add("2");
		set.add("1");
		set.add("4");
		//set.add(new Integer(1)); //순서대로 들어간 것 아니다.
		
		System.out.println(set);
				
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			//String str = (String)it.next();
			String str = it.next(); //제네릭 적용시 캐스팅 하지 않아도 괜찮음
		}
		
		*/
		
	/*	
		Set<Integer> set = new HashSet<Integer>(); //부모타입인 set으로 도 가능
	
		//빙고 중복 없는 데이터 넣기 위함 
		
		int[][] bingo = new int[5][5];
		
		for(int i=0; set.size()<25 ; i++) {//set.size()로만 하면 중복되면 안들어가기 때문에 25개 안들어 갈 수 있음
			set.add((int)(Math.random()*50)+1); 
				
		}
		
		//System.out.println(set);
		
		//골고루 섞어주는 기능
		ArrayList list = new ArrayList(set);//셔플기능이 arraylist에 있기 때문에 (collection) 
		Collections.shuffle(list); 
	
		Iterator<Integer> it = list.iterator();
		
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				bingo[i][j] = it.next(); 
			}
		}
		
		for(int i=0;i<bingo.length;i++) {
			for(int j=0;j<bingo[i].length;j++) {
				System.out.print(bingo[i][j] +" "); //1~2까진 1의자리가 섞이고 완전히 잘 섞이진 않는다
			}
		System.out.println();
		} */
		
		
		//TreeSet : 트리구조의 컬렉션이 가지는 특징 :
		//값이 정렬되어진다.
		//반드시 값으로 사용되는 해당 클래스 안에는 정렬 조건이 오버라이딩 되어있어야 한다.
		//implements Comparable (Integer,String)
		
	/*	
		TreeSet set = new TreeSet();
		set.add(new Integer(2)); //오토박싱이 되어서 생략한 것. wrapper 타입으로 써야함
		set.add(5);
		set.add(1);
		set.add(4);
		set.add(3);
	
		System.out.println(set);
		
		Iterator it = set.iterator(); //타입 동일하게 설정  컬렉션에 제네릭을 적용하는것 
		
		while(it.hasNext()) {
			Integer intg = (Integer)it.next();
			System.out.println(intg);
		}
		*/
		
		
		//student 클래스의 compareto 오버라이딩 반으로 정렬 
		TreeSet<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student("kim", 9,1,10,10,10);
//		Student s2 = new Student("pim", 3,1,10,10,10);
//		Student s3 = new Student("gim", 4,1,10,10,10);
//		Student s4 = new Student("him", 7,1,10,10,10);
		Student s5 = new Student("qim", 1,1,10,10,10);
		
		set.add(s1);
//		set.add(s2);
//		set.add(s3);
//		set.add(s4);
		set.add(s5);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Student s = (Student) it.next(); //캐스팅 : 기본object 클래스로 넘겨주기때문
			System.out.println(s.toString());
			
		}
	}
	}
