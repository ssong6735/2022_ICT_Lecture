package hashMapEx;

import java.util.HashMap;

public class Controller {

	public void setHashMap(HashMap<String, String> map) {
		System.out.println("�̸�: " + map.get("name"));
		System.out.println("�ڵ�����ȣ: " + map.get("phone"));
		System.out.println("�ּ�: " + map.get("address"));
		System.out.println("Ű: " + map.get("height"));
		System.out.println("������: " + map.get("weight"));
	}
	
}
