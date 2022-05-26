
public class main {

	public static void main(String[] args) {
		
		Queue sQueue = new BookShelf();
		System.out.println("Queue 사용 시작!");
		sQueue.enQueue("1번 책");
		sQueue.enQueue("2번 책");
		sQueue.enQueue("3번 책");
		
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.deQueue());
		System.out.println("Queue 사용 끝!");
		System.out.println();
		
		
		Stack stack = new BookShelf();
		System.out.println("Stack 사용 시작!");
		stack.push("4번 책");
		stack.push("5번 책");
		stack.push("6번 책");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Stack 사용 끝!");
		
		
	}
	
}
