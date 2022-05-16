package classProject;

public class Subway {

	private int subwayNum;
	private int pCnt;
	private int price;
	
	// constructor
	public Subway(int subwayNum) {
		this.subwayNum = subwayNum;
		this.pCnt = 0;
		this.price = 0;
	}
	
	public void take(int price) {
		this.price += price;
		pCnt++;
	}
	
	public void showInfo() {
		System.out.println(subwayNum + "π¯ ¡ˆ«œ√∂¿« √— Ω¬∞¥¿∫ " + pCnt + "∏Ì¿Ã∞Ì, √— ºˆ¿‘¿∫ " + price + "¿‘¥œ¥Ÿ.");
	}

	// getter/setter
	public int getSubwayNum() {
		return subwayNum;
	}
	public void setSubwayNum(int subwayNum) {
		this.subwayNum = subwayNum;
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
