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
		System.out.println("������ ź��. ������� 1300���� �����Ѵ�.");
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1800);
		this.money -= 1800;
		System.out.println("����ö�� ź��. ����ö��� 1800���� �����Ѵ�.");
	}
	
	public void showInfo() {
		System.out.println(name + " ���� ���� ������ �ִ� ���� " + money + "�Դϴ�.");
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
