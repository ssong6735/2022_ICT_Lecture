

public class main {

	public static void main(String[] args) {
			
		// 1. Book Ŭ���� 5���� ���ҷ� ���� ù��° �迭 ����
		Book[] bookArr1 = new Book[5];
		
		// 2. ������ Book Ŭ������ �ν��Ͻ� ���� �� å�̸�, ���� ����
		bookArr1[0] = new Book("å1", "����1");
		bookArr1[1] = new Book("å2", "����2");
		bookArr1[2] = new Book("å3", "����3");
		bookArr1[3] = new Book("å4", "����4");
		bookArr1[4] = new Book("å5", "����5");
		
		// 3. Book Ŭ���� 5���� ���ҷ� ���� �ι�° �迭 ����
		Book[] bookArr2 = new Book[5];
		
		// 4. �ι�° �迭�� ù��° �迭�� ���� ���� �Ѵ�(System.arraycopy)
		System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		
		// 5. Book Ŭ���� 5���� ���ҷ� ���� ����° �迭 ����
		Book[] bookArr3 = new Book[5];
		
		// 6. ����° �迭�� ù��° �迭�� ���� ���� �Ѵ�.
		for(int i=0;i<bookArr1.length;i++) {
			bookArr3[i] = new Book(); 
			bookArr3[i].setBookName(bookArr1[i].getBookName());
			bookArr3[i].setAuthor(bookArr1[i].getAuthor());
		}
		
		System.out.println(bookArr1[0].hashCode());
		System.out.println(bookArr2[0].hashCode());
		System.out.println(bookArr3[0].hashCode());
		
		bookArr1[0].setBookName("�ٸ�å1");
		bookArr1[0].setAuthor("�ٸ�����1");
		
		bookArr1[0].showBookInfo();		
		bookArr2[0].showBookInfo();		
		bookArr3[0].showBookInfo();

	}
	
}
