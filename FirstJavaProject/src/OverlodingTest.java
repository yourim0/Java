
public class OverlodingTest { //0929-2 overloding : 다형성

	public static void main(String[] args) {
		
		Overloding ol = new Overloding();
		
		ol.add();
		ol.add(3);
		ol.add(3L); //long형도 정수형이나 int와 구별 위하여 접미사 L명시
		ol.add(2, 3);
		ol.add(2, 3L);
		ol.add(2L, 3);
		
		
	}

}
