
public class MyMathTest { //0929-3 overloding 사용

	public static void main(String[] args) {
		MyMath ma = new MyMath();
		int sum1 = ma.add(2, 3);
		System.out.println(sum1);
		
		long sum2 = ma.add(3L, 2L); //반환타입 long
		System.out.println(sum2);
		
		int[] arr = {1,2,3,4,5};
		int sum3 = ma.add(arr);
		System.out.println(sum3);
		
		
		
	}

	
	
	//질문 static 메소드 - static 메소드만 사용 가능, 여긴 static 없는데 왜 가능? --> 같은 class일때만?
	//main class 에서도 생성만하면 사용가능하다. 
	
	
	
}
