package extendsEx2;

public class Police extends People {

	public Police(String name, int age, String address, int height, int weight) {
		super(name, age, address, height, weight);
	}
	
	public void showExper() {
		System.out.println(getName() + "님의 경력은 " + "8년 입니다.");
	}
	
}
