package abstractEx;

import Car.AICar;
import Car.ManualCar;
import Computer.Computer;
import Computer.Notebook;
import Constant.Define;

public class main {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer(); // new ����x
		
		// �߻�Ŭ���� �������̵��ؼ� new ��밡��
		Notebook n1 = new Notebook(); 
		n1.turnOn();
		n1.display();
		n1.typing();
		n1.turnOff();
		
		// ����Ŭ������ ��ĳ�����ؼ� new ��밡��
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
		
		// ����� Ȱ��(static �������� �ν��Ͻ� ���� ���ص� ��)
		System.out.println(Define.SUCCESS);
//		Define.FI = 3.15; // final �̶� ���� �Ұ�
		
	}
	
}
