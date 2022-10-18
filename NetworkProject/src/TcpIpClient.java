import java.io.DataInputStream; //1014_ server-client
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) {
//������ �����ϱ� ���� ip, port��ȣ �˾ƾ� �Ѵ�.

		System.out.println("������ �����մϴ�.");
		try {
			Socket socket = new Socket("192.168.0.80", 7888); // ip�ּҿ� ��Ʈ��ȣ�� ���´�
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);

			System.out.println("������ ���� ���� �޼���" + dis.readUTF());
			System.out.println("���� ����");

			// �ٽ����� stream�� socket��� �ݾƾ���
			dis.close();
			socket.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
