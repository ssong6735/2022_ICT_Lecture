package classProject;

public class Student {

	private String name;
	private int age;
	private int money;
	
	// constructor
	public Student() {
		
	}
	public Student(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	/*
	 * public void takeBus(int price) { this.money -= price;
	 * System.out.println("������� 1000���� �����Ѵ�."); System.out.println("���� �������� " +
	 * money + "��"); }
	 */
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		System.out.println("������ ź��. ������� 1000���� �����Ѵ�.");
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
		System.out.println("����ö�� ź��. ����ö��� 1500���� �����Ѵ�.");
	}
	
	public void showInfo() {
		System.out.println(name + " �л��� ���� ������ �ִ� ���� " + money + "�Դϴ�.");
	}

	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}
