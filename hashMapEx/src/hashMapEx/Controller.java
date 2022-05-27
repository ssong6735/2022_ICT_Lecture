package hashMapEx;

import java.util.HashMap;

public class Controller {

	public void setHashMap(HashMap<String, String> map) {
		System.out.println("이름: " + map.get("name"));
		System.out.println("핸드폰번호: " + map.get("phone"));
		System.out.println("주소: " + map.get("address"));
		System.out.println("키: " + map.get("height"));
		System.out.println("몸무게: " + map.get("weight"));
	}
	
}
