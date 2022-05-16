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
	 * System.out.println("버스요금 1000원을 받았다."); System.out.println("현재 총 승객은" + pCnt
	 * + "명, 총 수입은 " + price + "원"); }
	 */
	
	public void take(int price) {
		this.price += price;
		pCnt++;
	}
	
	public void showInfo() {
		System.out.println(busNum + "번 버스의 총 승객은 " + pCnt + "명이고, 총 수입은 " + price + "입니다.");
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
