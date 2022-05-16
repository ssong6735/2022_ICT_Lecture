package functionDetail;

public class main {
	
	public static void main(String[] args) {
		
		System.out.println("프로그램이 시작 되었습니다.");
		
		Method func = new Method();
		
		String data = "데이터";
		func.setData(data, data);
		System.out.println("main data: " + data);
		
		int num = 10;
		func.setInt(num, num);
		System.out.println("main num: " + num);
		
		
	}

}
