import java.io.DataOutputStream; //1017 hashmap 이용
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSender extends Thread {

	Socket socket;
	DataOutputStream out;
	String name;

	public ClientSender(Socket socket, String name) {
		super();
		this.socket = socket;
		this.name = name;

		try {
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		try {
			if (out != null) {
				out.writeUTF(name); // 특정되는 데이터 보내고 싶을때 쓰느 메소드 //닉네임
			}
			while (out != null) {
				out.writeUTF("[" + name + "]" + sc.nextLine()); //문자채팅
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
