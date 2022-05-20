package arrayPrac4;

public class main {

	public static void main(String[] args) {
		
		/*
		 * 다음의 프로그램을 작성하시오.
		 * (가로줄과 세로줄에 4,5,6이 겹치지 않도록 문자열 채우기)
		 * 1. 배열을 생성하고 아래 형식과 같이 값 대입
		 *    (size: 3x3, variable: String)
		 * 2. 해당 배열에 문자열 4,5,6이 겹치지 않게 값 채우기
		 * 3. 아래와 같이 출력
		 *    -----
		 *    6 5 4
		 *    5 4 6
		 *    4 6 5
		 *    -----
		 */
		
		System.out.println("4,5,6 겹치지 않게 채워넣기 프로그램 시작!");
		
		String[][] nArray = new String[3][3];
		nArray[0][0] = "6";
		nArray[0][2] = "4";
		nArray[1][1] = "4";
		nArray[2][1] = "6";
		nArray[2][2] = "5";
		
	}
	
}
