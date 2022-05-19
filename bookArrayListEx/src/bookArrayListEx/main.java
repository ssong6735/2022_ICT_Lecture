package bookArrayListEx;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		
		bookArrayList.add(new Book("무궁화꽃이피었습니다","김진명"));
		bookArrayList.add(new Book("개미","베르나르베르베르"));
		bookArrayList.add(new Book("드래곤라자","이영도"));
		bookArrayList.add(new Book("어린왕자","생텍쥐베리"));
		bookArrayList.add(new Book("다빈치코드","댄브라운"));
		
		for(int i=0;i<bookArrayList.size();i++) {
			Book book = bookArrayList.get(i);
			book.showBookInfo();
		}
		
		
		
	}
	
}
