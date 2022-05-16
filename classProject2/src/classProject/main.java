package classProject;

public class main {

	public static void main(String[] args) {
		
		Student hong = new Student("È«±æµ¿", 16, 5000);		
		Bus b301 = new Bus(301);		
		Subway s1111 = new Subway(1111);
		Student kim = new Student("±è³ª³ª", 18, 15000);		
		
		hong.showInfo();
		hong.takeBus(b301);
		hong.takeSubway(s1111);
		hong.showInfo();
		
		System.out.println();
		
		kim.showInfo();
		kim.takeSubway(s1111);
		kim.showInfo();
		
		System.out.println();
		
		b301.showInfo();		
		s1111.showInfo();
		
		System.out.println();
		
		/*
		 * Student park = new Student("¹Úº¸°Ë", 25, 3000); park.takeBus(1000); Bus b310 =
		 * new Bus(310); b310.getMoney(1000);
		 */
	}
	
	
}
