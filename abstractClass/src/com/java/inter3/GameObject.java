package com.java.inter3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // 모든생성자 생성
public abstract class GameObject {
	// 데이터 보호 위한 접근제한자 protected (같은 패키지, 자식클래스만 접근가능)
	protected int distance; // 한 번 이동하는 거리
	protected int x, y; // 현재 위치 좌표 (맵상의 위치)
	
	//protected 외부 접근위한 getter, setter메소드

	public boolean collide(GameObject p) { // 충돌했는지 유무 확인 위한 좌표 확인 , ex)b[2][2]='b', f[2][2]='@' 로 들어오면 물고기만 남을것(두개못들어가)
		//->충돌시 물고기가 먼저 배열에 들어와야 곰이 남게 그려짐.
		//부모 GameObject 사용해서 곰, 물고기 상관 x
		if (this.x == p.getX() && this.y == p.getY()) { //this.x 는bear, p.getx 는 fish?
			return true;
		} else {
			return false;
		}
	}

	// 메소드를 다른 기능으로 강제하게 하기 위해 abstract 선언
	protected abstract void move();
	protected abstract char getShape();

}
