package staticEx;

public class main {

	public static void main(String[] args) {
		
		Student.addCnt();
		System.out.println(Student.serialNum);
		
		Student student = new Student();
		System.out.println(student.serialNum);
		
		student.addCnt();
		System.out.println(student.serialNum);
		
	}
	
}
