

public class main {

	public static void main(String[] args) {
			
		// 1. Book 클래스 5개를 원소로 가진 첫번째 배열 생성
		Book[] bookArr1 = new Book[5];
		
		// 2. 각각의 Book 클래스의 인스턴스 생성 및 책이름, 저자 대입
		bookArr1[0] = new Book("책1", "저자1");
		bookArr1[1] = new Book("책2", "저자2");
		bookArr1[2] = new Book("책3", "저자3");
		bookArr1[3] = new Book("책4", "저자4");
		bookArr1[4] = new Book("책5", "저자5");
		
		// 3. Book 클래스 5개를 원소로 가진 두번째 배열 생성
		Book[] bookArr2 = new Book[5];
		
		// 4. 두번째 배열에 첫번째 배열을 얕은 복사 한다(System.arraycopy)
		System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		
		// 5. Book 클래스 5개를 원소로 가진 세번째 배열 생성
		Book[] bookArr3 = new Book[5];
		
		// 6. 세번째 배열에 첫번째 배열을 깊은 복사 한다.
		for(int i=0;i<bookArr1.length;i++) {
			bookArr3[i] = new Book(); 
			bookArr3[i].setBookName(bookArr1[i].getBookName());
			bookArr3[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		System.out.println(bookArr1[0].hashCode());
		System.out.println(bookArr2[0].hashCode());
		System.out.println(bookArr3[0].hashCode());
		
		bookArr1[0].setBookName("다른책1");
		bookArr1[0].setAuthor("다른저자1");
		
		bookArr1[0].showBookInfo();		
		bookArr2[0].showBookInfo();		
		bookArr3[0].showBookInfo();

	}
	
}
