
public class CarTest {//0927

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car c1, c2, c3;
		//Car c1 = new Car();
		
		Car[] car = new Car[3];
		
		for(int i=0;i<car.length;i++) {
			car[i] = new Car();
		}
		
		car[0].model = "스팅어";
		car[0].color = "블루";
		car[0].people = 5;
		car[0].wheel = 4;
		car[0].weight = 1000;
		car[0].elecParts = 20;
		car[0].kmMax = 200;
		car[0].engine = 80;
		car[0].ySize = 70;
		
		car[1].model = "제네시스";
		car[1].color = "블랙";
		car[1].people = 5;
		car[1].wheel = 4;
		car[1].weight = 1200;
		car[1].elecParts = 20;
		car[1].kmMax = 200;
		car[1].engine = 80;
		car[1].ySize = 70;
		
		car[2].model = "쿠페";
		car[2].color = "그린";
		car[2].people = 2;
		car[2].wheel = 4;
		car[2].weight = 1000;
		car[2].elecParts = 20;
		car[2].kmMax = 200;
		car[2].engine = 80;
		car[2].ySize = 70;
		
		
		for(Car i : car) {
			System.out.println("model:"+i.model+"color:"+i.color+"people:"+i.people+"wheel:"+i.wheel);
		}

	}

}
