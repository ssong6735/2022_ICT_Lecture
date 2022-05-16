package functionEx;

public class functionEx {

	public static void main(String[] args) {
		
		String strMessage = "프로그램이 시작 되었습니다.";
		System.out.println(strMessage);
		
		int firstArg = 15;
		int secondArg = 15;
		int result = funcAdd(firstArg, secondArg);
		System.out.println(result);
		
		int num1 = 30;
		int num2 = 15;
		int result2 = funcMinus(num1, num2);
		System.out.println(result2);
		
		int result3 = funcMultiply(num1, num2);
		System.out.println(result3);
		
		int result4 = funcDivision(num1, num2);
		System.out.println(result4);
		
		int result5 = funcQuotient(num1, num2);
		System.out.println(result5);
		
	}
	
	static int funcAdd(int a, int b) {
		int result = a+b;
		return result;
	}
	
	static int funcMinus(int a, int b) {
		int result = a-b;
		return result;
	}
	
	static int funcMultiply(int a, int b) {
		int result = a*b;
		return result;
	}
	
	static int funcDivision(int a, int b) {
		int result = a/b;
		return result;
	}
	
	static int funcQuotient(int a, int b) {
		int result = a%b;
		return result;
	}
	
}
