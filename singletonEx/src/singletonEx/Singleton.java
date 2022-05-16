package singletonEx;

public class Singleton {

	// 멤버변수
	private static Singleton instance;
	
	// private 생성자
	private Singleton() {
		System.out.println("Singleton 생성자 호출!");
	}
	
	// 싱글톤패턴(하나의 인스턴스만 존재) 조건
	// 처음에만 인스턴스를 생성하고 이후에는 기존에 만들어진
	// 인스턴스를 반환한다.
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
