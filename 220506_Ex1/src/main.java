
public class main {

	public static void main(String[] args) {
		
		// 1. int�� ���� x�� 10���� ũ�� 20���� ������ ���� ��ȯ
		int x = 11;
		if(x>10&&x<20) {
			System.out.println("true");
		}
		
		
		// 2. char�� ���� ch�� 'x' �Ǵ� 'X' �϶� ���� ��ȯ
		char ch = 'x'; 
		if(ch=='x'||ch=='X') {
			System.out.println("true");			
		}
				
		
		// 3. char�� ���� ch�� ����('0'~'9')�϶� ���� ��ȯ
		ch = '2';		
		if((int)ch>=48&&(int)ch<=57) {
			System.out.println("true");			
		} else {
			System.out.println("false");			
		}
		
	}
	
}
