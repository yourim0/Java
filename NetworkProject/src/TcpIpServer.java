import java.io.DataInputStream; //1014 server-client
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) {

		// ip번호와 port 번호가 필요
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(7888); // 5000번까지는 시스템이 사용
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println("연결요청을 기다립니다.");
				Socket socket = serverSocket.accept(); //server socket은 최초연결까지만 담당, 실제 통신은 다른 socket을 이용하기 때문
				System.out.println(socket.getInetAddress() +" 로 부터 연결 요청이 들어옴");
			
				OutputStream out = socket.getOutputStream();//통로 만든것
				DataOutputStream dos = new DataOutputStream(out);
				//글자가 깨지는 현상을 보완하기 위해 UTF로 인코딩해서 보낸다.
				dos.writeUTF("[Notice] 접속 성공 Message from Server");
				System.out.println("데이터를 전송했습니다.");
				dos.close();
			
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
