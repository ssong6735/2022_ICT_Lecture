package rectangleEx;

public class Rectangle {

	/*
	 *  int Ÿ���� x, y, width, height �ʵ�: �簢���� �����ϴ� ���� ũ������
	 *  x, y, width, height ���� �Ű�����(����)�� �޾� �ʵ带 �ʱ�ȭ�ϴ� ������
	 *  int square(): �簢�� ���� return (width*height)
	 *  void show(): �簢���� ��ǥ�� ���̸� ȭ�鿡 ���
	 *  Boolean contains(Rectangle r): �Ű�����(����)�� ���� r�� ���� �簢�� �ȿ� ������ true ����
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
		System.out.printf("(%d,%d)���� ũ�Ⱑ %dx%d�� �簢�� \n", x,y,width,height);
	}
	
	Boolean contains(Rectangle r) {

		/*
		 *  this �غ� > �� �غ�
		 *  this ���� > �� ����
		 *  this x ��ǥ <= �� x ��ǥ
		 *  this y ��ǥ <= �� y ��ǥ
		 *  ��� �����Ҷ� true ��ȯ
		 */
		
		if(((this.x+this.width)>(r.x+r.width)) && ((this.y+this.height)>(r.y+r.height)) && (this.x <= r.x) && (this.y <= r.y)) {			
			return true;
		} else {
//			System.out.println("f");
			return false;
		}
		
	}
}
