

public class main {

	public static void main(String[] args) {
			
		/*
		 * Book[] bookArr1 = new Book[3]; Book[] bookArr2 = new Book[3];
		 * 
		 * bookArr1[0] = new Book("å1", "����1"); bookArr1[1] = new Book("å2", "����2");
		 * bookArr1[2] = new Book("å3", "����3");
		 * 
		 * System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		 * 
		 * bookArr1[0].setBookName("�ٸ�å1"); bookArr1[0].setAuthor("�ٸ�����1");
		 * 
		 * for(int i=0;i<bookArr2.length;i++) { bookArr2[i].showBookInfo(); }
		 * 
		 * bookArr2[0] = new Book(); bookArr2[1] = new Book(); bookArr2[2] = new Book();
		 * 
		 * for(int i=0;i<bookArr1.length;i++) {
		 * bookArr2[i].setBookName(bookArr1[i].getBookName());
		 * bookArr2[i].setAuthor(bookArr1[i].getAuthor()); }
		 * 
		 * bookArr1[0].setBookName("����"); bookArr1[0].setAuthor("�ڿϼ�");
		 * 
		 * for(int i=0;i<bookArr1.length;i++) { bookArr1[i].showBookInfo(); }
		 * 
		 * for(int i=0;i<bookArr2.length;i++) { bookArr2[i].showBookInfo(); }
		 */
		 
		
		/*
		 * Book book1 = new Book("å1", "����1"); Book book2 = new Book("å2", "����2");
		 * book2.showBookInfo(); book2 = book1; book2.showBookInfo();
		 * book1.setBookName("�ٸ�å1"); book1.setAuthor("�ٸ�����1"); book2.showBookInfo();
		 */
		
		
		
		  Book book1 = new Book("å1", "����1");
		  Book book2 = new Book("å2", "����2");
		  
		  System.out.println(book1.hashCode());
		  System.out.println(book2.hashCode());
		  
		  book2.setBookName(book1.getBookName());
		  book2.setAuthor(book1.getAuthor());
		  book2.showBookInfo();
		 		
		 

	}
	
}
