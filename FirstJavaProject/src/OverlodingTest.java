
public class OverlodingTest { //0929-2 overloding : ������

	public static void main(String[] args) {
		
		Overloding ol = new Overloding();
		
		ol.add();
		ol.add(3);
		ol.add(3L); //long���� �������̳� int�� ���� ���Ͽ� ���̻� L���
		ol.add(2, 3);
		ol.add(2, 3L);
		ol.add(2L, 3);
		
		
	}

}
