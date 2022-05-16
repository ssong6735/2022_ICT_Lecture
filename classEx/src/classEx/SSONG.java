package classEx;

public class SSONG {

	String name; // 이름
	String gender; // 성별
	int age; // 나이
	String phoneNum; // 연락처
	String address; // 주소	
	String hobby; // 취미
	String specialty; // 특기
	
	public SSONG() {
		System.out.println("생성자 호출!");
		name = "쏭";
		gender = "F";
		age = 39;
	}
	public SSONG(String _name, String _gender, int _age, String _phoneNum, String _address, String _hobby, String _specialty) {
		System.out.println("두번째 생성자 호출!");
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
		System.out.println("이름: " + getName());
		System.out.println("성별: " + getGender());
		System.out.println("나이: " + getAge());
		System.out.println("연락처: " + getPhoneNum());
		System.out.println("주소: " + getAddress());
		System.out.println("취미: " + getHobby());
		System.out.println("특기: " + getSpecialty());
	}
	
}
