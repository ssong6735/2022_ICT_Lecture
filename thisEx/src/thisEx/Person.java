 package thisEx;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	private String phoneNum;
	
	public Person() {
		this("쏭", 39, "F", "010-6251-6735");
		System.out.println("기본생성자 호출!");
	}
	
	public Person(String name, int age, String gender, String phoneNum) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}
	
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
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void showThis() {
		System.out.println(this);
	}
	
	public void showInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		System.out.println(this.phoneNum);
	}

}
