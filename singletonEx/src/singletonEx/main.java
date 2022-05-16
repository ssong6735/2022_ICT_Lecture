package singletonEx;

public class main {

	public static void main(String[] args) {
		
		// 인스턴스가 하나만 생성
		Singleton stIns1 = Singleton.getInstance();
		Singleton stIns2 = Singleton.getInstance();
		Singleton stIns3 = Singleton.getInstance();
		
		System.out.println(stIns1);
		System.out.println(stIns2);
		System.out.println(stIns3);
		
		// 인스턴스가 각각 생성
		Basic basic1 = new Basic();
		Basic basic2 = new Basic();
		System.out.println(basic1);
		System.out.println(basic2);		
		
	}
	
}
