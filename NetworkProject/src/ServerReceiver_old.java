import java.io.DataInputStream; //1017 hashmap 이용
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class ServerReceiver_old extends Thread {
//클라이언트의 요청을 받아서 나머지 클라이언트 쪽으로 값을 보내는 역할 

	// 스트림연결
	DataInputStream in;
	DataOutputStream out;
	HashMap clients;

	// 생성자 : 소켓과 스트림 초기화
	// 소켓정보
	Socket socket;

	public ServerReceiver_old(Socket socket) {
		super();
		this.socket = socket;

		clients = new HashMap();
		Collections.synchronizedMap(clients);

		try {
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

//	void sendToAll(String msg) {// 현재 접속되어있는 모든 클라이언트에 동일한 메세지 전달
//		Iterator it = clients.keySet().iterator(); // 반복문 사용해도 상관없다.
//		while (it.hasNext()) {
//			DataOutputStream out = (DataOutputStream) clients.get(it.next());
//
//			try {
//				out.writeUTF(msg);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}
//	}
//
//	@Override
//	public void run() {
//		String name = "";
//		try {
//			name = in.readUTF();
//			sendToAll("#" + name + "님이 들어오셨습니다. "); 
//
//			clients.put(name, out);// 현재 접속자 수
//			System.out.println("현재 서버 접속자수 : " + clients.size() + "명 입니다.");
//
//			while (in != null) {
//				sendToAll(in.readUTF());
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			sendToAll("#" + name + "님이 나가셨습니다.");
//			clients.remove(name);
//			System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "에서 접속하였습니다.");
//			System.out.println("현재 서버 접속자수 : " + clients.size() + "입니다.");
//		}
//
//	}
}
