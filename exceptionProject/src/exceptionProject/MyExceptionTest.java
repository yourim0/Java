package exceptionProject; //1007_����� ���� ����Ŭ���� -1

public class MyExceptionTest {

	public static void main(String[] args) {

		try {
			throw new MyException("MyException ����� ���� ���� �߻�");
		} catch (MyException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
