package extendsEx2;

public class Developer extends People {

	public Developer(String name, int age, String address, int height, int weight) {
		super(name, age, address, height, weight);
	}
	
	public void showLang() {
		System.out.println(getName() + "님이 사용할 수 있는 언어는 " + "100개 입니다.");
	}
	
}
