package extendsEx2;

public class Developer extends People {

	public Developer(String name, int age, String address, int height, int weight) {
		super(name, age, address, height, weight);
	}
	
	public void showLang() {
		System.out.println(getName() + "���� ����� �� �ִ� ���� " + "100�� �Դϴ�.");
	}
	
}
