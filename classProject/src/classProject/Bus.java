package classProject;

public class Bus {

	private int busNum;
	private int pCnt;
	private int price;
	
	// constructor
	public Bus(int busNum) {
		this.busNum = busNum;
		this.pCnt = 0;
		this.price = 0;
	}
	
	/*
	 * public void getMoney(int price) { this.price += price; pCnt++;
	 * System.out.println("������� 1000���� �޾Ҵ�."); System.out.println("���� �� �°���" + pCnt
	 * + "��, �� ������ " + price + "��"); }
	 */
	
	public void take(int price) {
		this.price += price;
		pCnt++;
	}
	
	public void showInfo() {
		System.out.println(busNum + "�� ������ �� �°��� " + pCnt + "���̰�, �� ������ " + price + "�Դϴ�.");
	}

	// getter/setter
	public int getBusNum() {
		return busNum;
	}
	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}

	public int getpCnt() {
		return pCnt;
	}
	public void setpCnt(int pCnt) {
		this.pCnt = pCnt;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
