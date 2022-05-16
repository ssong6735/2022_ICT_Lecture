package thisEx;

public class Student {

	String name;
	int age;
	int stuNum;
	
	public Student() {
		this("이름없음", 1, 2022);
	}
	
	public Student(String name, int age, int stuNum) {
		this.name = name;
		this.age = age;
		this.stuNum = stuNum;
	}
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(stuNum);
	}
	
	
}
