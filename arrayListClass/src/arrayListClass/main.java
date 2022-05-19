package arrayListClass;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.clear();
		
		arrayList.add("aaaaa");
		arrayList.add("bbbbb");
		arrayList.add("ccccc");
//		arrayList.add(12345);
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println();
		
		System.out.println("Áö¿î °ª: " + arrayList.remove(1));;
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
	
}
