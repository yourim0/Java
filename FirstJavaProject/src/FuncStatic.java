
public class FuncStatic { //0929-1 static method (블록내 변수,메소드 : 멤버)
	int iv;
	static int cv;
	
	
	//멤버 메소드: 1) 인스턴스 메소드 
	//			- 인스턴스 변수, 클래스 변수 모두 사용 가능 
	//			- 인스턴스 메소드, 클래스 메소드 모두 사용 가능
	//			2) 클래스(static) 메소드 :객체 생성 없이 사용가능(static 변수랑 동일)
	//			- 클래스 변수, 클래스 메소드만 사용가능
	
	
	void instanceMethod() { //메소드 메모리 할당 시점보다 static 변수인 cv 생성이 더 빠름 
							//인스턴스 변수는 생성해야 메모리 할당이 됨. 
		System.out.println("instanceMethod() call");
		iv = 10; //생성과 동시에 할당
		cv = 20; //메소드 할당 전 이미 되어있음
		//자신의 클래스에 정의 된 변수는 필요에 의해 가져다 쓸 수 있음
	
		System.out.println("iv = "+ iv);
		System.out.println("cv = "+ cv);
		
		//함수 호출: instance 메소드가 메모리 할당되기 전 static 메소드는 이미 되어있기 때문에 호출 사용 가능하다.
		staticMethod();
	
	}
	
	
	//*************static method에서 instance 변수 사용할 수 없다
	static void staticMethod() { //앞부분에 static 붙혀주면 됨
		System.out.println("staticMethod() call");


		
		//iv = 30; //
		cv = 40;//객체 생성 전 메모리 할당
		
		System.out.println("cv = "+cv);
		
		//함수 호출: instance 메소드의 메모리 할당 시점이 다르기 때문에 호출 사용 불가능
		//instanceMethod();
		
	//******************* 못쓰는게 아니라 생성자가 없어서 안되는거. 같은 class에서 이런식으로 안쓰기 때문에.
//		FuncStatic st = new FuncStatic();
//		st.instanceMethod();
	}
	

	
	//어제만든 메소드들은 인스턴스매소드
	//main 메소드는static. DataTest.java의 copy 메소드도 static 이여야만 호출, 사용이 가능. 
}
