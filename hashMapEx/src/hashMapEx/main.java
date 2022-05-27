package hashMapEx;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("name", "송미선");
		map1.put("phone", "01062516735");
		map1.put("address", "대전광역시 서구 갈마로");
		map1.put("height", "169");
		map1.put("weight", "비밀");
		
		System.out.println(map1);
		
		Controller cont = new Controller();
		cont.setHashMap(map1);
		
	}
	
}
