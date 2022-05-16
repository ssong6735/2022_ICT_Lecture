package thisEx;

public class main {

	public static void main(String[] args) {
		
		System.out.println("P/G start!");
		
		/*
		 * Person person1 = new Person("송미선", 39, "여성", "6735");
		 * System.out.println(person1); person1.showThis(); person1.showInfo();
		 * 
		 * Person person2 = new Person(); person2.showInfo();
		 */
		
		
		Student student1 = new Student();
		Student student2 = new Student("송미선",39,200228058);
		
		student1.showInfo();
		student2.showInfo();
		
		
		
	}
	
}
