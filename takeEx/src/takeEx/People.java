package takeEx;

public class People {

	String name; // �̸�
	int age; // ����
	int money; // ��
	String job; // ����
	
	
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
	
}
