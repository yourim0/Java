import java.io.DataInputStream; //1014 server-client
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {

	public static void main(String[] args) {

		// ip��ȣ�� port ��ȣ�� �ʿ�
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(7888); // 5000�������� �ý����� ���
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (true) {
			try {
				System.out.println("�����û�� ��ٸ��ϴ�.");
				Socket socket = serverSocket.accept(); //server socket�� ���ʿ�������� ���, ���� ����� �ٸ� socket�� �̿��ϱ� ����
				System.out.println(socket.getInetAddress() +" �� ���� ���� ��û�� ����");
			
				OutputStream out = socket.getOutputStream();//��� �����
				DataOutputStream dos = new DataOutputStream(out);
				//���ڰ� ������ ������ �����ϱ� ���� UTF�� ���ڵ��ؼ� ������.
				dos.writeUTF("[Notice] ���� ���� Message from Server");
				System.out.println("�����͸� �����߽��ϴ�.");
				dos.close();
			
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
