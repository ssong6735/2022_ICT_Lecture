package extendsEx2;

public class People {
	
	private String name; //�̸�
	private int age; //����
	private String address; //�ּ�
	private int height; //Ű
	private int weight; //������
	
	
	public People(String name, int age, String address, int height, int weight) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("�̸�: "+getName());
		System.out.println("����: "+getAge());
		System.out.println("�ּ�: "+getAddress());
		System.out.println("Ű: "+getHeight());
		System.out.println("������: "+getWeight());
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
