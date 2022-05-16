package classProject;

public class Bus {

	private static Bus busNum;
	
	private int pCnt;
	private int price;
	
	
	// constructor
	public static Bus bus() {
		if(busNum == null) {
			busNum = new Bus();
		}
		return busNum;
	}
	
	public Bus(int busNum) {
		this.busNum = busNum;
		this.pCnt = 0;
		this.price = 0;
	}
	
	
	// method
	public void take(int price) {
		this.price += price;
		pCnt++;
	}
	
	public void showInfo() {
		System.out.println(busNum + "¹ø ¹ö½ºÀÇ ÃÑ ½Â°´Àº " + pCnt + "¸íÀÌ°í, ÃÑ ¼öÀÔÀº " + price + "ÀÔ´Ï´Ù.");
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
