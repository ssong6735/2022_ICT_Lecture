package exceptionEx;

public class main {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		try {
			System.out.println(arr[6]);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		
	}
	
}
