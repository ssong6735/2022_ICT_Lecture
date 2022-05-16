
public class main {

	public static void main(String[] args) {
		
		// 1. int형 변수 x가 10보다 크고 20보다 작을때 참을 반환
		int x = 11;
		if(x>10&&x<20) {
			System.out.println("true");
		}
		
		
		// 2. char형 변수 ch가 'x' 또는 'X' 일때 참을 반환
		char ch = 'x'; 
		if(ch=='x'||ch=='X') {
			System.out.println("true");			
		}
				
		
		// 3. char형 변수 ch가 숫자('0'~'9')일때 참을 반환
		ch = '2';		
		if((int)ch>=48&&(int)ch<=57) {
			System.out.println("true");			
		} else {
			System.out.println("false");			
		}
		
	}
	
}
