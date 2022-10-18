package exceptionProject; //1007사용자정의 예외처리 처리방식 연습 -2

public class LoginIdException extends Exception {

	public LoginIdException(String msg) {
		super(msg);
	}

}
