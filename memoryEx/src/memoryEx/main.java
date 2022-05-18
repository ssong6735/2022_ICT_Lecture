package memoryEx;

public class main {

	public static void main(String[] args) {
		
		// 지역변수 (스택에 생성, 스코프를 벗어나면 지워짐)
		int a = 5;
		int b = 6;
		b = a; // 포인터 연결x / 값이 변경됨		
		System.out.println(b);
		a = 10;
		System.out.println(b);
		
		
		
		// 인스턴스 생성 (힙 메모리에 올라감)
		// 프로그램 종료시 가비지 컬랙터가 알아서 지워줌
		Book book1;
		book1 = new Book();
		Book book2;
		book2 = new Book();
		book2 = book1; // 포인터 연결o / 값이 변경되는게 아님
		// 위에같은 경우가 얕은 복사
		
		
	}
	
}
