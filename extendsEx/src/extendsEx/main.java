package extendsEx;

public class main {

	public static void main(String[] args) {
		
		Circle cCircle = new Circle();		
		System.out.println("x��ǥ�� : " + cCircle.getX());
		System.out.println("y��ǥ�� : " + cCircle.getY());
		
		cCircle.setX(20);
		cCircle.setY(30);		
		System.out.println("x��ǥ�� : " + cCircle.getX());
		System.out.println("y��ǥ�� : " + cCircle.getY());
		
		Circle cCircle2 = new Circle(20,30);
		System.out.println("x��ǥ�� : " + cCircle.getX());
		System.out.println("y��ǥ�� : " + cCircle.getY());
		
		
	}
	
}
