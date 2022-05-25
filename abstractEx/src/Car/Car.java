package Car;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드
	public final void run() {
		this.turnOn();
		this.drive();
		this.stop();
		this.turnOff();
		System.out.println();
	}
	
}
