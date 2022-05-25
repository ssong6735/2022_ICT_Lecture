package abstractEx;

import Car.AICar;
import Car.ManualCar;
import Computer.Computer;
import Computer.Notebook;
import Constant.Define;

public class main {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer(); // new 생성x
		
		// 추상클래스 오버라이딩해서 new 사용가능
		Notebook n1 = new Notebook(); 
		n1.turnOn();
		n1.display();
		n1.typing();
		n1.turnOff();
		
		// 하위클래스를 업캐스팅해서 new 사용가능
		Computer c1 = new Notebook();		
		c1.turnOn();
		c1.display();
		c1.typing();
		c1.turnOff();
		
		System.out.println();
		
		ManualCar mCar = new ManualCar();
		mCar.run();
		
		AICar aiCar = new AICar();
		aiCar.run();
		
		// 상수의 활용(static 선언으로 인스턴스 생성 안해도 됨)
		System.out.println(Define.SUCCESS);
//		Define.FI = 3.15; // final 이라서 변경 불가
		
	}
	
}
