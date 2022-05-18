

public class main {

	public static void main(String[] args) {
			
		/*
		 * Book[] bookArr1 = new Book[3]; Book[] bookArr2 = new Book[3];
		 * 
		 * bookArr1[0] = new Book("책1", "저자1"); bookArr1[1] = new Book("책2", "저자2");
		 * bookArr1[2] = new Book("책3", "저자3");
		 * 
		 * System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		 * 
		 * bookArr1[0].setBookName("다른책1"); bookArr1[0].setAuthor("다른저자1");
		 * 
		 * for(int i=0;i<bookArr2.length;i++) { bookArr2[i].showBookInfo(); }
		 * 
		 * bookArr2[0] = new Book(); bookArr2[1] = new Book(); bookArr2[2] = new Book();
		 * 
		 * for(int i=0;i<bookArr1.length;i++) {
		 * bookArr2[i].setBookName(bookArr1[i].getBookName());
		 * bookArr2[i].setAuthor(bookArr1[i].getAuthor()); }
		 * 
		 * bookArr1[0].setBookName("나목"); bookArr1[0].setAuthor("박완서");
		 * 
		 * for(int i=0;i<bookArr1.length;i++) { bookArr1[i].showBookInfo(); }
		 * 
		 * for(int i=0;i<bookArr2.length;i++) { bookArr2[i].showBookInfo(); }
		 */
		 
		
		/*
		 * Book book1 = new Book("책1", "저자1"); Book book2 = new Book("책2", "저자2");
		 * book2.showBookInfo(); book2 = book1; book2.showBookInfo();
		 * book1.setBookName("다른책1"); book1.setAuthor("다른저자1"); book2.showBookInfo();
		 */
		
		
		
		  Book book1 = new Book("책1", "저자1");
		  Book book2 = new Book("책2", "저자2");
		  
		  System.out.println(book1.hashCode());
		  System.out.println(book2.hashCode());
		  
		  book2.setBookName(book1.getBookName());
		  book2.setAuthor(book1.getAuthor());
		  book2.showBookInfo();
		 		
		 

	}
	
}
