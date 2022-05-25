package Car;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// ���ø� �޼���
	public final void run() {
		this.turnOn();
		this.drive();
		this.stop();
		this.turnOff();
		System.out.println();
	}
	
}
