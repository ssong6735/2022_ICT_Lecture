package bookArrayListEx;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<Book> bookArrayList = new ArrayList<Book>();
		
		bookArrayList.add(new Book("����ȭ�����Ǿ����ϴ�","������"));
		bookArrayList.add(new Book("����","����������������"));
		bookArrayList.add(new Book("�巡�����","�̿���"));
		bookArrayList.add(new Book("�����","�����㺣��"));
		bookArrayList.add(new Book("�ٺ�ġ�ڵ�","�����"));
		
		for(int i=0;i<bookArrayList.size();i++) {
			Book book = bookArrayList.get(i);
			book.showBookInfo();
		}
		
		
		
	}
	
}
