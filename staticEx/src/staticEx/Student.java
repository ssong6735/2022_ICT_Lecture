package staticEx;

public class Student {

	static int serialNum = 1000;
	int grade;
	
	public static void addCnt() {
		serialNum++;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
}
