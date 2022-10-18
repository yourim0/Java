
public class Car1 {//0929-4 생성자
	//속성
	String color;
	String gearType;
	int door;
	
	
	//생성자 : 멤버변수(인스턴스)를 초기화 한다.
	//		클래스의 이름과 동일하게 작성.
	//		객체를 생성하는 시점에 한번만 호출되어진다
	//		기본 생성자는 생략 가능 (다른생성자가 존재하지 않을때)
	//		생성자 오버로딩
	//		모든 클래스는 생성자를 포함한다. (안보이면 기본생성자)
	//		this / this() 
	

//	Car1(){ //기본생성자
//	}
	
	Car1(){ //다른 생성자가 있는 경우 기본생성자를 직접 작성해야함 혹은 c1,c2를 못쓰게?
		
	}
	
//	//인스턴스를 초기화 방법2
//	Car1(){
//		color ="blue";
//		gearType = "st";
//		door = 3;
//	}
	
	
	//생성자 오버로딩
//	Car1(String c){ //매개변수 c로 들어온 값을 color를 초기화
//		color = c;
//	}
	
	//this ----------5 멤버변수와 매개변수의 변수명이 같을 때 (this 는 클래스자체를 뜻함.)
//	Car1(String color){
//		this.color = color; //this.멤버변수 = 매개변수로 받아온 값의 변수 이름 
//	}
//	

	//이 생성자로 받은 color와 다른 생성자의 gearType을 적어서 해당 생성자를 호출
	Car1(String color){
		//this.color = color;
		this(color,"Auto"); //-----------------------0929-7 생성자간 호출  
	}
		
	Car1(String color,String gearType){
//		this.color = color;
//		this.gearType = gearType;
		this(color,gearType,6);
	}
	
	Car1(String color,String gearType,int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

}
