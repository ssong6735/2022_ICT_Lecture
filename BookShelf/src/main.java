
public class main {

	public static void main(String[] args) {
		
		Queue sQueue = new BookShelf();
		System.out.println("Queue ��� ����!");
		sQueue.enQueue("1�� å");
		sQueue.enQueue("2�� å");
		sQueue.enQueue("3�� å");
		
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.deQueue());
		System.out.println(sQueue.deQueue());
		System.out.println("Queue ��� ��!");
		System.out.println();
		
		
		Stack stack = new BookShelf();
		System.out.println("Stack ��� ����!");
		stack.push("4�� å");
		stack.push("5�� å");
		stack.push("6�� å");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Stack ��� ��!");
		
		
	}
	
}
