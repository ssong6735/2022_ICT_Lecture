package gradeEx;

public class main {

	public static void main(String[] args) {
		
		System.out.println("���� ��� ���α׷� ����!");
		
		int math = 90;
		int science = 88;
		int english = 96;
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("����, ����, ���� ������ ���: " + me.average());
		
	}
	
}
