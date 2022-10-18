
public class ArrayMaxTest {//0928 

	public static void main(String[] args) {
		//1. ArrayMax 객체 생성
		ArrayMax max = new ArrayMax();

		
		//2. 생성된 객체의 배열에 1~100사이 값을 랜덤하게 저장
		for(int i=0; i<max.arr.length;i++) {
			max.arr[i] = (int)(Math.random()*100) + 1;
		}

		
		for(int i : max.arr) {
			System.out.println(i);
		}
		
		
		//4. 반환된 최대값을 출력
		//Max(max.arr);
		
		
//		int[] maxNum = Max(max.arr);
//		int finalNum = Max(max);
//		System.out.println("최대값 : "+finalNum);
//		System.out.println(max.arr[0]);
		
		
	}
//	
//	//3. 메소드를 정의(배열의 최대값을 구해서 반환)
//	
//	static void Max (int[] max) {
//		int numMax=0;
//		for(int i=1; i<max.length; i++) {
//			if(max[i] >= max[0]) {
//				numMax = max[i];
//			}
//		}System.out.println("numMax"+numMax);
//		
//	}
	
//	static int[] Max (int[] max) {
//		int numMax=0;
//		for(int i=1; i<max.length; i++) {
//			if(max[i] >= max[0]) {
//				numMax = max[i];
//			}
//		}return numMax;
//		
//	}	
//	
	
	
}
