import java.io.DataInputStream; //1014_ server-client
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) {
//서버에 접속하기 위한 ip, port번호 알아야 한다.

		System.out.println("서버에 연결합니다.");
		try {
			Socket socket = new Socket("192.168.0.80", 7888); // ip주소와 포트번호를 적는다
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			System.out.println("서버로 부터 받은 메세지" + dis.readUTF());
			System.out.println("연결 종료");

			// 다썼으면 stream과 socket모두 닫아야함
			dis.close();
			socket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
