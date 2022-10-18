import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

public class TcpIpMultiChatServer2 {

	//HashMap clients; // k : 사용자아이디 v : stream 정보

	public TcpIpMultiChatServer2() {
		
		//clients = new HashMap();
		//Collections.synchronizedMap(clients); // 맵을 동기화처리//해쉬맵 사용할때 충돌 있을까봐 lock거는 것

	}

	public void start() { // 서버 실행메소드. thread start아님
		
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버시작");

			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "에서 접속하였습니다.");
				ServerReceiver_old thread = new ServerReceiver_old(socket);
				thread.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		new TcpIpMultiChatServer2().start();
	}

}
