package hashMapEx;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "�۹̼�");
		map1.put("phone", "01062516735");
		map1.put("address", "���������� ���� ������");
		map1.put("height", "169");
		map1.put("weight", "���");
		
		System.out.println(map1);
		
		Controller cont = new Controller();
		cont.setHashMap(map1);
		
	}
	
}
