//10-04��� 
public class CaptionTv extends Tv {
	// tvŬ�����κ��� ���� 7���� �޼ҵ� 6���� ��ӹ޴´�.
	// �θ� Ŭ�������� ���� �س��� ������ �޼ҵ� + ���� ��������� ����� �� ����.

	// �⺻�����ڴ� �����Ǿ�����
	boolean caption;// �ڸ� ��� true �϶���

	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
