
public class BookShelf extends Shelf implements Queue, Stack {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
		System.out.println(title+" 추가");
	}

	@Override
	public String deQueue() {
		if(getSize()<=0) {
			return "큐가 비었습니다.";
		}
		return shelf.remove(0) + " 제거";
	}

	@Override
	public int getSize() {
		return getCount();
	}

	@Override
	public void push(String title) {
		shelf.add(title);
		System.out.println(title+" 추가");
	}

	@Override
	public String pop() {
		if(getSize()==0) {
			return "스택이 비었습니다.";
		}
//		return shelf.remove(shelf.size()-1) + " 제거";
		return shelf.remove(getCount()-1) + " 제거";
	}
	
	@Override
	public int getStackSize() {
		return getCount();
	}
	
}
