package classEx;

public class SSONG {

	String name; // �̸�
	String gender; // ����
	int age; // ����
	String phoneNum; // ����ó
	String address; // �ּ�	
	String hobby; // ���
	String specialty; // Ư��
	
	public SSONG() {
		System.out.println("������ ȣ��!");
		name = "��";
		gender = "F";
		age = 39;
	}
	public SSONG(String _name, String _gender, int _age, String _phoneNum, String _address, String _hobby, String _specialty) {
		System.out.println("�ι�° ������ ȣ��!");
		name = _name;
		gender = _gender;
		age = _age;
		phoneNum = _phoneNum;
		address = _address;
		hobby = _hobby;
		specialty = _specialty;
	}
	
	public void setName(String _name) {
		name = _name;
	}
	public String getName() {
		return name;
	}
	
	public void setGender(String _gender) {
		gender = _gender;
	}
	public String getGender() {
		return gender;
	}
	
	public void setAge(int _age) {
		age = _age;
	}
	public int getAge() {
		return age;
	}
	
	public void setPhoneNum(String _phoneNum) {
		phoneNum = _phoneNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setAddress(String _address) {
		address = _address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setHobby(String _hobby) {
		hobby = _hobby;
	}
	public String getHobby() {
		return hobby;
	}
	
	public void setSpecialty(String _specialty) {
		specialty = _specialty;
	}
	public String getSpecialty() {
		return specialty;
	}
	
	public void showInfo() {
		System.out.println("�̸�: " + getName());
		System.out.println("����: " + getGender());
		System.out.println("����: " + getAge());
		System.out.println("����ó: " + getPhoneNum());
		System.out.println("�ּ�: " + getAddress());
		System.out.println("���: " + getHobby());
		System.out.println("Ư��: " + getSpecialty());
	}
	
}
