
public class FuncStaticTest { //0929-1 static method

	public static void main(String[] args) {
		
	//	fs.cv = 20; 생성없이 사용가능 :가장 큰 특징
	//	fs.staticMethod(); 생성없이 사용가능
		
//		FuncStatic.cv =20; 
//		FuncStatic.staticMethod();
//		
		FuncStatic fs = new FuncStatic();
//		
//		fs.iv = 10;
//		fs.instanceMethod();
		

		
		fs.instanceMethod();
		FuncStatic.staticMethod();
		
	}

}
