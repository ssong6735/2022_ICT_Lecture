package functionDetail;

public class main {
	
	public static void main(String[] args) {
		
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
		
		Method func = new Method();
		
		String data = "������";
		func.setData(data, data);
		System.out.println("main data: " + data);
		
		int num = 10;
		func.setInt(num, num);
		System.out.println("main num: " + num);
		
		
	}

}
