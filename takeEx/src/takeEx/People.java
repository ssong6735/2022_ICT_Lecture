package takeEx;

public class People {

	String name; // 이름
	int age; // 나이
	int money; // 돈
	String job; // 직업
	
	
	// constructor
	public People(String name, int age, int money, String job) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.job = job;
		
		System.out.println("------ 생성한 사람 ------");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("돈 : " + this.money);
		System.out.println("직업 : " + this.job);
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
