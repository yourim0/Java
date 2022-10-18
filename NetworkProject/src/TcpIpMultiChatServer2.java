import java.io.IOException;
import java.net.*;
import java.io.*;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;

public class TcpIpMultiChatServer2 {

	//HashMap clients; // k : ����ھ��̵� v : stream ����

	public TcpIpMultiChatServer2() {
		
		//clients = new HashMap();
		//Collections.synchronizedMap(clients); // ���� ����ȭó��//�ؽ��� ����Ҷ� �浹 ������� lock�Ŵ� ��

	}

	public void start() { // ���� ����޼ҵ�. thread start�ƴ�
		
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("��������");

			while (true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + ":" + socket.getPort() + "]" + "���� �����Ͽ����ϴ�.");
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
