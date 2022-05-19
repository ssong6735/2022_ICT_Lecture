package extendsEx;

public class main {

	public static void main(String[] args) {
		
		Circle cCircle = new Circle();		
		System.out.println("xÁÂÇ¥´Â : " + cCircle.getX());
		System.out.println("yÁÂÇ¥´Â : " + cCircle.getY());
		
		cCircle.setX(20);
		cCircle.setY(30);		
		System.out.println("xÁÂÇ¥´Â : " + cCircle.getX());
		System.out.println("yÁÂÇ¥´Â : " + cCircle.getY());
		
		Circle cCircle2 = new Circle(20,30);
		System.out.println("xÁÂÇ¥´Â : " + cCircle.getX());
		System.out.println("yÁÂÇ¥´Â : " + cCircle.getY());
		
		
	}
	
}
