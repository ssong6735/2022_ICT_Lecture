package takeEx;

public class People {

	private String name; // �̸�
	private int age; // ����
	private int money; // ��
	private String job; // ����
	
	
	// constructor
	public People(String name, int age, int money, String job) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.job = job;
		
		System.out.println("------ ������ ��� ------");
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		System.out.println("�� : " + this.money);
		System.out.println("���� : " + this.job);
		System.out.println("----------------------\n");
	}
	
	
	// method
	public boolean payFee(int price) {
		if(this.money<price) {
			return false;
		} else {
			this.money -= price;
			return true;
		}
	}
	
	public void takeBus() {
		Bus bus = Bus.getBusIns();
		bus.takeBus(this);
	}
	
	public void takeSubway() {
		Subway subway = Subway.getSubwayIns();
		subway.takeSubway(this);
	}

	
	// get/set method
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

	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
