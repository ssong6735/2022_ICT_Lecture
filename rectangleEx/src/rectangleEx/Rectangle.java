package rectangleEx;

public class Rectangle {

	/*
	 *  int 타입의 x, y, width, height 필드: 사각형을 구성하는 점과 크기정보
	 *  x, y, width, height 값을 매개변수(인자)로 받아 필드를 초기화하는 생성자
	 *  int square(): 사각형 넓이 return (width*height)
	 *  void show(): 사각형의 좌표와 넓이를 화면에 출력
	 *  Boolean contains(Rectangle r): 매개변수(인자)로 받은 r이 현재 사각형 안에 있으면 true 리턴
	 */
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		int square = this.width * this.height;
		return square;
	}
	
	public void show() {
		System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형 \n", x,y,width,height);
	}
	
	Boolean contains(Rectangle r) {

		/*
		 *  this 밑변 > 비교 밑변
		 *  this 높이 > 비교 높이
		 *  this x 좌표 <= 비교 x 좌표
		 *  this y 좌표 <= 비교 y 좌표
		 *  모두 충족할때 true 반환
		 */
		
		if(((this.x+this.width)>(r.x+r.width)) && ((this.y+this.height)>(r.y+r.height)) && (this.x <= r.x) && (this.y <= r.y)) {			
			return true;
		} else {
//			System.out.println("f");
			return false;
		}
		
	}
}
