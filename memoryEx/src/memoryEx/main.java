package memoryEx;

public class main {

	public static void main(String[] args) {
		
		// �������� (���ÿ� ����, �������� ����� ������)
		int a = 5;
		int b = 6;
		b = a; // ������ ����x / ���� �����		
		System.out.println(b);
		a = 10;
		System.out.println(b);
		
		
		
		// �ν��Ͻ� ���� (�� �޸𸮿� �ö�)
		// ���α׷� ����� ������ �÷��Ͱ� �˾Ƽ� ������
		Book book1;
		book1 = new Book();
		Book book2;
		book2 = new Book();
		book2 = book1; // ������ ����o / ���� ����Ǵ°� �ƴ�
		// �������� ��찡 ���� ����
		
		
	}
	
}
