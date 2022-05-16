package classProject;

public class Worker {

	private String name;
	private int money;
	
	
	// constructor
	public Worker() {
		
	}
	public Worker(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	
	// method
	public void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
		System.out.println("버스를 탄다. 버스요금 1300원을 지불한다.");
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1800);
		this.money -= 1800;
		System.out.println("지하철을 탄다. 지하철요금 1800원을 지불한다.");
	}
	
	public void showInfo() {
		System.out.println(name + " 님이 현재 가지고 있는 돈은 " + money + "입니다.");
	}
	
	
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	
	
	
}
