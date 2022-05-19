package extendsEx2;

public class People {
	
	private String name; //이름
	private int age; //나이
	private String address; //주소
	private int height; //키
	private int weight; //몸무게
	
	
	public People(String name, int age, String address, int height, int weight) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("이름: "+getName());
		System.out.println("나이: "+getAge());
		System.out.println("주소: "+getAddress());
		System.out.println("키: "+getHeight());
		System.out.println("몸무게: "+getWeight());
		System.out.println();
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	

}
