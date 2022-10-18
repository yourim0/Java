
public class MyMath { //0929-3 overloding »ç¿ë
	
	int add(int a,int b) {
		System.out.println("add(int a,int b)");
		return a+b;
	}
	
	long add(long a,long b) {
		System.out.println("add(long a,long b)");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.println("add(int[] a)");
		int result = 0;
		for(int i : a) {
			result += i;
		}
		return result;
	}
	
	
	
}
