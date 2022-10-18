//10-04상속 
public class CaptionTv extends Tv {
	// tv클래스로부터 변수 7개와 메소드 6개를 상속받는다.
	// 부모 클래스에서 정의 해놓은 변수와 메소드 + 나의 고유기능을 사용할 수 있음.

	// 기본생성자는 생략되어있음
	boolean caption;// 자막 기능 true 일때만

	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
