
public class ArrayMaxTestA {//0928 

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
				int biggest = arrayMax(max.arr);
				System.out.println("max: "+biggest);
	}
	
	
	//3. 메소드를 정의(배열의 최대값을 구해서 반환)
	static int arrayMax(int[] max) { //return해줘야 하니까 void x. return 값과 동일한 타입 int 로 변경

		int biggest = max[0];
		
		for(int i=0; i<max.length; i++) {
			if(max[i] > biggest) {
				biggest = max[i];
			}
		}return biggest;
		
	}

}
