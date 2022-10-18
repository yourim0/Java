package com.java.inter3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // �������� ����
public abstract class GameObject {
	// ������ ��ȣ ���� ���������� protected (���� ��Ű��, �ڽ�Ŭ������ ���ٰ���)
	protected int distance; // �� �� �̵��ϴ� �Ÿ�
	protected int x, y; // ���� ��ġ ��ǥ (�ʻ��� ��ġ)
	
	//protected �ܺ� �������� getter, setter�޼ҵ�

	public boolean collide(GameObject p) { // �浹�ߴ��� ���� Ȯ�� ���� ��ǥ Ȯ�� , ex)b[2][2]='b', f[2][2]='@' �� ������ ����⸸ ������(�ΰ�����)
		//->�浹�� ����Ⱑ ���� �迭�� ���;� ���� ���� �׷���.
		//�θ� GameObject ����ؼ� ��, ����� ��� x
		if (this.x == p.getX() && this.y == p.getY()) { //this.x ��bear, p.getx �� fish?
			return true;
		} else {
			return false;
		}
	}

	// �޼ҵ带 �ٸ� ������� �����ϰ� �ϱ� ���� abstract ����
	protected abstract void move();
	protected abstract char getShape();

}
