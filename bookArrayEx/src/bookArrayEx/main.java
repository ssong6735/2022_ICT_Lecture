package bookArrayEx;

public class main {

	public static void main(String[] args) {
		
		/*
		 * Book[] bookArr = new Book[5];
		 * 
		 * bookArr[0] = new Book("해리포터", "J.K.롤링"); bookArr[1] = new Book("정의란 무엇인가",
		 * "마이클 샌델"); bookArr[2] = new Book("Do it java 프로그래밍", "박은종"); bookArr[3] = new
		 * Book("어린왕자", "앙투안 드 생텍쥐페리"); bookArr[4] = new Book("괭이 부리말 아이들", "김중미");
		 * 
		 * for(int i=0;i<bookArr.length;i++) { bookArr[i].showBookInfo(); }
		 */
		
		
		
		/*
		 * Book[] bookArr1 = new Book[3]; Book[] bookArr2 = new Book[3];
		 * 
		 * bookArr1[0] = new Book("책1", "저자1"); bookArr1[1] = new Book("책2", "저자2");
		 * bookArr1[2] = new Book("책3", "저자3");
		 * 
		 * System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		 * 
		 * for(int i=0;i<bookArr2.length;i++) { bookArr2[i].showBookInfo(); }
		 */
		 
		
		/*
		 * Book book1 = new Book("책1", "저자1"); Book book2; book2 = book1;
		 * book2.showBookInfo(); book1.setBookName("다른책1"); book1.setAuthor("다른저자1");
		 * book2.showBookInfo();
		 */
		
		
		 Book[] bookArr1 = new Book[3];
		 Book[] bookArr2 = new Book[3];
		 
		 bookArr1[0] = new Book("책1", "저자1"); 
		 bookArr1[1] = new Book("책2", "저자2");
		 bookArr1[2] = new Book("책3", "저자3");
		 
		 System.arraycopy(bookArr1, 0, bookArr2, 0, bookArr1.length);
		 
		 bookArr1[0].setBookName("다른책1");
		 bookArr1[0].setAuthor("다른저자1");
		 
		 for(int i=0;i<bookArr2.length;i++) { 
			 bookArr2[i].showBookInfo(); 
		 }
		
		
	}
	
}
