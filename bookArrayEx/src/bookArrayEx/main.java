package bookArrayEx;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Book[] bookArr = new Book[5];
		 * 
		 * bookArr[0] = new Book("�ظ�����", "J.K.�Ѹ�"); bookArr[1] = new Book("���Ƕ� �����ΰ�",
		 * "����Ŭ ����"); bookArr[2] = new Book("Do it java ���α׷���", "������"); bookArr[3] = new
		 * Book("�����", "������ �� �������丮"); bookArr[4] = new Book("���� �θ��� ���̵�", "���߹�");
		 * 
		 * for(int i=0;i<bookArr.length;i++) { bookArr[i].showBookInfo(); }
		 */
		
		
		
		/*
		 * Book[] bookArr1 = new Book[3]; Book[] bookArr2 = new Book[3];
		 * 
		 * bookArr1[0] = new Book("å1", "����1"); bookArr1[1] = new Book("å2", "����2");
		 * bookArr1[2] = new Book("å3", "����3");
		 * 
		 * System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		 * 
		 * for(int i=0;i<bookArr2.length;i++) { bookArr2[i].showBookInfo(); }
		 */
		 
		
		/*
		 * Book book1 = new Book("å1", "����1"); Book book2; book2 = book1;
		 * book2.showBookInfo(); book1.setBookName("�ٸ�å1"); book1.setAuthor("�ٸ�����1");
		 * book2.showBookInfo();
		 */
		
		
		 Book[] bookArr1 = new Book[3];
		 Book[] bookArr2 = new Book[3];
		 
		 bookArr1[0] = new Book("å1", "����1"); 
		 bookArr1[1] = new Book("å2", "����2");
		 bookArr1[2] = new Book("å3", "����3");
		 
		 System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		 
		 bookArr1[0].setBookName("�ٸ�å1");
		 bookArr1[0].setAuthor("�ٸ�����1");
		 
		 for(int i=0;i<bookArr2.length;i++) { 
			 bookArr2[i].showBookInfo(); 
		 }
		
		
	}
	
}
