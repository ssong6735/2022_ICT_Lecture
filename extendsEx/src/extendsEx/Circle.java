package extendsEx;

public class Circle extends Point{

	public Circle() {
		System.out.println("자식 기본 생성자 호출!");
	}
	
	public Circle(int x, int y) {
		super(x,y);
		System.out.println("자식 인자 생성자 호출!");
	}
	
}
