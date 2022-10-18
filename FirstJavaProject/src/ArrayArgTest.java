
public class ArrayArgTest { //0928 배열 타입
	
	
	//배열 변수 자체가 주소값을 가지는 변수이기때문에 참조형이다!!!!! call-by-reference(값의 참조)

	public static void main(String[] args) {
		ArrayArg ay = new ArrayArg();
		ay.x = 10; //참조변수를 통한 참조방식
		ay.arr[0] = 1;
		ay.arr[1] = 2;
		ay.arr[2] = 3;
		ay.arr[3] = 4;
		ay.arr[4] = 5;
		
		for(int i:ay.arr) {
			System.out.println(i);
		}
		
	//===========================================참조형
		int[] arr2 = change(ay.arr); //변수를 배열로 만들 수 있다
		
		for(int i : arr2) {
			System.out.println(i);
		}
		
		
		
//		change(ay.arr); //배열의 주소값을 전달
//		
//		for(int i:ay.arr) {
//			System.out.println(i);
//		}
	}
	
//	static void change(int[] arr) { //arr 배열의 주소값을 가져옴 
//		arr[0] = 100;
//		System.out.println("change() = " + arr[0]);
//	}

	//===========================================참조형
	
	static int[] change(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (i+1) * 10;
		}
		
//		int[] arr2; //데이터 타입
//		arr2 = arr;
		
		return arr;
		
	}
		
}
