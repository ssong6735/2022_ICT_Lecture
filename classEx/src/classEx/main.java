package classEx;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Student student1; // 클래스 선언(껍데기) String studentName = ""; // String 참조 자료형 변수
		 * 선언 및 초기화
		 * 
		 * student1 = new Student(); // 인스턴스 생성(클래스를 컴퓨터에게 사용하겠다고 말함)
		 * student1.setStudentName("송미선"); // student 클래스 멤버변수에 값을 넣음 studentName =
		 * student1.getStudentName(); // student 클래스 멤버변수에서 값을 가져옴
		 * System.out.println(studentName); // 가져온 student 클래스 변수값을 출력
		 * 
		 * student1.setStudentID(200228058); student1.setAge(39);
		 * student1.setAddress("대전광역시 서구 갈마로99"); student1.setGender("F");
		 * student1.setGrade(3); student1.setGroup(3);
		 * student1.setPhoneNum("010-6251-6735");
		 * 
		 * int studentID = student1.getStudentID(); int age = student1.getAge(); String
		 * address = student1.getAddress(); String gender = student1.getGender(); int
		 * grade = student1.getGrade(); int group = student1.getGroup(); String phoneNum
		 * = student1.getPhoneNum();
		 * 
		 * System.out.println("학번: " + studentID); System.out.println("이름: " +
		 * studentName); System.out.println("학년: " + grade); System.out.println("반  : "
		 * + group); System.out.println("성별: " + gender); System.out.println("나이: " +
		 * age); System.out.println("주소: " + address); System.out.println("전화: " +
		 * phoneNum);
		 */
		
		SSONG ssong;
//		ssong = new SSONG();
		ssong = new SSONG("송미선","여성",39,"010-6251-6735","대전광역시 서구","유튜브","멍때리기");
		ssong.showInfo();
		
//		ssong.setName("송미선");
//		ssong.setGender("F");
//		ssong.setAge(39);
//		ssong.setPhoneNum("010-6251-6735");
//		ssong.setAddress("대전광역시 서구 갈마로99");
//		ssong.setHobby("게임");
//		ssong.setSpecialty("사물놀이");
		
//		String name = ssong.getName();
//		String gender = ssong.getGender();
//		int age = ssong.getAge();
//		String phoneNum = ssong.getPhoneNum();
//		String address = ssong.getAddress();
//		String hobby = ssong.getHobby();
//		String specialty = ssong.getSpecialty();
		
//		System.out.println("이름: " + name);
//		System.out.println("성별: " + gender);
//		System.out.println("나이: " + age);
//		System.out.println("연락처: " + phoneNum);
//		System.out.println("주소: " + address);
//		System.out.println("취미: " + hobby);
//		System.out.println("특기: " + specialty);
		
	}
	
}
